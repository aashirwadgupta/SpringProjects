package com.aashirwad.springsecuritydemo.controller;

import com.aashirwad.springsecuritydemo.service.UserService;
import com.aashirwad.springsecuritydemo.transformers.views.UserView;
import com.aashirwad.springsecuritydemo.utils.exceptions.UserNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<UserView> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{userId}")
    public UserView getUser(@PathVariable("userId") Long userId){
        Optional<UserView> userView = userService.getUser(userId);
        if(userView.isPresent()){
            return userView.get();
        } else{
            throw new UserNotFoundException("No user found for %s", userId);
        }
    }

    @PostMapping("/create-user")
    public UserView createUser(@RequestBody UserView userView){
        return UserView.builder().build();
    }
}
