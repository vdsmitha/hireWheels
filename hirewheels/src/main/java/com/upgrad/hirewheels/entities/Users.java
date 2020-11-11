package com.upgrad.hirewheels.entities;

import javax.persistence.*;


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
    @Column(name="role_id",nullable = false)
    private int role_id;
    @Column(name="wallet_money",nullable = false)
    private int wallet_money;

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

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public int getWallet_money() {
        return wallet_money;
    }

    public void setWallet_money(int wallet_money) {
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
                ",role_id="+role_id+'\''+
                ",wallet_money"+wallet_money+'\''+
                '}';
    }
}