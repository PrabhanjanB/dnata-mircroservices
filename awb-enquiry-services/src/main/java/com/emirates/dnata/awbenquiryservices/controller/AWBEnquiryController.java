package com.emirates.dnata.awbenquiryservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emirates.dnata.awbenquiryservices.model.AWB;
import com.emirates.dnata.awbenquiryservices.service.AWBEnquiryService;

@RestController
@RequestMapping("/dnata")
public class AWBEnquiryController {
	
	@Autowired
	private AWBEnquiryService awbService;
	
	@RequestMapping("/awbEnquiry")
	public List<AWB> awbEnquiry(@RequestBody AWB awb){
		System.out.println("pfx:::"+awb.getAwbPrefix());
		System.out.println("awb number:::"+awb.getAwbNumber());
		return awbService.getAWBDetails(awb);
	}

}
