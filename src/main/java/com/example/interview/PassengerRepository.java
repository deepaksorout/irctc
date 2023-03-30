package com.example.interview;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
    public Passenger findByTrainID(int trainID);
    public List<Passenger> findByDate(Date date);
}
