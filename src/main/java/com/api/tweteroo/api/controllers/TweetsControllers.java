package com.api.tweteroo.api.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.api.tweteroo.api.models.TweetModel;
import com.api.tweteroo.api.repositories.TweetsRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController("tweets")
public class TweetsControllers {
    
    @Autowired
    private TweetsRepository tweetsRepository;

    @GetMapping
    public List<TweetModel> getTweets() {
        return tweetsRepository.findAll();
    }

    @PostMapping
    public SomeEnityData postTweet(@RequestBody SomeEnityData entity) {
        //TODO: process POST request
        
        return entity;
    }
    
    @GetMapping("/user/{id}")
    public List<TweetModel> getTweetsByUserId(@PathVariable Long id) {
        return tweetsRepository.findAll();
    }
    
    
}
