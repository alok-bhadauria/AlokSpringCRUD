# Spring Boot CRUD Application

## Problem Description
You are required to develop a Spring Boot application that connects to a relational database (such as PostgreSQL) using JDBC and performs CRUD operations on a single table.

---

## Functional Requirements

### 1. Entity Design
Create an entity class (Student) with the following fields:
- id (Integer, Primary Key)
- name (String)
- email (String)
- course (String)

---

### 2. Database Setup
- Create a database and a table corresponding to the entity.
- Configure database connection properties in the `application.properties` file.

---

### 3. CRUD Operations
Implement the following operations using JDBC:
- Create: Insert a new student record into the database.
- Read:
  - Fetch all student records.
  - Fetch a student by ID.
- Update: Update an existing student’s details.
- Delete: Delete a student record by ID.

---

### 4. REST API Endpoints

- POST /students → Create a student  
- GET /students → Retrieve all students  
- GET /students/{id} → Retrieve a student by ID  
- PUT /students/{id} → Update a student  
- DELETE /students/{id} → Delete a student  

---

### 5. JDBC Integration
- Use JdbcTemplate or standard JDBC APIs.
- Handle SQL queries manually (no ORM like Hibernate).

---

## Non-Functional Requirements
- Follow proper coding conventions.
- Use layered architecture (Controller, Service, Repository).

---

## Approach

The application is developed using a layered architecture to maintain separation of concerns.

- The **Controller layer** handles HTTP requests and exposes REST API endpoints.
- The **Service layer** contains the business logic and acts as an intermediary between controller and repository.
- The **Repository layer** interacts with the PostgreSQL database using JDBC for executing SQL queries.
- The **Entity class** represents the structure of the database table.

Steps followed:
1. Created PostgreSQL database and corresponding table.
2. Configured database connection in `application.properties`.
3. Implemented CRUD operations using JDBC queries.
4. Exposed REST APIs for each operation.
5. Tested endpoints using browser/Postman and verified data in database.

The application ensures clear structure, proper separation of logic, and direct interaction with the database using JDBC.