package com.dvd.servicconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServiceConfigAug29Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConfigAug29Application.class, args);
	}

}
