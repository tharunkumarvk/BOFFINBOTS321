package com.collegeclub.clubconnect.repository;

import com.collegeclub.clubconnect.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Custom Query 1: Find a user by their email
    User findByEmail(String email);

    // You can define additional custom queries or methods here if needed
}
