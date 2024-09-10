package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.repo.UserRepo;

import jakarta.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequestMapping("/user")
@RestController
public class UserController {
    @Resource
    UserRepo userRepo;

    @PostMapping("/register")
    public boolean register(@RequestBody User user0) {
        var email=user0.getEmail();
        if (userRepo.findById(email).isEmpty()) {
            userRepo.save(user0);
            System.err.println("1");
            return true;
        }
        System.out.println("2");
        return false;
    }
    
    @PostMapping("/login")
    public boolean login(@RequestBody User user) {
        var user0=userRepo.findById(user.getEmail());
        return (!user0.isEmpty()) && user0.get().equals(user);
    }
}
