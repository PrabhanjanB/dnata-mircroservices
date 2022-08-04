package com.emirates.dnata.awbcreationservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emirates.dnata.awbcreationservice.dto.AWBCreationResponse;
import com.emirates.dnata.awbcreationservice.model.AWB;
import com.emirates.dnata.awbcreationservice.service.AWBCreationService;

@RestController
@RequestMapping("/dnata")
public class AWBCreationController {


	private Logger logger = LoggerFactory.getLogger(AWBCreationController.class);
	
	@Autowired
	private Environment env;
	
	@Autowired
	private AWBCreationService awbService;
	
	@PostMapping("/createAWB")
	public AWBCreationResponse createAWB(@RequestBody AWB awbModel){
		logger.info("createAWB awb model {}",awbModel);
		AWBCreationResponse response =  awbService.createAWB(awbModel);
		response.setPort(env.getProperty("server.port"));
		logger.info("createAWB response model {}",response);
		return response;
	}
	
	@GetMapping("/hello")
	public String hello(){
		return "Hello " + env.getProperty("server.port");
	}

}
