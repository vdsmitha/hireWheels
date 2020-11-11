package com.upgrad.hirewheels.entities;

import javax.persistence.*;

public class VehicleSubcategory {

    @Id
    @GeneratedValue
    @Column(name="vehicle_subcategory_id")
    private int vehicle_subcategory_id;

    @Column(name="vehicle_subcategory_name",length = 50, nullable = false,unique = true)
    private String vehicle_subcategory_name;


    @Column(name="price_per_day")
    private int price_per_day;

    @Column(name="vehicle_category_id",nullable = false)
    private int vehicle_category_id;



    public int getVehicle_subcategory_id() {
        return vehicle_subcategory_id;
    }

    public String getVehicle_subcategory_name() {
        return vehicle_subcategory_name;
    }

    public int getPrice_per_day() {
        return price_per_day;
    }

    public int getVehicle_category_id() {
        return vehicle_category_id;
    }

    public void setVehicle_subcategory_id(int vehicle_subcategory_id) {
        this.vehicle_subcategory_id = vehicle_subcategory_id;
    }

    public void setVehicle_subcategory_name(String vehicle_subcategory_name) {
        this.vehicle_subcategory_name = vehicle_subcategory_name;
    }

    public void setPrice_per_day(int price_per_day) {
        this.price_per_day = price_per_day;
    }

    public void setVehicle_category_id(int vehicle_category_id) {
        this.vehicle_category_id = vehicle_category_id;
    }

    @Override
    public String toString() {
        return "VehicleSubcategory{" +
                "vehicle_subcategory_id=" + vehicle_subcategory_id +
                ", vehicle_subcategory_name='" + vehicle_subcategory_name + '\'' +
                ", price_per_day='" + price_per_day + '\'' +
                ", vehicle_category_id='" + vehicle_category_id + '\'' +
                '}';
    }
}