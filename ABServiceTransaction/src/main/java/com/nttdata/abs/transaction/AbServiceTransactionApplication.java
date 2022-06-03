package com.nttdata.abs.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import lombok.extern.log4j.Log4j2;

@Log4j2
@EnableEurekaClient
//@EnableFeignClients
@SpringBootApplication
public class AbServiceTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbServiceTransactionApplication.class, args);
		log.info("Transaction service running.");
	}

}
