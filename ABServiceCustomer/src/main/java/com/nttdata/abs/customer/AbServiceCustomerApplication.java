package com.nttdata.abs.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import lombok.extern.log4j.Log4j2;

@Log4j2
@EnableEurekaClient
@SpringBootApplication
public class AbServiceCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbServiceCustomerApplication.class, args);
		log.info("Customer service running.");
	}

}
