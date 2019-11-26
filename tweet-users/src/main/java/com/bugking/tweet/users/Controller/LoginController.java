package com.bugking.tweet.users.Controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class LoginController {

    public Integer login(String username, String pwd, @RequestHeader("Bear")String dd){
        return 0;
    }
}
