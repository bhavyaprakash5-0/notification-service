//package com.example.notification.service;
//
//public interface NotificationService {
//}


package com.example.notification.service;

import com.example.notification.dto.NotificationRequest;
import com.example.notification.model.Notification;

import java.util.List;

public interface NotificationService {
    void sendNotification(NotificationRequest request);
    List<Notification> getUserNotifications(Long userId);
}
