package com.emirates.dnata.awbcreationservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emirates.dnata.awbcreationservice.dto.AWBCreationResponse;
import com.emirates.dnata.awbcreationservice.model.AWB;
import com.emirates.dnata.awbcreationservice.repository.AWBRepository;

@Service
public class AWBCreationService {
	
	@Autowired
	private AWBEnquiryProxy awbEnquiryProxy;
	
	@Autowired
	private AWBRepository awbRepo;
	
	@Autowired
	private AWBTariffProxy awbTariff;
	
	public AWBCreationResponse createAWB(AWB awb) {
		
		AWBCreationResponse response = new AWBCreationResponse();
		
		 List<AWB> awbDetails = awbEnquiryProxy.getAWBDetails(awb);
		 
		if(awbDetails != null && awbDetails.size() > 0){
			System.out.println("Existing AWB");
			response.setAwb(awbDetails.get(0));
			response.setMessage("Existing AWB");
			return response;
		}else{
			System.out.println("New AWB Created");
			awbRepo.save(awb);
			awb.setTariff(awbTariff.getTariffCharges(awb.getWeight()).get(0));
			response.setAwb(awb);
			response.setMessage("new awb created");
			return response;
		}
		
	}
	
	

}
