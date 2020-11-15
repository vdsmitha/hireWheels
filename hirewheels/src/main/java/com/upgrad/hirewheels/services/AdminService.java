package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Vehicle;

public interface AdminService {

    Vehicle registerVehicle(String vehicle_model,String vehicle_number,String color,String img_url);
}
