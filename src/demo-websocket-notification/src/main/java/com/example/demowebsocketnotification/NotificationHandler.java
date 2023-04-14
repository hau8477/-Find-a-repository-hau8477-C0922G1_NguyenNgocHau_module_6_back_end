package com.example.demowebsocketnotification;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;


@RestController
@CrossOrigin
public class NotificationHandler extends TextWebSocketHandler {
    @Autowired
    private SimpMessagingTemplate template;

//    @Override
//    public void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
////        ObjectMapper mapper = new ObjectMapper();
////        Notification notification = mapper.readValue(message.getPayload(), Notification.class);
//        this.template.convertAndSend("/topic/notification", notification);
//    }

    @GetMapping("/notify")
    public String getNotification() {

        // Push notifications to front-end
        template.convertAndSend("/topic/notification", "ĐÃ GỬI THÔNG BÁO");

        return "Notifications successfully sent to Angular !";
    }
}

