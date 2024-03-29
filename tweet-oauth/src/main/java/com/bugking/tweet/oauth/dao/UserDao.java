package com.bugking.tweet.oauth.dao;

import com.bugking.tweet.oauth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
