# 🛎️ Notification Service - Spring Boot Backend

This is a backend Notification Service built using Java Spring Boot as part of an internship assignment. The application allows sending and retrieving notifications for users via in-app and SMS types (email not implemented for security and demo scope).

---

## ✅ Features Implemented

- Send notifications for a specific user (`IN_APP` and `SMS` types)  
- Retrieve all notifications for a given user  
- RESTful API endpoints using Spring Boot  
- Layered architecture: Controller → Service → Repository  
- In-memory H2 database for local testing  
- DTOs used for cleaner API request/response handling  
- Scalable notification model (easily extendable to email or push)  

---

## ⚙️ Tech Stack

- Java 17  
- Spring Boot  
- Spring Data JPA  
- H2 Database  
- Maven  
- Lombok  

---

## 📦 Setup Instructions

### Step 1: Clone the Repository

```
git clone https://github.com/your-username/notification-service.git
cd notification-service
```

### Step 2: Build the Project

Make sure you have Java 17 and Maven installed.

```
./mvnw clean install
```

(Windows)

```
mvnw.cmd clean install
```

### Step 3: Run the Application

```
./mvnw spring-boot:run
```

Application will start on: `http://localhost:8080`

---

## 🚀 How to Use

### 🔔 1. Send Notification

**POST** `/notifications`

**Request Body:**

```
{
  "userId": 1,
  "message": "Welcome to the Notification Service!",
  "type": "IN_APP"
}
```

**Available types:** `"IN_APP"`, `"SMS"`

---

### 📥 2. Get All Notifications for a User

**GET** `/notifications/users/{userId}/notifications`

Example:

```
GET http://localhost:8080/notifications/users/1/notifications
```

Response:

```
[
  {
    "id": 1,
    "userId": 1,
    "message": "Welcome to the Notification Service!",
    "type": "IN_APP",
    "timestamp": "2025-05-18T10:00:00"
  }
]
```

---

## 🧪 Testing the APIs

Test APIs using:

* Postman
* cURL
* Swagger UI (if configured)

H2 Console URL: `http://localhost:8080/h2-console`  
JDBC URL: `jdbc:h2:mem:testdb`  
Username: `sa`  
Password: *(leave empty)*

---

## 📄 Folder Structure

```
src
├── main
│   ├── java
│   │   └── com.example.notification
│   │       ├── controller
│   │       ├── dto
│   │       ├── model
│   │       ├── repository
│   │       └── service
│   └── resources
│       ├── application.properties
│       └── data.sql (optional for testing data)
```

---

## 📝 Assumptions

* Email and SMS sending logic are mocked/console printed for demo purposes
* Retry and queue mechanisms are not implemented (optional)
* Easily extensible architecture for future enhancements

---

## 🙏 Acknowledgements

Built as part of an internship evaluation assignment.

---
