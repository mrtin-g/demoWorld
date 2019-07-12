package com.sda.demoworld.hero;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface HeroRepository extends MongoRepository<Hero,String> {

    Hero findByID(String id);

}
