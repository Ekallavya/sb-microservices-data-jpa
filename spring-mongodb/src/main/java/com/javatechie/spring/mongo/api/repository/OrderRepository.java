package com.javatechie.spring.mongo.api.repository;

import java.util.List;

import com.javatechie.spring.mongo.api.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface OrderRepository extends MongoRepository<User, Integer>{

	List<User> findByName(String name);

	@Query("{'Address.city':?0}")
	List<User> findByCity(String city);

}
