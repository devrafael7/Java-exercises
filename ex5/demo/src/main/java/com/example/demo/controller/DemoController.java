package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class DemoController {
    
    @GetMapping("/hello")
    public String hello(){
        return "Hello world!";
    }

    @GetMapping("/greet")
    public String greet(@RequestParam String name){
        return "Hi, " + name;
    }

    @GetMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b){
        return a + b;
    }

    @PostMapping("/user")
    public String createUser(@RequestBody Map<String, String> user){
        String name = user.get("name");
        return "User: " + name + "has been created succesfully";
    }

    @GetMapping("/list")
    public List<String> listUsers(){
        return Arrays.asList("Rafa", "João", "Maria");
    }

    @PutMapping("/user/{id}")
    public String updateUser(@PathVariable int id, @RequestBody Map<String, String> user){
        String newName = user.get("name");
        return "User: " + id + " updated to: " + newName;
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable int id){
        return "User: " + id + " deleted";
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b){
        return a + b;
    }

    @GetMapping("check")
    public String checkNumber(@RequestParam int num){
        return "Number " + num + " is " + (num % 2 == 0 ? "odd" : "even");
    }

    @PostMapping("/reverse")
    public String reverse(@RequestBody Map<String, String> request){
        String text = request.get("text");
        return new StringBuilder(text).reverse().toString();
    }
}
