package com.api.tweteroo.api.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.api.tweteroo.api.repositories.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController("users")
public class UsersControllers {

    @Autowired
    private UsersRepository userRepository;
    
    @PostMapping
    public SomeEnityData postUser(@RequestBody SomeEnityData entity) {
        
        return "entity";
    }
    
}
