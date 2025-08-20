package com.ex6.Project6;

public class Posting {
    private User currentUser;
    private String title;
    private String image;

    public Posting(User currentUser, String title, String image){
        this.currentUser = currentUser;
        this.title = title;
        this.image = image;
    }

    public User getCurrentUser(){
        return currentUser;
    }

    public void setCurrentUser(User currentUser){
        this.currentUser = currentUser;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getImage(){
        return image;
    }

    public void setImage(String image){
        this.image = image;
    }
}