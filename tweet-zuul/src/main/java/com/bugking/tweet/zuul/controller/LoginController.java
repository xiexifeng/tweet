package com.bugking.tweet.zuul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

//    @RequestMapping("/login")
//    public boolean login(){
//        return true;
//    }

    @RequestMapping("/")
    public String root(){
        return "hello world";
    }
}
