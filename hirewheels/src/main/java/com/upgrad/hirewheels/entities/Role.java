package com.upgrad.hirewheels.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Role")
public class Role {
    @Id
    @GeneratedValue
    @Column(name = "role_id")
    private int role_id;

    @Column(name = "role_name", length = 50, nullable = false,unique = true)
    private String role_name;

    @OneToMany(fetch = FetchType.LAZY)
    @JsonBackReference
    List<Users> usersList;

    public Role(int i, String admin) {
    }

    public Role() {

    }

    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "role_name=" + role_name +
                ", role_id='" + role_id + '\'' +
                '}';
    }
}