package com.open.basic.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.open.basic.user.mapper")
public class OpenBasicUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenBasicUserApplication.class, args);
	}

}

