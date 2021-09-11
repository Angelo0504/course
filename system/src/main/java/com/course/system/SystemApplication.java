package com.course.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Angelo
 * @Describe 启动类
 * @date 2021/09/09
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.course.common.mapper")
@ComponentScan("com.course")
public class SystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemApplication.class, args);
	}

}
