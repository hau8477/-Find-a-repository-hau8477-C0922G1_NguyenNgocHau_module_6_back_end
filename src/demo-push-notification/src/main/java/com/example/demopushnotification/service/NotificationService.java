package com.example.demopushnotification.service;

import com.example.demopushnotification.model.Notification;
import com.example.demopushnotification.repository.INotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService implements INotificationService{
    @Autowired
    private INotificationRepository iNotificationRepository;
    @Override
    public Notification save(Notification notification) {
        return this.iNotificationRepository.save(notification);
    }
}
