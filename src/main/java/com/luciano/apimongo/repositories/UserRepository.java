package com.luciano.apimongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.luciano.apimongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
