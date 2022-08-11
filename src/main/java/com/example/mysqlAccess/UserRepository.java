package com.example.mysqlAccess;

import org.springframework.data.repository.CrudRepository;

import com.example.mysqlAccess.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}

// The main() method uses Spring Boot’s SpringApplication.run() method to launch an application.