package com.example.interview;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodOrderRepository extends JpaRepository<FoodOrder, Integer> {
    public FoodOrder findByTrainID(int trainID);
}
