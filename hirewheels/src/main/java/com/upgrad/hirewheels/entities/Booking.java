package com.upgrad.hirewheels.entities;



import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Booking")
public class Booking {
    @Id
    @GeneratedValue
    @Column(name="booking_id")
    private int booking_id;

    @Column(name="amount",nullable = false)
    private double amount;


    @Column(name="pickup_date",nullable = false)
    private LocalDateTime pickup_date;


    @Column(name="dropoff_date",nullable = false)
    private LocalDateTime dropoff_date;


    @Column(name="booking_date",nullable = false)
    private LocalDateTime booking_date;

    @ManyToOne(fetch=FetchType.LAZY,cascade = CascadeType.MERGE)
    Location location;

    @ManyToOne(fetch=FetchType.LAZY,cascade = CascadeType.MERGE)
    Vehicle vehicles;

    @ManyToOne(fetch=FetchType.LAZY,cascade = CascadeType.MERGE)
    Users users;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Vehicle getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle vehicles) {
        this.vehicles = vehicles;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

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
                '}';
    }
}