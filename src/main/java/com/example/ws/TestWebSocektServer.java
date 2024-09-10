package com.example.ws;

import java.io.IOException;

import org.springframework.stereotype.Component;

import jakarta.websocket.OnClose;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;

@Component

@ServerEndpoint("/websocket")
public class TestWebSocektServer {
    private Session wsSession;

    @OnOpen
    public void onOpen(Session session) {
        // 处理连接建立事件
        System.out.printf("建立连接");
        wsSession = session;
    }
    @OnMessage
    public void onMessage(String message) throws IOException {
        // 处理接收到的消息
        System.out.printf("收到消息:%s", message);
        wsSession.getBasicRemote().sendText("11111");
    }
    @OnClose
    public void onClose() {
        // 处理连接关闭事件
        System.out.printf("连接断开");
    }
}

/*
 * package com.example.ws;

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

package com.example.entity.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    String name;
    Integer age;
}


 * 
 * 
*/