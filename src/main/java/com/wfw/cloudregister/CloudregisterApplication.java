package com.wfw.cloudregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudregisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudregisterApplication.class, args);
	}

}
