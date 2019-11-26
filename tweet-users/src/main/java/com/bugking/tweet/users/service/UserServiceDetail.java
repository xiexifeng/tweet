package com.bugking.tweet.users.service;

import com.bugking.tweet.users.dao.UserDao;
import com.bugking.tweet.users.dto.JWT;
import com.bugking.tweet.users.dto.UserLoginDTO;
import com.bugking.tweet.users.exception.UserLoginException;
import com.bugking.tweet.users.feign.AuthServiceClient;
import com.bugking.tweet.users.model.User;
import com.bugking.tweet.users.util.BPwdEncoderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.bugking.tweet.users.util.BPwdEncoderUtil.BCryptPassword;

@Service
public class UserServiceDetail {

    @Autowired
    private UserDao userRepository;
    @Autowired
    private AuthServiceClient client;


    public User insertUser(String username, String  password){
        User user=new User();
        user.setUsername(username);
        user.setPassword(BCryptPassword(password));
        return userRepository.save(user);
    }
    public UserLoginDTO login(String username, String password){
        User user=userRepository.findByUsername(username);
        if (null == user) {
            throw new UserLoginException("error username");
        }
        if(!BPwdEncoderUtil.matches(password,user.getPassword())){
            throw new UserLoginException("error password");
        }
        // 获取token
        JWT jwt=client.getToken("Basic dXNlci1zZXJ2aWNlOjEyMzQ1Ng==","password",username,password);
        // 获得用户菜单
        if(jwt==null){
            throw new UserLoginException("error internal");
        }
        UserLoginDTO userLoginDTO=new UserLoginDTO();
        userLoginDTO.setJwt(jwt);
        userLoginDTO.setUser(user);
        return userLoginDTO;

    }
}
