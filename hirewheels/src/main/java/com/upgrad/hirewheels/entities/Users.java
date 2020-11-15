package com.upgrad.hirewheels.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue
        @Column(name="user_id")
        private int user_id;

    @Column(name="firstName",length = 50, nullable = false)
        private String firstName;

    @Column(name="lastName",length=50)
        private String lastName;

    @Column(name="password",length=50,nullable = false)
        private String password;

    @Column(name="email",length=50,nullable = false,unique = true)
        private String email;

    @Column(name="mobileNo",length=10,nullable = false,unique = true)
        private String mobileNo;


    @Column(name="wallet_money",nullable = false,precision = 2)
        private float wallet_money=10000.00f;


    @ManyToOne(fetch=FetchType.LAZY)
    @JsonBackReference
    Role role;
    @OneToMany(fetch=FetchType.LAZY,mappedBy ="user",cascade=CascadeType.ALL)
    @JsonBackReference
    List<Vehicle> vehicleList;

    @OneToMany(fetch=FetchType.LAZY,mappedBy = "users")
    @JsonBackReference
    List<Booking> bookings;

    public Users(String upgrad, String admin, String s, String s1, String s2, int i, Object byRoleId) {
    }

    public Users() {

    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
//    @OneToMany(fetch=FetchType.LAZY,mappedBy = "user")
//    @JsonBackReference


    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public float getWallet_money() {
        return wallet_money;
    }

    public void setWallet_money(float wallet_money) {
        this.wallet_money = wallet_money;
    }

    @Override
    public String toString() {
        return "Users{" +
                "user_id=" + user_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", mobileNo=" + mobileNo +'\''+
                ",wallet_money="+wallet_money+'\''+
                ",role="+role+'\''+
                '}';
    }
}