package com.hjk.example.consumer;

import com.hjk.example.common.model.User;
import com.hjk.example.common.service.UserService;
import com.hjk.rpc.proxy.ServiceProxyFactory;

/**
 * 简易服务消费者示例
 *
 * @author hjk
 */
public class EasyConsumerExample {

    public static void main(String[] args) {
        // 静态代理
//        UserService userService = new UserServiceProxy();
        // 动态代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("hjk");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }
}
