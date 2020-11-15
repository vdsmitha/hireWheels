package com.upgrad.hirewheels.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.upgrad.hirewheels.entities.Vehicle_Category;


public interface VehicleCategoryDao extends JpaRepository<Vehicle_Category, Integer> {
}