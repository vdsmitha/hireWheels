package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Booking;
import com.upgrad.hirewheels.exception.UserAlreadyExistsException;
import jdk.jshell.execution.LoaderDelegate;

import java.time.LocalDateTime;

public interface BookingService {
    public Booking addBooking(LocalDateTime pickdate, LocalDateTime dropdate,LocalDateTime bookingDate,float amount,String location,String Vehicle,String user) throws UserAlreadyExistsException;
    }
