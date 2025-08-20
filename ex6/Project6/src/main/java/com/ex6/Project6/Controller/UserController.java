package com.ex6.Project6.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ex6.Project6.User;

@RestController
public class UserController {

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/api/user")
    public User createUser(@RequestBody User user){
        return user;
    }

}
