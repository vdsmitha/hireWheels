package com.upgrad.hirewheels;

import com.upgrad.hirewheels.dao.UsersDao;
import com.upgrad.hirewheels.entities.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import java.util.List;

@SpringBootApplication
public class HireWheelsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HireWheelsApplication.class, args);
		ApplicationContext context = SpringApplication.run(HireWheelsApplication.class, args);
		UsersDao userdao = context.getBean(UsersDao.class);

		Users user = new Users();
		user.setFirstName("jyothsna");
		user.setLastName("k");
		user.setEmail("jyothsna12@gmail.com");
		user.setPassword("1234456");
		user.setMobileNo("8976543210");
		user.setWallet_money(100000);

		//create 5 users and save 5 user details
		//1
		userdao.saveAll(List.of(user));

		userdao.findAll().forEach(obj -> System.out.println(obj.getFirstName() + obj.getEmail()
				+ obj.getMobileNo() + obj.getWallet_money()));

		Page<Users> page0 = userdao.findAll(PageRequest.of(0, 2));
		page0.stream().forEach(users -> System.out.println(users.getFirstName()));


		System.out.println(userdao.findByFirstNameIgnoreCase("jyothsna").getEmail());

		System.out.println(userdao.findByFirstNameOrLastNameIgnoreCase("jyothsna", "k").getEmail());

		System.out.println(userdao.findByEmailIgnoreCase("jyothsna12@gmail.com").getFirstName());
		System.out.println(userdao.findByMobileNumberIgnoreCase("2341567890").getLastName());

		//2
		userdao.saveAll(List.of(user));

		userdao.findAll().forEach(obj -> System.out.println(obj.getFirstName() + obj.getEmail()
				+ obj.getMobileNo() + obj.getWallet_money()));

		Page<Users> page1 = userdao.findAll(PageRequest.of(0, 2));
		page0.stream().forEach(users -> System.out.println(users.getFirstName()));


		System.out.println(userdao.findByFirstNameIgnoreCase("abc").getEmail());

		System.out.println(userdao.findByFirstNameOrLastNameIgnoreCase("abc", "k").getEmail());

		System.out.println(userdao.findByEmailIgnoreCase("abc@gmail.com").getFirstName());
		System.out.println(userdao.findByMobileNumberIgnoreCase("2341567980").getLastName());
		//3
		userdao.saveAll(List.of(user));

		userdao.findAll().forEach(obj -> System.out.println(obj.getFirstName() + obj.getEmail()
				+ obj.getMobileNo() + obj.getWallet_money()));

		Page<Users> page2 = userdao.findAll(PageRequest.of(0, 2));
		page0.stream().forEach(users -> System.out.println(users.getFirstName()));


		System.out.println(userdao.findByFirstNameIgnoreCase("cde").getEmail());

		System.out.println(userdao.findByFirstNameOrLastNameIgnoreCase("cde", "g").getEmail());

		System.out.println(userdao.findByEmailIgnoreCase("cde@gmail.com").getFirstName());
		System.out.println(userdao.findByMobileNumberIgnoreCase("4321567890").getLastName());

		//4

		userdao.saveAll(List.of(user));

		userdao.findAll().forEach(obj -> System.out.println(obj.getFirstName() + obj.getEmail()
				+ obj.getMobileNo() + obj.getWallet_money()));

		Page<Users> page3 = userdao.findAll(PageRequest.of(0, 2));
		page0.stream().forEach(users -> System.out.println(users.getFirstName()));


		System.out.println(userdao.findByFirstNameIgnoreCase("supriya").getEmail());

		System.out.println(userdao.findByFirstNameOrLastNameIgnoreCase("supriya", "d").getEmail());

		System.out.println(userdao.findByEmailIgnoreCase("supriya@gmail.com").getFirstName());
		System.out.println(userdao.findByMobileNumberIgnoreCase("2341576890").getLastName());

		//5
		userdao.saveAll(List.of(user));

		userdao.findAll().forEach(obj -> System.out.println(obj.getFirstName() + obj.getEmail()
				+ obj.getMobileNo() + obj.getWallet_money()));

		Page<Users> page4= userdao.findAll(PageRequest.of(0, 2));
		page0.stream().forEach(users -> System.out.println(users.getFirstName()));


		System.out.println(userdao.findByFirstNameIgnoreCase("sam").getEmail());

		System.out.println(userdao.findByFirstNameOrLastNameIgnoreCase("sam", "d").getEmail());

		System.out.println(userdao.findByEmailIgnoreCase("sam@gmail.com").getFirstName());
		System.out.println(userdao.findByMobileNumberIgnoreCase("2111576890").getLastName());
	}
}