package at.htlperg.classregister.server;

import at.htlperg.classregister.common.SchoolResource;
import at.htlperg.classregister.data.InMemoryStore;
import at.htlperg.classregister.model.School;
import org.restlet.resource.ServerResource;

public class SchoolServerResource extends ServerResource implements SchoolResource {
    @Override
    public School read() {
        return InMemoryStore.getInstance().getSchoolData();
    }

    @Override
    public void create(School school) {
        InMemoryStore.getInstance().setSchoolData(school);
    }
}
