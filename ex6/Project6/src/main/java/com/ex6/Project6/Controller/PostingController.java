package com.ex6.Project6.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex6.Project6.Posting;

@RestController
public class PostingController {
    
    @PostMapping("/api/posting")
    public Posting createPost(Posting posting){
        return posting;
    }
}
