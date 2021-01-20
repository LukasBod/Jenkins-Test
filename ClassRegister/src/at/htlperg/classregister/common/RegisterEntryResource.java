package at.htlperg.classregister.common;

import at.htlperg.classregister.model.RegisterEntry;
import org.restlet.resource.Get;
import org.restlet.resource.Put;

public interface RegisterEntryResource {
    @Get("xml")
    public RegisterEntry read();

    @Put
    public void update(RegisterEntry newEntry);
}
