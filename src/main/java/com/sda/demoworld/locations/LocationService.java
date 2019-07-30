package com.sda.demoworld.locations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public void saveLocation(Location location){

        this.locationRepository.save(location);

    }

    public List<Location> getLocationsList(){

        List<Location>locationList = new ArrayList<>(locationRepository.findAll());

        return locationList;
    }

}
