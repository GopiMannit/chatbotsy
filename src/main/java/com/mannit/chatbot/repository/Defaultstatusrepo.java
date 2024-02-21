
package com.mannit.chatbot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mannit.chatbot.model.Botsent;
import com.mannit.chatbot.model.Defaultstatus;

public interface Defaultstatusrepo extends MongoRepository<Defaultstatus, String> {
	@Query("{ 'timestamp' : { $regex: ?0, $options: 'i' } }")
	 List<Botsent> findAllBydate(String date);
}
