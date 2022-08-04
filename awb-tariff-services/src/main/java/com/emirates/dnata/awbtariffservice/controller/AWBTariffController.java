package com.emirates.dnata.awbtariffservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emirates.dnata.awbtariffservice.model.AWBTariff;
import com.emirates.dnata.awbtariffservice.model.Charges;
import com.emirates.dnata.awbtariffservice.repository.AWBTariffRepository;

@RestController
@RequestMapping("/dnata")
public class AWBTariffController {

	private Logger logger = LoggerFactory.getLogger(AWBTariffController.class);

	@Autowired
	private AWBTariffRepository tariffRepo;

	@Autowired
	private Environment evn;

	@RequestMapping("/tariff/{awbweight}")

	public List<AWBTariff> getTariffCharges(@PathVariable("awbweight") double awbWeight) {
		logger.info("awbWeight:{}:", awbWeight);
		List<AWBTariff> tariffList = tariffRepo.findWithConditionOnWeight(awbWeight);
		for (AWBTariff tariff : tariffList) {
			tariff.setId(evn.getProperty("server.port"));
			Charges charges = tariff.getCharges();
			charges.setAirline(awbWeight * tariff.getCharges().getAirline());
			charges.setHandling(awbWeight);
			charges.setTxf(awbWeight * tariff.getCharges().getTxf());
			tariff.setTotalCost(charges.getAirline() + charges.getHandling() + charges.getTxf());
		}
		logger.info("Response tariff list tariffList:{}:", tariffList);
		return tariffList;
	}

}
