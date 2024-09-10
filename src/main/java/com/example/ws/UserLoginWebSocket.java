package com.example.ws;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import jakarta.annotation.Resource;
import jakarta.websocket.OnClose;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;

@Component
@ServerEndpoint("/ws/userLogin")
public class UserLoginWebSocket {
    @Resource
    ObjectMapper objectMapper;


    //存email在
    public static List<String> emailList=List.of(); 
    
    @OnOpen
    public void onOpen(Session session) {
        
    }
    @OnMessage
    public void onMessage(String message, Session session){
        
        System.out.println(message);

    }

    @OnClose
    public void onClose(Session session) {
        
    }


}
