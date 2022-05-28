package com.nttdata.abs.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootApplication
public class AbServiceCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbServiceCustomerApplication.class, args);
		log.info("---> Service Customer complete!!");
	}

}
