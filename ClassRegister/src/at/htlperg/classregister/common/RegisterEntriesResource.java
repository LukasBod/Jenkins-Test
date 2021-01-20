package at.htlperg.classregister.common;

import at.htlperg.classregister.model.RegisterEntry;
import at.htlperg.classregister.model.RegisterEntryies;
import org.restlet.resource.Get;
import org.restlet.resource.Post;

public interface RegisterEntriesResource {
    @Get("xml")
    public RegisterEntryies read();

    @Post
    public void create(RegisterEntry newEntry);
}
