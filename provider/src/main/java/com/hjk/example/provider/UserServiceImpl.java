package com.hjk.example.provider;

import com.hjk.example.common.model.User;
import com.hjk.example.common.service.UserService;

/**
 * 用户服务实现类
 *
 * @author hjk
 */
public class UserServiceImpl implements UserService {

    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
