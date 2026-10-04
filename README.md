# Student Dependency Injection – Spring Boot

A simple Spring Boot project demonstrating **Dependency Injection (DI)** using a `Student` and `College` example.

## Features

* Spring Boot application
* Dependency Injection using constructor injection
* Spring `@Component` annotation
* Spring IoC container
* Maven project structure

## Technologies Used

* Java
* Spring Boot
* Maven

## Project Structure

```text
src
└── main
    ├── java
    │   └── com.example.demo
    │       ├── DemoApplication.java
    │       ├── Student.java
    │       └── College.java
    └── resources
        └── application.properties
```

## How It Works

The `College` class is registered as a Spring bean using `@Component`.

The `Student` class depends on `College`. Spring automatically injects the `College` object into `Student` through the constructor.

```text
Spring Boot
    ↓
Creates College Bean
    ↓
Creates Student Bean
    ↓
Injects College into Student
    ↓
Student.study()
```

## Example Output

```text
Student is studying
College is open
```

## How to Run

Clone the repository:

```bash
git clone <your-repository-url>
```

Navigate to the project:

```bash
cd student-demo
```

Run the application:

```bash
mvn spring-boot:run
```

## Learning Objective

This project was created to understand the basics of **Spring Boot, Spring Beans, IoC, and Dependency Injection** using a simple real-world example.
