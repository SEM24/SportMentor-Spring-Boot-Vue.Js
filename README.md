# SportMentor  
<img src="https://github.com/user-attachments/assets/854e058d-8f8d-484a-afda-a01f675e8eae" width="200" />

SportMentor is an innovative online platform for training and personal coaching. It combines a library of video lessons, online consultations, personalized training tools, and a community for users to share their experiences.

## 🚀 Features
- **User Authentication** (Keycloak-based OAuth2, JWT)
- **Training Library** (Video lessons, categorization, tags)
- **Booking System** (Schedule personal training sessions)
- **Payment Integration** (Stripe/PayPal for transactions)
- **Community Interaction** (Comments, likes, discussions)
- **Notifications System** (RabbitMQ-powered async notifications)

## 🛠 Tech Stack
### **Backend**
- Java, Spring Boot
- PostgreSQL, Hibernate (JPA)
- Keycloak (Authentication & Authorization)
- RabbitMQ (Message Broker for async tasks)
- Kafka (Event-driven communication)
- Docker & Kubernetes (Deployment & Scaling)

### **Frontend**
- Vue.js + Vite
- Vue Router, Pinia
- TailwindCSS
- Axios (API communication)

## 📦 Installation & Setup
### Prerequisites
- Java 17+
- Node.js 16+
- Docker & Docker Compose
- Kubernetes (optional for deployment)

### **Backend Setup**
```bash
# Clone the repository
git clone https://github.com/SEM24/SportMentor-Spring-Boot-Vue.Js.git
cd SportMentor/backend

# Run services with Docker Compose
docker-compose up -d

# Run Spring Boot application
./mvnw spring-boot:run
```

### **Frontend Setup**
```bash
cd ../frontend

# Install dependencies
npm install

# Run development server
npm run dev
```

## 📡 API Endpoints (Example)
```http
GET /api/trainings
```
Response:
```json
[
  {
    "id": 1,
    "title": "Strength Training Basics",
    "coach": "John Doe",
    "duration": "30 mins"
  }
]
```

## 📌Project UserStory
[SportMentor UserStory](https://github.com/users/SEM24/projects/8/views/1)
## 📢 Contribution
We welcome contributions! Please create a pull request or open an issue.

## 📬 Contact
For any questions, reach out to **samerx777222@gmail.com** or open an issue.

---
**© 2025 SportMentor. All rights reserved.**
