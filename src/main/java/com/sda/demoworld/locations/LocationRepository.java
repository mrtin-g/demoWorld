package com.sda.demoworld.locations;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends MongoRepository<Location,String> {

    Location findByid(String id);

}
