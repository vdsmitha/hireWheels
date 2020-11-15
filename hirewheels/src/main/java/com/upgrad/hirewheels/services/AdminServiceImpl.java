package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Vehicle;

public class AdminServiceImpl implements AdminService {
    @Override
    public Vehicle registerVehicle(String vehicle_model,String vehicle_number,String color,String img_url) {
        Vehicle v=new Vehicle();
        v.setColor(color);
        v.setVehicle_image_url(img_url);
        v.setVehicle_number(vehicle_number);
        v.setVehicle_model(vehicle_model);
        v.setAvailability_status(1);
        return v;
    }
}
