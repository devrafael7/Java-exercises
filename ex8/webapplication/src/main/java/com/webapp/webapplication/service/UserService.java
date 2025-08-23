package com.webapp.webapplication.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.webapp.webapplication.model.User;
import com.webapp.webapplication.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo){
        this.repo = repo;
    }

    public User register(User user){
        return repo.save(user);
    }

    public Optional<User> login(String email, String password){
        return repo.findByEmail(email)
            .filter(u -> getPassword().equals(password));
    }
}
