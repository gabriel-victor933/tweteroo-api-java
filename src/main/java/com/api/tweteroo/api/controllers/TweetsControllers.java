package com.api.tweteroo.api.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.api.tweteroo.api.models.TweetModel;
import com.api.tweteroo.api.repositories.TweetsRepository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("tweets")
public class TweetsControllers {
    
    @Autowired
    private TweetsRepository tweetsRepository;

    @GetMapping
    public ResponseEntity<Object> getTweets() {
        List<TweetModel> tweets = tweetsRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(tweets);
    }

/*     @PostMapping
    public ResponseEntity<Object> postTweet(@RequestBody @Valid TweetDto tweet) {
        //TODO: process POST request
        
        return tweet;
    }
    
    @GetMapping("/user/{id}")
    public ResponseEntity<Object> getTweetsByUserId(@PathVariable Long id) {
        List<TweetModel> tweets = tweetsRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(tweets);
    }
     */
    
}
