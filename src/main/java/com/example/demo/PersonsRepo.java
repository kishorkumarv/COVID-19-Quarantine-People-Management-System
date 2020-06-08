package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonsRepo extends MongoRepository<Persons,Integer>{

}
