package at.htlperg.classregister.common;

import at.htlperg.classregister.model.SchoolClass;
import org.restlet.resource.Get;

public interface SchoolClassResource {
    @Get("xml")
    public SchoolClass read();
}
