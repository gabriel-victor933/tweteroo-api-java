package com.api.tweteroo.api.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.api.tweteroo.api.dtos.TweetDto;
import com.api.tweteroo.api.models.TweetModel;
import com.api.tweteroo.api.models.UserModel;
import com.api.tweteroo.api.repositories.TweetsRepository;
import com.api.tweteroo.api.repositories.UsersRepository;

import jakarta.validation.Valid;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("tweets")
public class TweetsControllers {
    
    @Autowired
    private TweetsRepository tweetsRepository;
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping
    public ResponseEntity<Object> getTweets() {
        List<TweetModel> tweets = tweetsRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(tweets);
    }

    @PostMapping
    public ResponseEntity<Object> postTweet(@RequestBody @Valid TweetDto tweet) {
        Optional<UserModel> userOptinal = usersRepository.findById(Long.valueOf(tweet.getUserId()));
        if(!userOptinal.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found!");
        }
            TweetModel createdTweet = new TweetModel(tweet.getTweet(),userOptinal.get());
            tweetsRepository.save(createdTweet);

            return ResponseEntity.status(HttpStatus.CREATED).body(createdTweet);



    }
    
    @GetMapping("/user/{id}")
    public ResponseEntity<Object> getTweetsByUserId(@PathVariable Long id) {
        List<TweetModel> tweets = tweetsRepository.findTweetByUserId(id);

        return ResponseEntity.status(HttpStatus.OK).body(tweets);
    }
    
}
