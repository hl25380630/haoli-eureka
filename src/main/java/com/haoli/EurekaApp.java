package com.haoli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;


@EnableEurekaServer
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaApp {
	public static void main(String[] args) {
		ApplicationContext eurekaApp = SpringApplication.run(EurekaApp.class,args);
	}

}
