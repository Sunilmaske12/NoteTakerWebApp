# NoteTaker Web Application

A simple Note Taking Web Application developed using Java Servlets, JSP, JDBC, MySQL, and Apache Tomcat. This project demonstrates the fundamentals of Java web application development, including CRUD operations and database connectivity.

## 🚀 Features

- **Add Notes:** Create and save new notes.
- **View Notes:** Display saved notes.
- **Update Notes:** Edit existing notes.
- **Delete Notes:** Remove notes when no longer needed.
- **Database Integration:** Store and manage notes using MySQL.

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java 11 | Backend development |
| Java Servlets | Handle HTTP requests |
| JSP | Dynamic web pages |
| JDBC | Database connectivity |
| MySQL | Database management |
| Maven | Dependency and build management |
| Apache Tomcat 9 | Web application server |
| HTML, CSS, JavaScript | Frontend development |

## 📁 Project Structure

```text
NoteTakerWebApp/
│
├── src/
│   └── main/
│       ├── java/
│       │   ├── servlet/
│       │   │   ├── AddNoteServlet.java
│       │   │   ├── UpdateNoteServlet.java
│       │   │   └── DeleteNoteServlet.java
│       │   │
│       │   └── dao/
│       │
│       └── webapp/
│           ├── WEB-INF/
│           │   └── web.xml
│           └── index.jsp
│
├── pom.xml
└── README.md
```

## ⚙️ Prerequisites

Make sure the following software is installed:

- JDK 11 or later
- Apache Maven 3.6+
- Apache Tomcat 9.x
- MySQL 8.x
- Eclipse or IntelliJ IDEA

## 🔧 Installation and Setup

### 1. Clone the Repository

```bash
git clone https://github.com/Sunilmaske12/NoteTakerWebApp.git
```

### 2. Open the Project

Open the cloned project in Eclipse or IntelliJ IDEA as a Maven project.

### 3. Configure MySQL

Create a MySQL database for the application.

Update your database connection details in the JDBC configuration used by the project.

```java
String url = "jdbc:mysql://localhost:3306/your_database";
String username = "your_username";
String password = "your_password";
```

Create the required notes table according to the application's DAO implementation.

### 4. Build the Project

Navigate to the project root directory and execute:

```bash
mvn clean package
```

The generated WAR file will be available inside:

```text
target/NoteTaker.war
```

### 5. Deploy on Apache Tomcat

Copy `NoteTaker.war` into the Tomcat `webapps` directory and start the Tomcat server.

### 6. Access the Application

Open your browser and navigate to:

```text
http://localhost:8080/NoteTaker/
```

Replace port `8080` with your configured Tomcat port if different.

## 📸 Screenshots

Application screenshots will be added here.

<!-- Add screenshots when available -->

## 👨‍💻 Author

**Sunil Maske**

- GitHub: [Sunilmaske12](https://github.com/Sunilmaske12)
- LinkedIn: [Sunil Maske](https://www.linkedin.com/in/sunil-maske/)

## 📌 Project Purpose

This project was developed for practice and to strengthen my understanding of Java web application development using Servlets, JSP, JDBC, Maven, and MySQL.

