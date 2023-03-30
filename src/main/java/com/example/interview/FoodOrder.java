package com.example.interview;

import jakarta.persistence.*;

@Entity
@Table(name = "food")
public class FoodOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int ticketID;
    private int trainID;
    private int price;

    public FoodOrder() {
    }

    public FoodOrder(int id, int ticketID, int trainID, int price) {
        this.id = id;
        this.ticketID = ticketID;
        this.trainID = trainID;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public int getTrainID() {
        return trainID;
    }

    public void setTrainID(int trainID) {
        this.trainID = trainID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
