package de.reiners.springbootjersey.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.util.StringUtils;

import de.reiners.springbootjersey.model.Greeting;

@Path("greeting")
public class GreetingResource {
    
    @GET
    @Produces("application/json")
    public Greeting getGreeting(@QueryParam("name") String name) {
        if (StringUtils.isEmpty(name)) {
            return new Greeting();
        } else {
            return new Greeting(name);
        }
    }

}
