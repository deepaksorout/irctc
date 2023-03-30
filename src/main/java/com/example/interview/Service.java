package com.example.interview;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    TrainRepository trainRepository;
    @Autowired
    PassengerRepository passengerRepository;
    @Autowired
    FoodOrderRepository foodOrderRepository;
    public void addPassenger(Passenger passenger){
        Passenger passenger1=new Passenger();
        passenger1.setAge(passenger.getAge());
        passenger1.setDate(passenger.getDate());
        passenger1.setGender(passenger.getGender());
        passenger1.setTicketID(passenger.getTicketID());
        passenger1.setTrainID(passenger.getTrainID());

        passengerRepository.save(passenger1);
    }
    public void addTrain(Train train){
        Train train1=new Train();
        train1.setDestination(train.getDestination());
        train1.setTrainID(train.getTrainID());
        train1.setSource(train.getSource());

        trainRepository.save(train1);
    }
    public int numberOfPassengers(String x, String y, Date date){
        List<Train> trainList=trainRepository.findbySourceAndDestination(x,y);
        List<Passenger> passengerList=new ArrayList<>();

        for(Train train:trainList){
            passengerList.add(passengerRepository.findByTrainID(train.getTrainID()));
        }
        int count=0;

        for(Passenger passenger:passengerList){
            if(passenger.getDate().equals(date)){
                count++;
            }
        }
        return count;
    }
    public int numberOfFemale(int x,int y,String d){
        List<Train> trainList=trainRepository.findByDestination(d);
        List<Passenger> passengerList=new ArrayList<>();

        for(Train train:trainList){
            passengerList.add(passengerRepository.findByTrainID(train.getTrainID()));
        }
        int count=0;
        for(Passenger passenger:passengerList){
            if( passenger.getGender().equals("male") && passenger.getAge()>=x && passenger.getAge()<=y){
                count++;
            }
        }
        return count;
    }
    public int totalPrice(Date date,int trainID){
        List<Passenger> passengerList=passengerRepository.findByDate(date);

        List<FoodOrder> foodOrders=new ArrayList<>();

        for(Passenger passenger:passengerList){
            foodOrders.add(foodOrderRepository.findByTrainID(passenger.getTrainID()));
        }
        int total=0;
        for(FoodOrder foodOrder:foodOrders){
            total+=foodOrder.getPrice();
        }
        return total;
    }
}
