package at.htlperg.classregister.server;

import at.htlperg.classregister.common.RegisterEntriesResource;
import at.htlperg.classregister.data.InMemoryStore;
import at.htlperg.classregister.model.RegisterEntry;
import at.htlperg.classregister.model.RegisterEntryies;
import at.htlperg.classregister.model.SchoolClass;

import org.restlet.data.Status;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class RegisterEntriesServerResource extends ServerResource implements RegisterEntriesResource {
    private String classID;

    @Override
    protected void doInit() throws ResourceException {
        classID = getAttribute("id");
    }

    @Override
    public RegisterEntryies read() {
        SchoolClass sc = InMemoryStore.getInstance().getSchoolClass(classID);
        if (sc != null) {
            return sc.getRegisterEntryies();
        }
        getResponse().setStatus(Status.CLIENT_ERROR_NOT_FOUND);
        return null;
    }

    @Override
    public void create(RegisterEntry newEntry) {
        SchoolClass sc = InMemoryStore.getInstance().getSchoolClass(classID);
        if (sc != null) {
            RegisterEntryies re = sc.getRegisterEntryies();
            if(re==null){
                re = new RegisterEntryies();
                sc.setRegisterEntryies(re);
            }

            // automatically generate ID
            List<RegisterEntry> entries = re.getRegisterEntry();
            Integer maxID = 1;
            if (entries.size() > 0) {
                maxID = Collections.max(entries, Comparator.comparing(RegisterEntry::getEntyrID)).getEntyrID();
            }
            newEntry.setEntyrID(++maxID);
            entries.add(newEntry);
        }
    }
}
