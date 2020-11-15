package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Vehicle_Subcategory")
public class Vehicle_Subcategory {
    @Id
    @GeneratedValue
    @Column(name = "vehicle_subcategory_id")
    private int vehicle_subcategory_id;

    @Column(name = "vehicle_subcategory_name", length = 50, nullable = false,unique = true)
    private String vehicle_subcategory_name;

    @Column(name="price_per_day",nullable = false)
    private int price_per_day;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "vehicle_subcategory",cascade = CascadeType.ALL)
    List<Vehicle> vehicleList;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="vehicle_category_id")
    Vehicle_Category vehicle_category;

    public Vehicle_Subcategory(int i, String suv, int i1, Object byVehicleCategoryId) {
    }

    public int getVehicle_subcategory_id() {
        return vehicle_subcategory_id;
    }

    public void setVehicle_subcategory_id(int vehicle_subcategory_id) {
        this.vehicle_subcategory_id = vehicle_subcategory_id;
    }

    public String getVehicle_subcategory_name() {
        return vehicle_subcategory_name;
    }

    public void setVehicle_subcategory_name(String vehicle_subcategory_name) {
        this.vehicle_subcategory_name = vehicle_subcategory_name;
    }

    public int getPrice_per_day() {
        return price_per_day;
    }

    public void setPrice_per_day(int price_per_day) {
        this.price_per_day = price_per_day;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public Vehicle_Category getVehicle_category() {
        return vehicle_category;
    }

    public void setVehicle_category(Vehicle_Category vehicle_category) {
        this.vehicle_category = vehicle_category;
    }

    @Override
    public String toString() {
        return "Vehicle_Subcategory{" +
                "vehicle_subcategory_id=" + vehicle_subcategory_id +
                ", vehicle_subcategory_name='" + vehicle_subcategory_name + '\'' +
                ", price_per_day='" + price_per_day + '\'' +
                ",vehicle_category='"+vehicle_category+'\''+
                '}';
    }
}