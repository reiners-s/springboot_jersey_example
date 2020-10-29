package de.reiners.springbootjersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import de.reiners.springbootjersey.resources.GreetingResource;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(GreetingResource.class);
    }
}
