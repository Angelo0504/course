package com.course.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Angelo
 * @Describe 启动类
 * @date 2021/09/09
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.course.system.mapper")
public class SystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemApplication.class, args);
	}

}
