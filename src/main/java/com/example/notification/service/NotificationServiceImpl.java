//package com.example.notification.service;
//
//public class NotificationServiceImpl {
//}


package com.example.notification.service;

import com.example.notification.dto.NotificationRequest;
import com.example.notification.model.Notification;
import com.example.notification.model.NotificationType;
import com.example.notification.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationRepository repository;

    @Override
    public void sendNotification(NotificationRequest request) {
        Notification notification = new Notification();
        notification.setUserId(request  .getUserId());
        notification.setMessage(request.getMessage());
        notification.setType(request.getType());
        notification.setSent(false);


        // Save initially
        repository.save(notification);

        // Simulate sending based on type (for now, just print)
        switch (request.getType()) {
            case EMAIL -> System.out.println("Sending Email: " + request.getMessage());
            case SMS -> System.out.println("Sending SMS: " + request.getMessage());
            case IN_APP -> System.out.println("Saving In-App notification.");
        }

        notification.setSent(true);
        repository.save(notification);
    }

    @Override
    public List<Notification> getUserNotifications(Long userId) {
        return repository.findByUserId(userId);
    }
}
