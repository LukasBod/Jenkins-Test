package at.htlperg.classregister.common;

import at.htlperg.classregister.model.School;
import org.restlet.resource.Get;
import org.restlet.resource.Post;

public interface SchoolResource {
    @Get("xml")
    public School read();

    @Post
    public void create(School school);
}
