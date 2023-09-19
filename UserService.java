package com.collegeclub.clubconnect.service;

import com.collegeclub.clubconnect.entity.User;
import com.collegeclub.clubconnect.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        // Check if the email already exists in the database
        Optional<User> existingUser = userRepository.findByEmail(user.getEmail());
        if (existingUser.isPresent()) {
            // Email already exists, you can handle it as needed (e.g., throw an exception)
            throw new IllegalArgumentException("Email already registered");
        }

        // Additional validation logic can be added here
        // For example, you can check if the user's data is valid before saving.

        // Save the user to the database
        return userRepository.save(user);
    }
}
