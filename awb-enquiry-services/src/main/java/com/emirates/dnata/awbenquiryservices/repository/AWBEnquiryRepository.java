package com.emirates.dnata.awbenquiryservices.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.emirates.dnata.awbenquiryservices.model.AWB;

@Repository
public interface AWBEnquiryRepository extends MongoRepository<AWB,String>{
	
	public List<AWB> findByAwbPrefixAndAwbNumber(String awbPrefix,String awbNumber);

}
