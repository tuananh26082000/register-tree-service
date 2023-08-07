package com.example.registertreeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegisterTreeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterTreeServiceApplication.class, args);
	}

}
