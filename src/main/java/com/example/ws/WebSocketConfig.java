package com.example.ws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@Configuration
public class WebSocketConfig {
    @Bean
    ServerEndpointExporter ServerEndpointExporter() {
        var serverEndpointExporter = new ServerEndpointExporter();
        serverEndpointExporter.setAnnotatedEndpointClasses(TestWebSocektServer.class);
        
        return serverEndpointExporter;
    }
}
