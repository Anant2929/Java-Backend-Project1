# 🎓 Student Management System

A full-fledged **Spring Boot + MySQL** based backend application for managing student records with CRUD operations.  
Built with industry-standard best practices using layered architecture.

---

## 📌 Features

- ✅ Create, Read, Update, Delete (CRUD) operations on students
- ✅ RESTful API design using Spring Boot
- ✅ MySQL database integration
- ✅ Layered Architecture (Controller → Service → Repository)
- ✅ Postman-tested endpoints
- ✅ Code structured for scalability and clarity

---

## 🛠️ Tech Stack

| Layer       | Technology         |
|-------------|--------------------|
| Backend     | Java + Spring Boot |
| Database    | MySQL              |
| ORM         | Spring Data JPA    |
| Testing     | Postman            |
| Build Tool  | Maven              |
| IDE         | IntelliJ / VS Code |

---

## 🧱 Folder Structure

student-management-system/
├── src/
│ └── main/
│ ├── java/com/anant/student_management_system/
│ │ ├── controller/ # REST Controllers
│ │ ├── model/ # Entity classes
│ │ ├── service/ # Business logic
│ │ └── repository/ # JPA Repositories
│ └── resources/
│ ├── application.properties
│ └── static/templates (optional)
├── pom.xml
└── README.md


---

## 🚀 API Endpoints

| Method | Endpoint                  | Description             |
|--------|---------------------------|-------------------------|
| GET    | `/api/students`           | Get all students        |
| GET    | `/api/students/{id}`      | Get student by ID       |
| POST   | `/api/students`           | Create new student      |
| PUT    | `/api/students/{id}`      | Update existing student |
| DELETE | `/api/students/{id}`      | Delete student by ID    |

---

## 🧪 Sample POST Body (JSON)
```json
{
  "name": "Anant Gupta",
  "email": "anant@example.com",
  "course": "ECE",
  "marks": 92
}

🙋‍♂️ Author
Made by Anant Gupta

