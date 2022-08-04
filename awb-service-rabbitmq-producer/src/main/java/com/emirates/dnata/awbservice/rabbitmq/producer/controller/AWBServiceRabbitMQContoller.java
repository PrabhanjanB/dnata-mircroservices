package com.emirates.dnata.awbservice.rabbitmq.producer.controller;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emirates.dnata.awbservice.rabbitmq.message.AWBServiceMessage;

@RestController
@RequestMapping("/dnata")
public class AWBServiceRabbitMQContoller {
	
	@Autowired
	private RabbitTemplate template;
	
	@Autowired
	private DirectExchange exchange;

	@PostMapping("/awd-auit-messsage")
	public String sendAuditMessage(@RequestBody AWBServiceMessage awbMessage) {
		template.convertAndSend(exchange.getName(),"awb.audit.routing",awbMessage);
		return "message delivered successfullyt!!!!";
	}
	
	
	@GetMapping("/awd-auit-hello")
	public String helloWorld() {
		return "Hello World!!!";
	}
}
