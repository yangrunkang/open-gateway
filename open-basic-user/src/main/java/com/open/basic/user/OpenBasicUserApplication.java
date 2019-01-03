package com.open.basic.user;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 开放-用户服务-启动类
 * <p>All rights Reserved, Designed By YangRunkang.</p>
 * @author Yangrunkang
 * @date 2019/1/3 14:32
 */
@SpringBootApplication
@MapperScan("com.open.basic.user.mapper")
@EnableDubboConfiguration
public class OpenBasicUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenBasicUserApplication.class, args);
	}

}

