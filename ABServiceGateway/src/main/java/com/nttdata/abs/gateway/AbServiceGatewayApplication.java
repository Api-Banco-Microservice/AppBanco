package com.nttdata.abs.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import lombok.extern.log4j.Log4j2;

@Log4j2
@EnableEurekaClient
@SpringBootApplication
public class AbServiceGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbServiceGatewayApplication.class, args);
		log.info("Api Gateway running.");
	}

}
