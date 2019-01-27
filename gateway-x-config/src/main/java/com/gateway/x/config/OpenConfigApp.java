package com.gateway.x.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 开放配置应用
 * <p>All rights Reserved, Designed By YangRunkang.</p>
 *
 * @author runkangyang
 * @date 1/27/19 14:43
 */
@SpringBootApplication
@EnableConfigServer
public class OpenConfigApp {
    public static void main(String[] args) {
        SpringApplication.run(OpenConfigApp.class, args);
    }
}
