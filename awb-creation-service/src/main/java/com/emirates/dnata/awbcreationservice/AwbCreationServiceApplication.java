package com.emirates.dnata.awbcreationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AwbCreationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwbCreationServiceApplication.class, args);
	}

}
