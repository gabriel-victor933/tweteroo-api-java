package com.api.tweteroo.api.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.api.tweteroo.api.dtos.UserDto;
import com.api.tweteroo.api.models.UserModel;
import com.api.tweteroo.api.repositories.UsersRepository;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("users")
public class UsersControllers {

    @Autowired
    private UsersRepository userRepository;
    
    @PostMapping
    public ResponseEntity<Object> postUser(@RequestBody @Valid UserDto user) {
        
        try {
            UserModel createdUser = userRepository.save(new UserModel(user));
            return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);

        } catch (DataIntegrityViolationException e) {
            
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Username is in use!");
        } 
    }
    
}
