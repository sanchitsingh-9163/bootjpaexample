package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository repository = context.getBean(UserRepository.class);
//		User user = new User();
		
//		user.setName("Sanchit");
//		user.setCity("Ranchi");
//		user.setStatus("Fresher");
//		
//		for saving single user
//		  User user1 =repository.save(user);
//		  
//		  System.out.println(user1);
		
		//for saving multiple rows we should use iterables.
//		User user1 = new User();
//		user1.setName("Satyajit");
//		user1.setCity("City2");
//		user1.setStatus("Professional");
//		
//		User user2 = new User();
//		user2.setName("Avinash");
//		user2.setCity("City3");
//		user2.setStatus("Highly-Professional");

//		User user3 = new User();
//		user3.setName("Aman");
//		user3.setCity("Ranchi");
//		user3.setStatus("MD");
//		
//		User user4 = new User();
//		user4.setName("Rahul");
//		user4.setCity("Ranchi");
//		user4.setStatus("Financer");
//		
//		List<User> list = List.of(user3,user4);
//		Iterable<User> resultUser = repository.saveAll(list);
//		
//		resultUser.forEach(e->{System.out.println(e);});
//		
//		
		
		//update the user with id 2
//		System.out.println("Hello");
		
		//update User data
//		Optional<User> optional=repository.findById(3);
//		User user = optional.get();
//		System.out.println(user.getName());
//		user.setName("Avinash M");
//		System.out.println(user.getName());
//		User result =repository.save(user);
//		System.out.println("Done "+result);
		
		
		//Custom finder method
		List<User> user =repository.findByName("Sanchit");
		user.forEach(e->System.out.println(e.getCity()));
		
		List<User> user2 = repository.getAll();
		user2.forEach(e->System.out.println(e.getName()));
		
	
	}

}
