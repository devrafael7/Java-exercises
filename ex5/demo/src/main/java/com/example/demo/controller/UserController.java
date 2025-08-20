package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.model.User;

@RestController
@RequestMapping("myapi")
@CrossOrigin(origins =  "http://localhost:5173")
public class UserController {

    @GetMapping("/user")
    public User getUser(){
        User u1 = new User("Lucas", 19, "rafael@gmail.com");
        return u1;
    }
}
