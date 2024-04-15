package com.hjk.rpc.config;

import lombok.Data;


/**
 * 配置类
 * @author hjk
 */
@Data
public class RpcConfig {

    private String name = "easy-rpc";

    private String version = "1.0";

    private String serverHost = "localhost";

    private Integer serverPort = 8080;
}
