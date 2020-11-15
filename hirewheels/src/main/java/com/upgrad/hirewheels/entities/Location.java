package com.upgrad.hirewheels.entities;

import org.hibernate.loader.custom.FetchReturn;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Location")
public class Location {
    @Id
    @GeneratedValue
    @Column(name = "location_id")
    private int location_id;

    @Column(name = "location_name", length = 50, nullable = false)
    private String location_name;

    @Column(name = "address", length = 100, nullable = false)
    private String address;

    @OneToMany(fetch= FetchType.LAZY,mappedBy = "location",cascade = CascadeType.ALL)
    List<Vehicle>  vehicles;
    @ManyToOne(fetch=FetchType.LAZY,cascade = CascadeType.MERGE)
    City city;

    @OneToMany(fetch= FetchType.LAZY,mappedBy = "location",cascade = CascadeType.ALL)
    List<Booking>  bookings;

    public Location(int i, String worli, String s, int i1, City city) {
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    @Column(name = "pincode",length=6)
    private String pincode;

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Location{" +
                "location_id=" + location_id +
                ", location_name='" + location_name + '\'' +
                "address=" + address +
                ", pincode='" + pincode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}