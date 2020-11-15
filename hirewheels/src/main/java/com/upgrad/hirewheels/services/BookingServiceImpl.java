package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.BookingDao;
import com.upgrad.hirewheels.dao.LocationDao;
import com.upgrad.hirewheels.dao.UsersDao;
import com.upgrad.hirewheels.dao.VehicleDao;
import com.upgrad.hirewheels.entities.Booking;
import com.upgrad.hirewheels.entities.Location;
import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.exception.UserAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.print.Book;
import java.time.LocalDateTime;

public class BookingServiceImpl implements BookingService {

@Autowired
public Users user;
    @Autowired
    public UsersDao userdao;

    @Autowired
    BookingDao bookingDao;
    @Autowired
    LocationDao locationdao;
    @Autowired
    VehicleDao vehicleDao;

    @Override
    public Booking addBooking(LocalDateTime pickdate, LocalDateTime dropdate, LocalDateTime bookingDate, float amount, String location, String veh, String user) throws UserAlreadyExistsException {
        Users u=userdao.findByFirstNameIgnoreCase(user);
        if(u.getWallet_money()<amount) {
            throw new UserAlreadyExistsException("Insufficient Balance. Please Check With Admin");
        }
        else
        {
            Booking book=new Booking();
            book.setAmount(amount);
            book.setBooking_date(bookingDate);
            book.setDropoff_date(dropdate);
            book.setPickup_date(pickdate);
            Vehicle v=vehicleDao.findByVehicleModelIgnoreCase(veh);
            book.setVehicles(v);
            Location l=locationdao.findByLocationName(location);
            book.setLocation(l);
            Users us=userdao.findByFirstNameIgnoreCase(user);
            book.setUsers(us);
            Booking savedbook=bookingDao.save(book);
        return savedbook;
    }
}
}
