package com.ex7.project7.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex7.project7.model.User;
import com.ex7.project7.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostMapping("/create_user")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/get_user")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
