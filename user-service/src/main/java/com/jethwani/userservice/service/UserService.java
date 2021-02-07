package com.jethwani.userservice.service;

import com.jethwani.userservice.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    public List<User> getAll() {
        return Arrays.asList(new User(1, "Amit", "jethwaniamy45@gmail.com"),
                new User(2, "Lalit", "xyz@test.com"));
    }
}
