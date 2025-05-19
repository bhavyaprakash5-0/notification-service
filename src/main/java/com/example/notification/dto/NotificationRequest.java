//package com.example.notification.dto;
//
//public class NotificationRequest {
//}


//package com.example.notification.dto;
//
//import com.example.notification.model.NotificationType;
//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
//public class NotificationRequest {
//    private Long userId;
//    private String message;
//    private NotificationType type;
//}

package com.example.notification.dto;

import com.example.notification.model.NotificationType;

public class NotificationRequest {
    private Long userId;
    private String message;
    private NotificationType type;

    // Getters and Setters

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NotificationType getType() {
        return type;
    }

    public void setType(NotificationType type) {
        this.type = type;
    }
}

