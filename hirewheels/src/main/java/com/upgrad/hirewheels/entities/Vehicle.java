package com.upgrad.hirewheels.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Vehicle")
public class Vehicle {
    @Id
    @GeneratedValue
    @Column(name="vehicle_id")
    private int vehicle_id;

    @Column(name="vehicle_model",length = 50, nullable = false)
    private String vehicle_model;

    @Column(name="vehicle_number",length=10)
    private String vehicle_number;

    @Column(name="color",length=50,nullable = false)
    private String color;

    @Column(name="availability_status",nullable = false)
    private int availability_status;

    @Column(name="vehicle_image_url",length = 50,nullable = false)
    private String vehicle_image_url;

    @ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinColumn(name = "vehicle_Subcategory")
    @JsonBackReference
    Vehicle_Subcategory vehicle_subcategory;

    @ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinColumn(name = "fuel_TypeId")
    @JsonBackReference
    Fuel_Type fuel_type;

    @ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinColumn(name = "locationId")
    @JsonBackReference
    Location location;

    @ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinColumn(name = "userId")
    @JsonBackReference
    Users user;

    @OneToMany(mappedBy="vehicles",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JsonBackReference
    List<Booking> bookingList;

    public Vehicle_Subcategory getVehicle_subcategory() {
        return vehicle_subcategory;
    }

    public void setVehicle_subcategory(Vehicle_Subcategory vehicle_subcategory) {
        this.vehicle_subcategory = vehicle_subcategory;
    }

    public Fuel_Type getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(Fuel_Type fuel_type) {
        this.fuel_type = fuel_type;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getVehicle_model() {
        return vehicle_model;
    }

    public void setVehicle_model(String vehicle_model) {
        this.vehicle_model = vehicle_model;
    }

    public String getVehicle_number() {
        return vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getAvailability_status() {
        return availability_status;
    }

    public void setAvailability_status(int availability_status) {
        this.availability_status = availability_status;
    }

    public String getVehicle_image_url() {
        return vehicle_image_url;
    }

    public void setVehicle_image_url(String vehicle_image_url) {
        this.vehicle_image_url = vehicle_image_url;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicle_id=" + vehicle_id +
                ", vehicle_model='" + vehicle_model + '\'' +
                ", vehicle_number='" + vehicle_number + '\'' +
                ", color='" + color + '\'' +
                ",availability_status='"+availability_status+'\''+
                ",vehicle_image_url='"+vehicle_image_url+'\''+
                ",bookingList='"+bookingList+'\''+
                '}';
    }
}