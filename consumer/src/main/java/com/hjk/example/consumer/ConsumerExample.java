package com.hjk.example.consumer;

import com.hjk.example.common.model.User;
import com.hjk.example.common.service.UserService;
import com.hjk.rpc.bootstrap.ConsumerBootstrap;
import com.hjk.rpc.proxy.ServiceProxyFactory;

/**
 * 服务消费者示例
 *
 * @author hjk
 */
public class ConsumerExample {

    public static void main(String[] args) {
        // 服务提供者初始化
        ConsumerBootstrap.init();

        // 获取代理
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
