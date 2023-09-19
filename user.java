package com.collegeclub.clubconnect.entity;

import com.collegeclub.clubconnect.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User {
    private final UserRepository userRepository;

    @Autowired
    public User(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        // Check if the email is already registered
        User existingUser = userRepository.findByEmail(user.getEmail());

        if (existingUser != null) {
            // Email is already in use, return an error or handle it as needed
            throw new RuntimeException("Email is already registered");
        }

        // Save the user to the database
        return userRepository.save(user);
    }
}
