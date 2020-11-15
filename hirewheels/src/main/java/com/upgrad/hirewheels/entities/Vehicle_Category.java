package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Vehicle_category")
public class Vehicle_Category {
    @Id
    @GeneratedValue
    @Column(name = "vehicle_category_id")
    private int vehicle_category_id;

    @Column(name = "vehicle_category_name", length = 50, nullable = false,unique = true)
    private String vehicle_category_name;

    public Vehicle_Category(int i, String car) {
    }


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

    public List<Vehicle_Subcategory> getVehicle_subcategoryList() {
        return vehicle_subcategoryList;
    }

    public void setVehicle_subcategoryList(List<Vehicle_Subcategory> vehicle_subcategoryList) {
        this.vehicle_subcategoryList = vehicle_subcategoryList;
    }

    @OneToMany(fetch=FetchType.LAZY,mappedBy = "vehicle_category")
    List<Vehicle_Subcategory> vehicle_subcategoryList;
    @Override
    public String toString() {
        return "Vehicle_Category{" +
                "vehicle_category_id=" + vehicle_category_id +
                ", vehicle_category_name='" + vehicle_category_name + '\'' +
                '}';
    }
}