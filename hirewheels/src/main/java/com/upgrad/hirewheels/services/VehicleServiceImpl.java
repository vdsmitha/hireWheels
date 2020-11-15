package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.VehicleDao;
import com.upgrad.hirewheels.entities.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VehicleServiceImpl implements VehicleService {

    @Autowired
    Vehicle vehicle;

    @Autowired
    VehicleDao vehicleDao;


    @Override
    public List<Vehicle> getAllVehicle() {
        return vehicleDao.findAll();
    }
}
