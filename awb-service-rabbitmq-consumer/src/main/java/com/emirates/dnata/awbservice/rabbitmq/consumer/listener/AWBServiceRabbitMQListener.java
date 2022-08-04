package com.emirates.dnata.awbservice.rabbitmq.consumer.listener;

//import java.util.concurrent.CountDownLatch;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AWBServiceRabbitMQListener {

//	private CountDownLatch latch = new CountDownLatch(1);
	
	@RabbitListener(queues = "awb.audit.queue")
	private void receiveMessage(Message mesg) {
//		latch.countDown();
		log.info("Audit Message Received--> {}",mesg.toString());
	}
}
