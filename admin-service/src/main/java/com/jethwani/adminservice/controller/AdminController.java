package com.jethwani.adminservice.controller;

import com.jethwani.adminservice.model.UserMetaData;
import com.jethwani.adminservice.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @GetMapping
    public String getAdmin(){
        return "Admin Controller";
    }

    @GetMapping("/users")
    public UserMetaData getUserDetails(){
        return adminService.getUsers();
    }
}
