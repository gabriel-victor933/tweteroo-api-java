package com.api.tweteroo.api.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController("users")
public class UsersControllers {
    
    @PostMapping
    public SomeEnityData postUser(@RequestBody SomeEnityData entity) {
        
        return "entity";
    }
    
}
