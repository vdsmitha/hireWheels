package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

public class Booking {
    @Id
    @GeneratedValue
    @Column(name="booking_id")
    private int booking_id;

    @Column(name="amount",nullable = false)
    private double amount;

    @Column(name="location_id",nullable = false)
    private int location_id;

    @Column(name="vehicle_id",nullable = false)
    private int vehicle_id;

    @Column(name="user_id",nullable = false)
    private int user_id;

    @Column(name="pickup_date",nullable = false)
    private LocalDateTime pickup_date;


    @Column(name="dropoff_date",nullable = false)
    private LocalDateTime dropoff_date;


    @Column(name="booking_date",nullable = false)
    private LocalDateTime booking_date;

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public LocalDateTime getPickup_date() {
        return pickup_date;
    }

    public void setPickup_date(LocalDateTime pickup_date) {
        this.pickup_date = pickup_date;
    }

    public LocalDateTime getDropoff_date() {
        return dropoff_date;
    }

    public void setDropoff_date(LocalDateTime dropoff_date) {
        this.dropoff_date = dropoff_date;
    }

    public LocalDateTime getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(LocalDateTime booking_date) {
        this.booking_date = booking_date;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "booking_id=" + booking_id +
                ", pickup_date='" + pickup_date + '\'' +
                ", dropoff_date='" + dropoff_date + '\'' +
                ", booking_date='" + booking_date+'\'' +
                ", amount='" + amount + '\'' +
                ", location_id=" + location_id +'\''+
                ",vehicle_id="+vehicle_id+'\''+
                ",user_id"+user_id+'\''+
                '}';
    }
}

