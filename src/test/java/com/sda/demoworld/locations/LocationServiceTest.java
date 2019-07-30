//package com.sda.demoworld.locations;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//public class LocationServiceTest {
//
//    @Test
//    public void getLocationsList() {
//    }
//
//    @Autowired
//    private LocationService locationService;
//
//    @RunWith()
//    public void TestLocationGen(){
//
//        Location loc = new Location("100","White Forest");
//
//        assertEquals("White Forest",loc.getName());
//
//        locationService.saveLocation(loc);
//
//        List<String> locNames = new ArrayList<>();
//
//        locationService.getLocationsList()
//                .forEach(location -> locNames.add(location.getName()));
//
//        assertTrue(locNames.size() >= 1);
//
//    }
//
//}