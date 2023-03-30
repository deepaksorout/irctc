package com.example.interview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/train")
public class controller {
    @Autowired
    Service service;
    @PostMapping("/addPassenger")
    public void addPassenger(@RequestBody Passenger passenger){
        service.addPassenger(passenger);
    }
    @PostMapping("addTrain")
    public void addTrain(@RequestBody Train train){
        service.addTrain(train);
    }
    @GetMapping("/numberOfPassengers")
    public int numberOfPassengers(@RequestParam("source") String x,@RequestParam("destination") String y,@RequestParam("date") Date date){
        return service.numberOfPassengers(x,y,date);
    }
    @GetMapping("/numberOfF")
    public int numberOfF(@RequestParam("ageX") int x,@RequestParam("ageY") int y,@RequestParam("destination") String d){
        return service.numberOfFemale(x,y,d);
    }
    @GetMapping("/totalPrice")
    public int totalPrice(@RequestParam("date") Date date,@RequestParam("trainID") int trainID){
        return service.totalPrice(date,trainID);
    }
}
