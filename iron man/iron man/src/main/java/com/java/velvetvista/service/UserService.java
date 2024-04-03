package com.java.velvetvista.service;

import com.java.velvetvista.model.User;
import com.java.velvetvista.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User getUserById(int id) {
        Optional<User> optionalUser = userRepo.findById(id);
        return optionalUser.orElse(null);
    }

    public User createUser(User user) {
        return userRepo.save(user);
    }

    public User updateUser(int id, User user) {
        user.setId(id); // Ensure the ID is set for the entity
        return userRepo.save(user);
    }

    public void deleteUser(int id) {
        userRepo.deleteById(id);
    }
}
