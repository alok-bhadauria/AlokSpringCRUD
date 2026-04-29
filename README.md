# Spring Boot CRUD Project

## Problem Description
Develop a Spring Boot application that connects to a relational database (PostgreSQL) and performs CRUD operations on a single table.

## Functional Requirements

### 1. Entity Design
Create an entity class Student with the following fields:
- id (Integer, Primary Key)
- name (String)
- email (String)
- course (String)

### 2. Database Setup
- Create a database and a table corresponding to the entity.
- Configure database connection in application.properties.

```sql
CREATE DATABASE webalok;

CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    course VARCHAR(100)
);