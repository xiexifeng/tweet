package com.bugking.tweet.users.dto;

import com.bugking.tweet.users.model.User;

public class UserLoginDTO {
    private JWT jwt;
    private User user;

    public JWT getJwt() {
        return jwt;
    }

    public void setJwt(JWT jwt) {
        this.jwt = jwt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
