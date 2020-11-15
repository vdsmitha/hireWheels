package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Fuel_Type")
public class Fuel_Type {
    @Id
    @GeneratedValue
    @Column(name = "fuel_type_id")
    private int fuel_type_id;

    @Column(name = "fuel_type", length = 50, nullable = false,unique = true)
    private String fuel_type;


    @OneToMany(fetch = FetchType.LAZY,mappedBy = "fuel_type")
    List<Vehicle> vehicles;

    public Fuel_Type(int i, String petrol) {
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public int getFuel_type_id() {
        return fuel_type_id;
    }

    public void setFuel_type_id(int fuel_type_id) {
        this.fuel_type_id = fuel_type_id;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    @Override
    public String toString() {
        return "Fuel_Type{" +
                "fuel_type_id=" + fuel_type_id +
                ", fuel_type='" + fuel_type + '\'' +
                '}';
    }
}