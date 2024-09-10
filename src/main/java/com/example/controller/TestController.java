package com.example.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.entity.test.Student;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class TestController {
    @GetMapping("/test")
    public Student testStudent() {
        System.out.println("aaa");
        return new Student("lihua",11);
    }
        
}
