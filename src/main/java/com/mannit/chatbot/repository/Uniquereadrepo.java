package com.mannit.chatbot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mannit.chatbot.model.Uniqueread;

public interface Uniquereadrepo extends MongoRepository<Uniqueread, String> {
	   @Query("{ 'timestamp' : { $regex: ?0, $options: 'i' },'phone_number': ?1 } }")
	    List<Uniqueread> findByDateAndPhonenumber(String date,String phone_number);
	   @Query("{ 'timestamp' : { $regex: ?0, $options: 'i' } }")
		 List<Uniqueread> findAllBydate(String date);
}
