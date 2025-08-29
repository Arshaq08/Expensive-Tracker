# Expensive-Tracker
Expense Tracker – A full-stack application to manage personal finances with income/expense tracking, categorization, filtering, and monthly summaries.
# 💰 Expense Tracker

An Expense Tracker application built with **Java, Spring Boot, REST APIs, Maven, and Apache POI** to help users manage their personal finances efficiently.  
It provides real-time tracking of income and expenses, along with categorization, filtering, and monthly summaries.  
Data visualization and reporting are supported through **Tableau**.

---

## 🚀 Features
- 🔐 **Secure account system** with role-based access control  
- 💸 **Real-time deposit and withdrawal workflows** with validation  
- 📊 **Categorization, filtering, and summary modules** for better usability  
- 📑 **Export reports** to Excel using Apache POI  
- 📈 **Data visualization** with Tableau integration  
- ⚡ **Optimized SQL queries** and efficient UI design for smooth performance  

---

## 🛠️ Tech Stack
- **Backend**: Java, Spring Boot  
- **Build Tool**: Maven  
- **Database**: MySQL  
- **Frontend**: JSP 
- **Visualization**: Tableau  
- **Reporting**: Apache POI  

---

## 📂 Project Structure
src/
├── main/
│ ├── java/com/example/expensetracker/
│ │ ├── controller/ # REST Controllers (handle API requests)
│ │ ├── model/ # Entity classes (User, Transaction, Category)
│ │ ├── repository/ # Data access layer (Spring Data JPA Repositories)
│ │ ├── service/ # Business logic (TransactionService, UserService)
│ │ └── ExpenseTrackerApplication.java # Main entry point
│ │
│ ├── resources/
│ │ ├── application.properties # Configurations (DB, ports, etc.)
│ │ ├── static/ # CSS, JS, images
│ │ └── templates/ # JSP/Thymeleaf views
│
└── test/java/... # Unit & integration tests
