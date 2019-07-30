package com.sda.demoworld.locations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LocationController {

    @Autowired
    LocationService locationService;

    @PostMapping("/createLoc")
    public String createLocation(@ModelAttribute("id")String id ,@ModelAttribute("name") String name){

        locationService.saveLocation(new Location(id,name));

                return "admin";
    }
}
