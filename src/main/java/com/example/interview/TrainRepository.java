package com.example.interview;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TrainRepository extends JpaRepository<Train,Integer> {
    public List<Train> findbySourceAndDestination(String source,String destination);
    public List<Train> findByDestination(String d);
}

