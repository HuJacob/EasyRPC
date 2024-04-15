package com.hjk.example.consumer;

import com.hjk.example.common.model.User;
import com.hjk.example.common.service.UserService;
import com.hjk.rpc.config.RpcConfig;
import com.hjk.rpc.proxy.ServiceProxyFactory;
import com.hjk.rpc.utils.ConfigUtils;

/**
 * 简易服务消费者示例
 *
 * @author hjk
 */
public class EasyConsumerExample {

    public static void main(String[] args) {
        RpcConfig rpc = ConfigUtils.loadConfig(RpcConfig.class, "rpc");
        System.out.println(rpc);
    }
}
