package com.example.interview;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "passenger")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int trainID;
    private int ticketID;
    private int age;
    private String gender;

    private Date date;

    public Passenger() {
    }

    public Passenger(int id, int trainID, int ticketID, int age, String gender, Date date) {
        this.id = id;
        this.trainID = trainID;
        this.ticketID = ticketID;
        this.age = age;
        this.gender = gender;
        this.date = date;
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

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
