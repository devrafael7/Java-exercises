package com.ex6.Project6;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class User {
    private String username;
    private int age;
    private String email;
    private String password; 

    public User(String username, int age, String email, String password) {
        this.username = username;
        this.age = age;
        this.email = email;

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        this.password = encoder.encode(password);
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public String getPassword(){
        return password;
    }
    public void setPassword(String rawPassword){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        this.password = encoder.encode(rawPassword); 
    }

}
