package com.mannit.chatbot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mannit.chatbot.model.Uniquedelivered;


public interface Uniquedeliveredrepo extends MongoRepository<Uniquedelivered, String> {
	
	
	   @Query("{ 'timestamp' : { $regex: ?0, $options: 'i' },'phone_number': ?1 } }")
	    List<Uniquedelivered> findByDateAndPhonenumber(String date,String phone_number);
	   @Query("{ 'timestamp' : { $regex: ?0, $options: 'i' } }")
		 List<Uniquedelivered> findAllBydate(String date);
}
