package com.mannit.chatbot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


import com.mannit.chatbot.model.Uniquesent;

public interface Uniquesentrepo extends MongoRepository<Uniquesent, String> {

	   @Query("{ 'timestamp' : { $regex: ?0, $options: 'i' },'phone_number': ?1 } }")
	    List<Uniquesent> findByDateAndPhonenumber(String date,String phone_number);
	   @Query("{ 'timestamp' : { $regex: ?0, $options: 'i' } }")
		 List<Uniquesent> findAllBydate(String date);
}
