package com.emirates.dnata.awbenquiryservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emirates.dnata.awbenquiryservices.model.AWB;
import com.emirates.dnata.awbenquiryservices.repository.AWBEnquiryRepository;
import com.emirates.dnata.awbenquiryservices.service.dto.AWBTariff;

@Service
public class AWBEnquiryService {

	@Autowired
	private AWBEnquiryRepository awbRepo;

	@Autowired
	private AWBTariffProxy tariffProxy;

	public List<AWB> getAWBDetails(AWB awb) {

		List<AWB> awbList = awbRepo.findByAwbPrefixAndAwbNumber(awb.getAwbPrefix(), awb.getAwbNumber());
		System.out.println("awbList::" + awbList.size());
		awbList.forEach((awbDetail) -> {
			System.out.println("awbDetail.getWeight()).get(0)::" + awbDetail.getWeight());
			AWBTariff traiff = tariffProxy.getTariffCharges(awbDetail.getWeight()).get(0);
			System.out.println("AWBTariff::" + traiff);
			awbDetail.setTariff(traiff);
		});
		return awbList;
	}

}
