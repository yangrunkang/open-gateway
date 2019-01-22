package com.open.basic.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 开放-用户服务-启动类
 * <p>All rights Reserved, Designed By YangRunkang.</p>
 * @author Yangrunkang
 * @date 2019/1/3 14:32
 */

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.open.basic.user.mapper")
public class OpenBasicUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenBasicUserApplication.class, args);
	}

}

