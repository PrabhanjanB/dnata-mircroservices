package com.emirates.dnata.awbcreationservice.repository;

import org.springframework.stereotype.Repository;

import com.emirates.dnata.awbcreationservice.model.AWB;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface AWBRepository extends MongoRepository<AWB,String> {

}
