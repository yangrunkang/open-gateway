package com.gateway.x.server.center;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description:
 * All rights Reserved, Designed By HQYG
 *
 * @author Yangrunkang
 * @Copyright: Copyright(C) 2016
 * @Company: HQYG
 * @CreateDate: 2019/1/22 19:33
 */
@SpringBootApplication
@EnableEurekaServer //服务注册中心
public class StartServerCenterApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(StartServerCenterApp.class).run(args);
    }
}
