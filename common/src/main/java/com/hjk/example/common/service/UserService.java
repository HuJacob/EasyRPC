package com.hjk.example.common.service;

import com.hjk.example.common.model.User;

/**
 * 用户服务
 *
 * @author hjk
 */
public interface UserService {

    /**
     * 获取用户
     *
     * @param user
     * @return
     */
    User getUser(User user);

    /**
     * 用于测试 mock 接口返回值
     *
     * @return
     */
    default short getNumber() {
        return 1;
    }
}
