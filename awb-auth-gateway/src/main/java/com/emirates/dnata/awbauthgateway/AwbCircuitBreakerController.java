package com.emirates.dnata.awbauthgateway;

import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class AwbCircuitBreakerController {
	
	private AtomicInteger count = new AtomicInteger();
	
	private Logger logger = LoggerFactory.getLogger(AwbCircuitBreakerController.class);

	@GetMapping("/samplecb")
	@Retry(name = "default")
	public String sampleApi() {
		logger.info("calling sampleApi"+count.getAndIncrement());
		if(true){
			try {
				logger.info("calling sampleApi sleep");
//				Thread.sleep(60*60*60*60);
			} catch (Exception ex) {
				logger.error("sampleApi InterruptedException ::"+ex);
				ex.printStackTrace();
			}
		};
		return "simple circuit breaker";
	}
}
