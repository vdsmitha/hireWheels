package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "City")
public class City {
    @Id
    @GeneratedValue
    @Column(name = "city_id")
    private int city_id;

    @Column(name = "city_name", length = 50, nullable = false)
    private String city_name;

    public City(int i, String mumbai) {
    }

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

    @OneToMany(fetch=FetchType.LAZY,mappedBy="city")
        List<Location> locations;

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "City{" +
                "city_id=" + city_id +
                ", city_name='" + city_name + '\'' +
                '}';
    }
}
