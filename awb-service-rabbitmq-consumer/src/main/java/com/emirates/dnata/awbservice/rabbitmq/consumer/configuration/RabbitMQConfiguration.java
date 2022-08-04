package com.emirates.dnata.awbservice.rabbitmq.consumer.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfiguration {

	@Bean
	@Qualifier("auditQueue")
	public Queue createAuditQueue() {
		return new Queue("awb.audit.queue",false);
	}
	
	@Bean
	public DirectExchange createDirectExchange(){
		return new DirectExchange("awb.direct.exchange");
	}
	
	@Bean
	public Binding bind(@Qualifier("auditQueue") Queue queue,DirectExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with("awb.audit.routing");
	}
	
	@Bean
	public MessageConverter messageConverter() {
		return new Jackson2JsonMessageConverter();
	}
}
