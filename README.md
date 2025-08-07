# 🛒 Ecom Storefront - Backend (SQL Version)

This is the **backend** part of an E-commerce Storefront application built using **Java**, **Spring Boot**, and **Spring Data JPA**, with a relational database such as **MySQL** or **PostgreSQL**.

It exposes RESTful APIs to manage product information, designed to connect with a frontend (e.g., React.js) for a complete e-commerce solution.

---

## 🔧 Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL / PostgreSQL
- Maven
- IntelliJ IDEA / VS Code

---

## ✨ Features

- Add, view, update, and delete products
- Relational database (SQL) integration
- RESTful APIs with proper HTTP methods
- Automatic table creation with Hibernate

---

## 🔗 REST API Endpoints

| Method | Endpoint              | Description             |
|--------|-----------------------|-------------------------|
| GET    | `/api/products`       | Get all products        |
| GET    | `/api/products/{id}`  | Get a product by ID     |
| POST   | `/api/products`       | Add a new product       |
| PUT    | `/api/products/{id}`  | Update a product        |
| DELETE | `/api/products/{id}`  | Delete a product        |

---

## ⚙️ Configuration

Update your `application.properties` file:

### For MySQL:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecomdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

------------

 Database Schema
Spring Boot and Hibernate will automatically create the required table using the entity class. No need to manually create the schema.

Example Product fields:

    private Long id;
    private String name;
    private String description;
    private String imageurl;
    private Double price;


🔮 Future Enhancements
User login/authentication

Admin panel for managing products

Swagger documentation

Docker setup
