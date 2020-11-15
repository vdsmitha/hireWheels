package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.exception.UserAlreadyExistsException;

public interface UserService {
    Users createUser(Users user) throws UserAlreadyExistsException;
    Users getUser(String email,String password) throws UserAlreadyExistsException;
}
