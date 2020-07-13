package com.exemple.webservice.config;

import com.exemple.webservice.service.UserServiceEndpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.feature.LoggingFeature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.xml.ws.Endpoint;

@Configuration
public class WebConfiguration {

    @Bean(name=Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new  SpringBus();
    }

    @Bean
    public Endpoint endpoint(Bus bus, UserServiceEndpoint userServiceEndpoint) {
        EndpointImpl endpoint = new EndpointImpl(bus, userServiceEndpoint);
        endpoint.publish("/service/users");
        return endpoint;
    }
}
