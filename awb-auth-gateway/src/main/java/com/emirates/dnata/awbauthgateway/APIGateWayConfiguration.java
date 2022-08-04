package com.emirates.dnata.awbauthgateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class APIGateWayConfiguration {

	@Bean
	public RouteLocator gateWayBuilder(RouteLocatorBuilder builder) {
		
		
		return builder.routes()
				.route(p -> p.path("/awb-tariff-service/**").filters(f -> f.rewritePath("/awb-tariff-service/(?<segment>.*)", "/${segment}")).uri("lb://AWB-TARIFF-SERVICE"))
				.route(p -> p.path("/awb-enquiry-service/**").filters(f -> f.rewritePath("/awb-enquiry-service/(?<segment>.*)", "/${segment}")).uri("lb://AWB-ENQUIRY-SERVICE"))
				.route(p -> p.path("/awb-creation-service/**").filters(f -> f.rewritePath("/awb-creation-service/(?<segment>.*)", "/${segment}")).uri("lb://AWB-CREATION-SERVICE"))
				.build();
	}
}
