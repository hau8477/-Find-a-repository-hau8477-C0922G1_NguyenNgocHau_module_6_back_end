package com.example.demopushnotification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public String processMessage(String message) {
        // xử lý tin nhắn ở đây

        // Gửi lại tin nhắn cho tất cả các client đang kết nối tới endpoint "/topic/messages"
        messagingTemplate.convertAndSend("/topic/messages", message);
        return message;
    }
}

