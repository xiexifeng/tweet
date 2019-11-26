package com.bugking.tweet.users.feign;

import com.bugking.tweet.users.dto.JWT;
import org.springframework.stereotype.Component;

@Component
public class AuthServiceHystrix implements AuthServiceClient {
    @Override
    public JWT getToken(String authorization, String type, String username, String password) {
        return null;
    }
}
