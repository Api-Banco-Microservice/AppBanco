package com.nttdata.abs.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import lombok.extern.log4j.Log4j2;

@Log4j2
@EnableEurekaClient
@SpringBootApplication
public class AbServiceProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbServiceProductApplication.class, args);
		log.info("Product service running.");
	}

}
