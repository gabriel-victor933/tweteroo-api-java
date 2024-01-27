package com.api.tweteroo.api.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController("tweets")
public class TweetsControllers {
    
    @GetMapping
    public SomeData getTweets() {
        return new SomeData();
    }

    @PostMapping
    public SomeEnityData postTweet(@RequestBody SomeEnityData entity) {
        //TODO: process POST request
        
        return entity;
    }
    
    @GetMapping("/user/{id}")
    public SomeData getMethodName(@PathVariable Long id) {
        return new SomeData();
    }
    
    
}
