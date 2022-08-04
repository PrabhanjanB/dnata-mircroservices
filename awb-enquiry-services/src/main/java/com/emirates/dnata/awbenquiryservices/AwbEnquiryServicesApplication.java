package com.emirates.dnata.awbenquiryservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AwbEnquiryServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwbEnquiryServicesApplication.class, args);
	}

}
