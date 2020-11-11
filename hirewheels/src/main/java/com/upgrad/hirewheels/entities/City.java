package com.upgrad.hirewheels.entities;


import javax.persistence.*;

public class City {
    @Id
    @GeneratedValue
    @Column(name = "city_id")
    private int city_id;

    @Column(name = "city_name", length = 50, nullable = false)
    private String city_name;

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }


    @Override
    public String toString() {
        return "City{" +
                "city_id=" + city_id +
                ", city_name='" + city_name + '\'' +
                '}';
    }

}