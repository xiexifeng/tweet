package com.bugking.tweet.biz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/add")
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    @PostMapping("/login")
    public Integer login(String username,String pwd){
        return 1;
    }
}
