<!-- Refresher-Training -->
# Refresher-Training - Day 1

Today was my first day of DBMS training. The session focused on understanding the basics of databases and getting familiar with MySQL. Along with the theory, I practiced creating a database and performing basic SQL operations in MySQL Workbench.

## What I Learned

- Difference between Data, Information, Database and DBMS
- Why DBMS is better than the traditional File System
- Different types of DBMS
- What an RDBMS is and why it is widely used
- Difference between SQL and NoSQL databases
- Basic architecture of MySQL
- How to create a database and tables
- Basic SQL commands (DDL, DML, TCL and DCL)

## Practical Work

For today's practice, I created a database named **health_clinic_db**.

Inside the database, I created the following tables:

- Patients
- Doctors
- Specializations
- Appointments

After creating the tables, I inserted sample records and practiced different SQL operations.

The operations I performed include:

- Creating a database
- Creating tables
- Inserting records
- Updating records
- Deleting records
- Adding a new column using `ALTER TABLE`
- Dropping a column
- Renaming a table
- Viewing data using `SELECT`






# DBMS Training - Day 2
On Day 2, I continued working on the Hospital Management Database. The main focus was to improve the database design by applying normalization, creating relationships between tables, and learning how indexes improve query performance.

---

## Topics Covered

- Database Normalization (1NF, 2NF, 3NF)
- One-to-One, One-to-Many, and Many-to-Many Relationships
- Foreign Keys
- Single Column Index
- Composite Index
- Covering Index
- EXPLAIN Statement
- Creating and Managing Tables

---

## Tables Created

- Patients
- Patient_Phones
- Doctors
- Specializations
- Doctor_Specializations
- Appointments
- Billing
- Visit_History
- Rooms
- Doctor_Room

---

## What I Learned

- Created a normalized hospital database.
- Stored multiple phone numbers using a separate table.
- Connected doctors with multiple specializations using a junction table.
- Implemented one-to-one, one-to-many, and many-to-many relationships.
- Used foreign keys to maintain data integrity.
- Inserted sample records into all tables.
- Used JOIN queries to retrieve data from multiple tables.
- Learned how to analyze query performance using the `EXPLAIN` command.
- Created different types of indexes:
  - Single Column Index
  - Composite Index
  - Covering Index
- Understood how indexes help in faster data retrieval.

---

## SQL Operations Performed

- Created Database
- Created Tables
- Added Constraints
- Inserted Sample Data
- Created Relationships
- Executed JOIN Queries
- Created Indexes
- Used EXPLAIN to analyze query execution

---

## Key Learning

This session helped me understand how proper database design and indexing improve both data organization and query performance. I also learned when to use different relationships and different types of indexes in a real-world database.

---

## Output

Successfully created the Hospital Management Database with normalized tables, relationships, sample data, and indexes. Verified the database using JOIN and EXPLAIN queries.


# DBMS Training - Day 3
Topic Covered

SQL Joins, Stored Procedures & Triggers

Content Covered

SQL Joins
INNER JOIN
LEFT JOIN
RIGHT JOIN
FULL OUTER JOIN
SELF JOIN
CROSS JOIN
Multiple Table JOIN
Stored Procedures
Why Stored Procedures
Creating Procedures
Calling Procedures
IN Parameter
OUT Parameter
INOUT Parameter
Error Handling
Triggers
BEFORE INSERT
AFTER INSERT
BEFORE UPDATE
AFTER UPDATE
BEFORE DELETE
AFTER DELETE

Practical Work

Writing SQL queries using different types of JOINs
Combining data from multiple related tables
Creating and calling Stored Procedures
Working with IN, OUT and INOUT parameters
Implementing Error Handling in Stored Procedures
Creating BEFORE and AFTER Triggers
Using Triggers for data validation and business rules
Creating Audit Triggers for tracking database changes
Maintaining Visit History using Triggers
Working with the Health Clinic Database Schema





# Day 4 - Health Clinic Application

## Overview

In Day 4, I worked on the **Health Clinic Application** using Java, JDBC, and MySQL.

## What I Worked On

* Connected Java application with MySQL using JDBC.
* Implemented CRUD operations using the **DAO pattern**.
* Created DTO classes for Patient, Doctor, Appointment, Billing, etc.
* Used `PreparedStatement` for database queries.
* Implemented appointment booking and completion.
* Added billing and visit history functionality.
* Used **transactions, commit and rollback** to maintain data consistency.
* Created a console-based menu to perform different operations.


Project Structure

The project is divided into different packages so that each part has a separate responsibility.

HealthClinicApp
│
├── database
│   └── health_clinic_schema.sql
│
├── src/main/java/com/clinic
│   ├── config
│   │   └── DatabaseConnection.java
│   │
│   ├── dao
│   │   ├── PatientDAO.java
│   │   ├── PatientDAOImpl.java
│   │   ├── DoctorDAO.java
│   │   ├── DoctorDAOImpl.java
│   │   ├── SpecializationDAO.java
│   │   ├── SpecializationDAOImpl.java
│   │   ├── AppointmentDAO.java
│   │   ├── AppointmentDAOImpl.java
│   │   ├── BillingDAO.java
│   │   ├── BillingDAOImpl.java
│   │   ├── VisitHistoryDAO.java
│   │   └── VisitHistoryDAOImpl.java
│   │
│   ├── dto
│   │   ├── Patient.java
│   │   ├── Doctor.java
│   │   ├── Specialization.java
│   │   ├── Appointment.java
│   │   ├── Billing.java
│   │   └── VisitHistory.java
│   │
│   ├── service
│   │   └── AppointmentService.java
│   │
│   ├── ui
│   │   └── ConsoleMenu.java
│   │
│   └── Main.java
│
└── pom.xml

## Technologies Used

* Java
* JDBC
* MySQL
* Maven

## How to Run

1. Create the database using the SQL file provided in the project.
2. Update the MySQL username and password in the database connection class.
3. Run the project using `Main.java`.
4. Use the console menu to perform the operations.

## Learning

This task helped me understand JDBC database connectivity, DAO pattern, CRUD operations, transactions, and handling multiple database operations together.




# Day 5 - First Servlet Project

## Overview

In Day 5, I worked on a basic **Java Servlet application** using Maven and Apache Tomcat.

## What I Worked On

* Created my first Servlet using `HttpServlet`.
* Used `doGet()` to handle GET requests.
* Created a login page using HTML.
* Used `doPost()` to handle login requests.
* Added username and password validation.
* Used Servlet initialization parameters for login credentials.
* Used `RequestDispatcher` to include and forward requests.
* Created a JSP page for successful login.

## Technologies Used

* Java
* Servlet
* JSP
* HTML
* Maven
* Apache Tomcat

## How to Run

1. Open the project in IntelliJ IDEA.
2. Configure Apache Tomcat.
3. Build the project using Maven.
4. Run the project on Tomcat.
5. Open the login page and test the login functionality.

## Learning

This task helped me understand the basics of **Servlets, HTTP GET/POST requests, JSP, request forwarding, and form validation**.



## Day6
...

# Day 6 - Greetings App

This project is a simple **Spring Boot REST API** for managing greeting messages.

## Technologies Used

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database
* Maven

## Features

* Create a greeting
* Get a greeting by ID
* Get all greetings
* Update a greeting
* Delete a greeting
* H2 database integration

## API Endpoints

| Method | Endpoint            | Description        |
| ------ | ------------------- | ------------------ |
| POST   | `/greetings/create` | Create a greeting  |
| GET    | `/greetings/{id}`   | Get greeting by ID |
| GET    | `/greetings`        | Get all greetings  |
| PUT    | `/greetings/{id}`   | Update a greeting  |
| DELETE | `/greetings/{id}`   | Delete a greeting  |

## Project Structure

```text
greetingsApp
 ├── controller
 ├── entity
 ├── repository
 ├── service
 └── resources
```

## How to Run

1. Open the project in IntelliJ IDEA or Eclipse.
2. Run `GreetingsAppApplication.java`.
3. Test the APIs using Postman.
4. H2 Console is available at:

```text
/h2-console
```

## Learning

In this task, I practiced creating REST APIs using Spring Boot and learned how to connect Spring Data JPA with an H2 database. I also implemented basic CRUD operations.



## Day-7
# Contacts App

Simple Spring Boot API to save contact details (name, email, phone) to a database. Day-7 training assignment.

## Stack

Java 17, Spring Boot 4, Spring Data JPA, H2, Lombok, Maven

## How to run

```bash
./mvnw spring-boot:run
```

Windows:

```powershell
mvnw.cmd spring-boot:run
```

App runs on `http://localhost:8080`. Uses H2 in-memory DB, so no setup needed — data resets on restart.

H2 console: `http://localhost:8080/h2-console`
JDBC URL: `jdbc:h2:mem:contactsdb`, user `sa`, no password.

## API

**POST /contacts/save**

Request:
```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "phone": "9876543210"
}
```

Response:
```json
{
  "id": "1",
  "name": "John Doe",
  "email": "john@example.com",
  "phone": "9876543210"
}
```

Phone number is unique, so duplicates will fail.

## TODO

- GET/DELETE endpoints
- Input validation
- Switch to MySQL/Postgres