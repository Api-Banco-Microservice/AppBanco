package com.nttdata.abs.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import lombok.extern.log4j.Log4j2;

@Log4j2
@EnableEurekaClient
@SpringBootApplication
public class AbServiceTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbServiceTransactionApplication.class, args);
		log.info("Transaction service running.");
	}

}