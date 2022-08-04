package com.emirates.dnata.awbenquiryservices.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.emirates.dnata.awbenquiryservices.service.dto.AWBTariff;

//@FeignClient(name="awb-tariff",url="localhost:8200")
@FeignClient(name="awb-tariff-service")
public interface AWBTariffProxy {
	
	@GetMapping("/dnata/tariff/{awbweight}")
	public List<AWBTariff> getTariffCharges(@PathVariable("awbweight")double awbWeight);
}
