package com.gateway.x;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * open-gateway所有流量入口
 * <p>All rights Reserved, Designed By YangRunkang.</p>
 *
 * @author runkangyang
 * @date 2019/1/3 11:44 PM
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class GateWayXApplication {
    public static void main(String[] args) {
        SpringApplication.run(GateWayXApplication.class, args);
    }
}
