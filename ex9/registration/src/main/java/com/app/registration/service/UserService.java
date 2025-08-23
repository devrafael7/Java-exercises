package com.app.registration.service;

import org.springframework.stereotype.Service;

import com.app.registration.model.User;
import com.app.registration.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public User registerUser(User user){
        return repository.save(user);
    }
}
