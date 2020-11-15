package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Fuel_Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelTypeDao extends JpaRepository<Fuel_Type, Integer> {
}
