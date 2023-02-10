package com.example.ui.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ui.response.UserRest;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @GetMapping(path = "/{userId}")
    public UserRest getUser(@PathVariable String userId) {
        UserRest returnValue = new UserRest();
        returnValue.setEmail("test@test.com");
        returnValue.setFirstName("Leo");
        returnValue.setLastName("Sun");

        return returnValue;
    }
}
