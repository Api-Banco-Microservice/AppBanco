package com.nttdata.abs.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.log4j.Log4j2;

@Log4j2
@EnableEurekaServer
@SpringBootApplication
public class AbServiceEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbServiceEurekaApplication.class, args);
		log.info("Eureka Server running.");
	}

}
