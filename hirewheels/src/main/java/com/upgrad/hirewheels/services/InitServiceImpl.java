package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.*;
import com.upgrad.hirewheels.entities.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitServiceImpl implements InitService {
    @Autowired
    RoleDao roleDao;

    @Autowired
    UsersDao usersDao;

    @Autowired
    Vehicle_CategoryDao vehicle_categoryDao;

    @Autowired
    Vehicle_SubcategoryDao vehicle_subcategoryDao;

    @Autowired
    CityDao cityDAO;

    @Autowired
    Fuel_TypeDao fuelTypeDAO;

    @Autowired
    LocationDao locationDAO;

    public void start() {
        addUserRole();
        addUsers();
        addVehicleCategory();
        addVehicleSubCategory();
        addCity();
        addFuelType();
        addLocation();
    }

    private void addLocation() {
        Location location = new Location(1, "Worli",
                "Dr E Moses Rd, Worli Naka, Upper Worli",400018,cityDAO.findById(1).get());
        locationDAO.save(location);
        location = new Location(2, "Chembur",
                "Optic Complex",400019,cityDAO.findById(1).get());
        locationDAO.save(location);
        location = new Location(3, "Powai",
                "Hiranandani Tower",400020,cityDAO.findById(1).get());
        locationDAO.save(location);
    }

    private void addFuelType() {
        List<Fuel_Type> fuelTypeList = Arrays.asList(new Fuel_Type(1,"Petrol"), new Fuel_Type(2, "Diesel"));
        fuelTypeDAO.saveAll(fuelTypeList);
    }

    private void addCity() {
        cityDAO.save(new City(1,"Mumbai"));
    }

    private void addVehicleCategory() {
        List<Vehicle_Category> vehicleCategoryList = Arrays.asList(new Vehicle_Category(10, "CAR"),
                new Vehicle_Category(11,"BIKE"));
        vehicle_categoryDao.saveAll(vehicleCategoryList);
    }

    private void addVehicleSubCategory() {
        List<Vehicle_Subcategory> vehicleSubCategories = new ArrayList<>();

        vehicleSubCategories.add(new Vehicle_Subcategory(1, "SUV",
                300,vehicle_categoryDao.findByVehicleCategoryId(10) ));

        vehicleSubCategories.add(new Vehicle_Subcategory(2, "SEDAN",
                350,vehicle_categoryDao.findByVehicleCategoryId(10) ));

        vehicleSubCategories.add(new Vehicle_Subcategory(3, "HATCHBACK",
                250,vehicle_categoryDao.findByVehicleCategoryId(10) ));

        vehicleSubCategories.add(new Vehicle_Subcategory(4, "CRUISER",
                200,vehicle_categoryDao.findByVehicleCategoryId(11) ));

        vehicleSubCategories.add(new Vehicle_Subcategory(5, "DIRT BIKE",
                200,vehicle_categoryDao.findByVehicleCategoryId(11) ));

        vehicleSubCategories.add(new Vehicle_Subcategory(6, "SPORTS BIKE",
                150,vehicle_categoryDao.findByVehicleCategoryId(11) ));

        vehicle_subcategoryDao.saveAll(vehicleSubCategories);
    }

    private void addUserRole() {

        List<Role> userRoleList = Arrays.asList(new Role(1, "Admin"),
                new Role(2,"User"));
        roleDao.saveAll(userRoleList);
    }


    private void addUsers() {
        Users adminUser = new Users("Upgrad","Admin","admin@123","upgrad@gmail.com",
                "9999999999", 10000,roleDao.findByRoleId(1));
        usersDao.save(adminUser);
    }

}

