package com.jmall.service;

import com.jmall.common.ServerResponse;
import com.jmall.pojo.User;

/**
 * @author jackie
 * @date 2018/7/14 11:08
 */
public interface IUserService {
    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str,String type);

    ServerResponse selectQuestion(String username);
}
