package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Vehicle_Subcategory;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleSubcategoryDao extends JpaRepository<Vehicle_Subcategory, Integer> {
}
