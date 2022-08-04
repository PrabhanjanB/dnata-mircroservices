package com.emirates.dnata.awbtariffservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.emirates.dnata.awbtariffservice.model.AWBTariff;


@Repository
public interface AWBTariffRepository extends MongoRepository<AWBTariff, String>{
	
	@Query("{$and:[{'weight.minweight':{$lt:?0}},{'weight.maxweight':{$gte:?0}}]}")
	public List<AWBTariff> findWithConditionOnWeight(double awbWeight);
}
