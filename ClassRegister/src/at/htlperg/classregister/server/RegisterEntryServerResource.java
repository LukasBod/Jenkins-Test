package at.htlperg.classregister.server;

import at.htlperg.classregister.common.RegisterEntryResource;
import at.htlperg.classregister.data.InMemoryStore;
import at.htlperg.classregister.model.RegisterEntry;
import at.htlperg.classregister.model.SchoolClass;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;

import java.util.List;

public class RegisterEntryServerResource extends ServerResource implements RegisterEntryResource {

    private String classID;
    private int entryID;

    @Override
    protected void doInit() throws ResourceException {
        classID = getAttribute("id");
        entryID = Integer.parseInt(getAttribute("entryid"));
    }

    @Override
    public RegisterEntry read() {
        SchoolClass sc = InMemoryStore.getInstance().getSchoolClass(classID);
        if (sc != null) {
            for (RegisterEntry e : sc.getRegisterEntryies().getRegisterEntry()) {
                if (e.getEntyrID() == this.entryID) {
                    return e;
                }
            }
        }
        getResponse().setStatus(Status.CLIENT_ERROR_NOT_FOUND);
        return null;
    }

    @Override
    public void update(RegisterEntry newEntry) {
        SchoolClass sc = InMemoryStore.getInstance().getSchoolClass(classID);
        if (sc != null) {
            List<RegisterEntry> entries = sc.getRegisterEntryies().getRegisterEntry();
            for (int i = 0; i < entries.size(); i++) {
                if (entries.get(i).getEntyrID() == this.entryID && newEntry.getEntyrID() == this.entryID) {
                    entries.set(i, newEntry);
                    return;
                }
            }
        }
        getResponse().setStatus(Status.CLIENT_ERROR_BAD_REQUEST);
    }

}
