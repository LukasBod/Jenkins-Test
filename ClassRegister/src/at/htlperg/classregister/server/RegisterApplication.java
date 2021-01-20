package at.htlperg.classregister.server;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class RegisterApplication extends Application {

    @Override
    public Restlet createInboundRoot() {
        Router r=new Router();
        r.attach("/class/{id}/register/{entryid}", RegisterEntryServerResource.class);
        r.attach("/class/{id}/register", RegisterEntriesServerResource.class);
        r.attach("/class/{id}", SchoolClassServerResource.class);
        r.attach("/class", SchoolServerResource.class);
        return r;
    }
}
