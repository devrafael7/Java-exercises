package com.ex7.project7.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String email;
    private int age;

    public User(){}

    public User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }

    public Long getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

}
