package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.UsersDao;
import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.exception.UserAlreadyExistsException;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UsersDao usersDao;


    @Override
    public Users createUser(Users user) throws UserAlreadyExistsException {
        if(usersDao.findByEmailIIdgnoreCase(user.getEmail()).isPresent())
        {
            throw new UserAlreadyExistsException("Email Already Exists");
        }
        else if(usersDao.findByMobileNumIgnoreCase(user.getMobileNo()).isPresent())
        {
            throw new UserAlreadyExistsException("Mobile Number Already Exists");
        }

        return usersDao.save(user);
    }

    @Override
    public Users getUser(String email, String password) throws UserAlreadyExistsException {
        if(usersDao.findByEmailIgnoreCase(email)==null)
        {
            throw new UserAlreadyExistsException("User not Registered");
        }
        else
        {
            if(usersDao.findByPasswordIgnoreCase(password)==null)
            throw new UserAlreadyExistsException("Unauthorized User");
        }
        return usersDao.findByEmailIgnoreCase(email);
    }
}
