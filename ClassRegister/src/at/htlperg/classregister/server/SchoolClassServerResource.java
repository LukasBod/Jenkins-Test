package at.htlperg.classregister.server;

import at.htlperg.classregister.common.SchoolClassResource;
import at.htlperg.classregister.data.InMemoryStore;
import at.htlperg.classregister.model.School;
import at.htlperg.classregister.model.SchoolClass;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;

public class SchoolClassServerResource extends ServerResource implements SchoolClassResource {

    private String classID;

    @Override
    protected void doInit() throws ResourceException {
        classID = getAttribute("id");
    }

    @Override
    public SchoolClass read() {
        SchoolClass sc = InMemoryStore.getInstance().getSchoolClass(classID);
        if(sc == null){
            getResponse().setStatus(Status.CLIENT_ERROR_NOT_FOUND);
        }
        return sc;
    }
}
