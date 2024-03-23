package com.hjk.example.provider;

import com.hjk.example.common.service.UserService;
import com.hjk.rpc.registry.LocalRegistry;
import com.hjk.rpc.server.HttpServer;
import com.hjk.rpc.server.VertxHttpServer;

/**
 * 简易服务提供者示例
 *
 * @author hjk
 */
public class EasyProviderExample {

    public static void main(String[] args) {
        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        // 启动 web 服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
