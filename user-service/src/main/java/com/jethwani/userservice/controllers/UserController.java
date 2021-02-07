package com.jethwani.userservice.controllers;

import com.jethwani.userservice.model.UserMetaData;
import com.jethwani.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("users")
    public UserMetaData getUser() {
        UserMetaData userMetaData=new UserMetaData();
        userMetaData.setUsers(userService.getAll());
        return userMetaData;
    }
}

