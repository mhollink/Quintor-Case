package nl.quintor.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "artist" path)
 */
@Path("artist")
public class ArtistResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("{id}")
    @Produces(MediaType.TEXT_HTML)
    public String getIt(@PathParam("id") String id) {
        return String.format("Got %s!", id);
    }
}
