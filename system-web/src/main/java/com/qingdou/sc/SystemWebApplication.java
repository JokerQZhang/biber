package com.qingdou.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SystemWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemWebApplication.class, args);
	}
}
