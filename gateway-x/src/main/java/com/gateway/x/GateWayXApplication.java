package com.gateway.x;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * open-gateway所有流量入口
 * <p>All rights Reserved, Designed By YangRunkang.</p>
 * @author runkangyang
 * @date 2019/1/3 11:44 PM
 */
@SpringBootApplication
@EnableDubboConfiguration
public class GateWayXApplication {
    public static void main(String[] args) {
        SpringApplication.run(GateWayXApplication.class,args);
    }
}
