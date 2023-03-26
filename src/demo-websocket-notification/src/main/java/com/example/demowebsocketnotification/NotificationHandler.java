//package com.example.demowebsocketnotification;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.messaging.simp.SimpMessagingTemplate;
//import org.springframework.stereotype.Component;
//import org.springframework.web.socket.TextMessage;
//import org.springframework.web.socket.WebSocketSession;
//import org.springframework.web.socket.handler.TextWebSocketHandler;
//
//import java.io.IOException;
//
//@Component
//public class NotificationHandler extends TextWebSocketHandler {
//    private final SimpMessagingTemplate template;
//
//    @Autowired
//    public NotificationHandler(SimpMessagingTemplate template) {
//        this.template = template;
//    }
//
//    @Override
//    public void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
//        ObjectMapper mapper = new ObjectMapper();
//        Notification notification = mapper.readValue(message.getPayload(), Notification.class);
//        this.template.convertAndSend("/topic/notification", notification);
//    }
//}
//
