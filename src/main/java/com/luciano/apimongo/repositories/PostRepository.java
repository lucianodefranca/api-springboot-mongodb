package com.luciano.apimongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.luciano.apimongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}