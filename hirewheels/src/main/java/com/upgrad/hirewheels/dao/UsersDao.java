package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersDao extends JpaRepository<Users, Integer> {

//    public Optional<Users> findByUsersFirstname(String usersFirstname);
//    public Optional<Users> findByUsersFirstnameOrLastname(String =usersFirstnameOrLastname);
//    public Optional<Users> findByUsersEmail(String usersEmail);
//    public Optional<Users> findByUsersMobilenumber(String usersMobilenumber);


    public Users findByFirstNameIgnoreCase(String firstName);
    public Users findByFirstNameOrLastNameIgnoreCase(String name,String lastName);
    public Users findByEmailIgnoreCase(String email);
    public Users findByMobileNoIgnoreCase(String mobileNo);

}