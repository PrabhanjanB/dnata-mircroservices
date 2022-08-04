package com.emirates.dnata.awbservice.rabbitmq.producer.configuration;

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

	/**
	 * 
	 * @return Audit Queue
	 */
	@Bean
	@Qualifier("auditQueue")
	Queue createAWBAuditQueue() {
		return new Queue("awb.audit.queue",false);
	}
	
	/**
	 * 
	 * @return JOB Queue
	 */
	@Bean
	@Qualifier("jobQueue")
	Queue createAWBJobQueue() {
		return new Queue("awb.job.queue",false);
	}
	
	/**
	 * 
	 * @return Audit DirectExchange
	 */
	@Bean
	DirectExchange createAWBAuditDirectExchange() {
		return new DirectExchange("awb.direct.exchange");
	}
	
	/**
	 * 
	 * @param queue
	 * @param exchange
	 * @return Binding
	 */
	@Bean
	@Qualifier("auditRouting")
	Binding awbAuditBinding(@Qualifier("auditQueue") Queue queue,DirectExchange exchange ) {
		return BindingBuilder.bind(queue).to(exchange).with("awb.audit.routing");
	}
	
	/**
	 * 
	 * @param queue
	 * @param exchange
	 * @return Binding
	 */
	@Bean
	@Qualifier("jobRouting")
	Binding awbJOBBinding(@Qualifier("jobQueue") Queue queue,DirectExchange exchange){
		return BindingBuilder.bind(queue).to(exchange).with("awb.job.routing");
	}
	
	/**
	 * 
	 * @return
	 */
	@Bean
	MessageConverter messageConvertor(){
		return new Jackson2JsonMessageConverter();
	}
}
