package org.acme;

import io.reactiverse.contextual.logging.ContextualData;
import io.smallrye.mutiny.Uni;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    private static Logger logger = LogManager.getLogger(GreetingResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Uni<String> hello() {
        ContextualData.put("requestId", "TEST_REQUEST_1");
        ContextualData.put("code", "TEST_CODE_1");
        logger.info("Logging test");
        return Uni.createFrom().item("UNI");
    }
}