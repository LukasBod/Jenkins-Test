package at.htlperg.classregister;

import at.htlperg.classregister.data.InMemoryStore;
import at.htlperg.classregister.model.School;
import at.htlperg.classregister.server.RegisterApplication;
import org.restlet.Component;
import org.restlet.data.Protocol;
import org.restlet.Server;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.InputStream;

public class RegisterServer {
    public static void main(String[] args) throws Exception {
        Component component = new Component();
        component.getDefaultHost().attach("/api", new RegisterApplication());

        Server server = new Server(Protocol.HTTP, 8888, component);

        // init with data from file
        JAXBContext jaxbContext = JAXBContext.newInstance( School.class );
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        InputStream inStream = new FileInputStream( "data.xml" );
        School school = (School) jaxbUnmarshaller.unmarshal( inStream );

        InMemoryStore.getInstance().setSchoolData(school);

        server.start();
    }
}
