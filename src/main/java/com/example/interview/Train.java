package com.example.interview;

import jakarta.persistence.*;

@Entity
@Table(name = "train")
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int trainID;
    private String source;
    private String destination;

    public Train() {
    }

    public Train(int id, int trainID, String source, String destination) {
        this.id = id;
        this.trainID = trainID;
        this.source = source;
        this.destination = destination;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrainID() {
        return trainID;
    }

    public void setTrainID(int trainID) {
        this.trainID = trainID;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
