package com.jk.spring.servicediscoveryservereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceDiscoveryClientEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryClientEurekaApplication.class, args);
	}

}
