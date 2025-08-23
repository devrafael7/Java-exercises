package com.webapp.webapplication.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.webapplication.model.User;
import com.webapp.webapplication.service.UserService;

@RestController
@RequestMapping
public class AuthController {
    private final UserService userService;

    public AuthController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/login")
    public Optional<User> login(@RequestBody User user){
        return userService.login(user.getEmail(), user.getPassword);
    }
}
