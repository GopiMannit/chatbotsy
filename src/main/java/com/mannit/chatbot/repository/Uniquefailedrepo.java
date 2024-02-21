package com.mannit.chatbot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.mannit.chatbot.model.Uniquefailed;

public interface Uniquefailedrepo extends MongoRepository<Uniquefailed, String> {
	
	   @Query("{ 'timestamp' : { $regex: ?0, $options: 'i' },'phone_number': ?1 } }")
	    List<Uniquefailed> findByDateAndPhonenumber(String date,String phone_number);
	   @Query("{ 'timestamp' : { $regex: ?0, $options: 'i' } }")
		 List<Uniquefailed> findAllBydate(String date);

}
