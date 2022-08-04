package com.emirates.dnata.awbcreationservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.emirates.dnata.awbcreationservice.model.AWB;

//@FeignClient(name="awb-enquiry",url="localhost:8100")
@FeignClient(name="awb-enquiry-service")
public interface AWBEnquiryProxy {
	
	@GetMapping("/dnata/awbEnquiry")
	public  List<AWB> getAWBDetails(AWB awb);

}
