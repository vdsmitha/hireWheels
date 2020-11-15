package com.upgrad.hirewheels;

import com.upgrad.hirewheels.dao.RoleDao;
import com.upgrad.hirewheels.dao.UsersDao;
import com.upgrad.hirewheels.entities.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import com.upgrad.hirewheels.entities.Role;


import java.util.List;

@SpringBootApplication
public class HireWheelsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HireWheelsApplication.class, args);
		ApplicationContext context = SpringApplication.run(HireWheelsApplication.class, args);
		UsersDao userdao = context.getBean(UsersDao.class);


		Users user1=new Users();
		user1.setFirstName("smitha");
		user1.setLastName("V S");
		user1.setEmail("smitha@gmail.com");
		user1.setPassword("1111111");
		user1.setMobileNo("9870654321");
		user1.setWallet_money(100000);


		// fill the below user entity with different data
//
		Users user2 = new Users();
		user2.setFirstName("jyothsna");
		user2.setLastName("k");
		user2.setEmail("jyothsna@gmail.com");
		user2.setPassword("1234456");
		user2.setMobileNo("8944443210");
		user2.setWallet_money(100000);

		Users user3 = new Users();
		user3.setFirstName("jyothsna");
		user3.setLastName("k");
		user3.setEmail("jyo12@gmail.com");
		user3.setPassword("1234456");
		user3.setMobileNo("897666210");
		user3.setWallet_money(100000);

		Users user4 = new Users();
		user4.setFirstName("jyothsna");
		user4.setLastName("k");
		user4.setEmail("jyothsna2@gmail.com");
		user4.setPassword("1234456");
		user4.setMobileNo("897664210");
		user4.setWallet_money(100000);

		//create 5 users and save 5 user details
		//1
		userdao.saveAll(List.of(user1,user2,user3,user4));


		userdao.findAll().forEach(obj -> System.out.println(obj.getFirstName() + obj.getEmail()
				+ obj.getMobileNo() + obj.getWallet_money()));

		Page<Users> page0 = userdao.findAll(PageRequest.of(0, 2));
		page0.stream().forEach(users -> System.out.println(users.getFirstName()));


		System.out.println(userdao.findByFirstNameIgnoreCase("jyothsna").getEmail());

		System.out.println(userdao.findByFirstNameOrLastNameIgnoreCase("jyothsna", "k").getEmail());

		System.out.println(userdao.findByEmailIgnoreCase("jyothsna2@gmail.com").getFirstName());
		System.out.println(userdao.findByMobileNoIgnoreCase("897664210").getLastName());


		Role admin=new Role();
		Role users=new Role();

		RoleDao roleDao = context.getBean(RoleDao.class);

		admin.setRole_name("Admin");
		users.setRole_name("User");

		roleDao.save(admin);
		roleDao.save(users);
		String roleName=admin.getRole_name();
		String roleName2=users.getRole_name();
		System.out.println(roleName+" "+roleName2);

		//setting first User as Admin
		user1.setRole(admin);

		//setting all four user as user
		user1.setRole(users);
		user2.setRole(users);
		user3.setRole(users);
		user4.setRole(users);

		userdao.saveAll(List.of(user2,user3,user4));

	}
}