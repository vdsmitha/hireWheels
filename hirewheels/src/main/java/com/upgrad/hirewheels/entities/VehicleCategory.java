package com.upgrad.hirewheels.entities;

import javax.persistence.*;

public class VehicleCategory {

    @Id
    @GeneratedValue
    @Column(name="vehicle_category_id")
    private int vehicle_category_id;

    @Column(name="vehicle_subcategory_name",length = 50, nullable = false)
    private String vehicle_category_name;

    public int getVehicle_category_id() {
        return vehicle_category_id;
    }

    public void setVehicle_category_id(int vehicle_category_id) {
        this.vehicle_category_id = vehicle_category_id;
    }

    public String getVehicle_category_name() {
        return vehicle_category_name;
    }

    public void setVehicle_category_name(String vehicle_category_name) {
        this.vehicle_category_name = vehicle_category_name;
    }

    @Override
    public String toString() {
        return "VehicleCategory{" +
                "vehicle_category_id=" + vehicle_category_id +
                ", vehicle_category_name='" + vehicle_category_name + '\'' +

                '}';
    }
}