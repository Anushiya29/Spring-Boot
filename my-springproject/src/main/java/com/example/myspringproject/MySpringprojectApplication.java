package com.example.myspringproject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.myspringproject_model.User;
import com.example.myspringproject_repository.UserRepository;

@SpringBootApplication
public class MySpringprojectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MySpringprojectApplication.class, args);
	}
	@Autowired
    private UserRepository userRepository;

    @Override
    public void run(String...args) throws Exception {
        this.userRepository.save(new User("Ramesh", "Fadatare", "ramesh@gmail.com"));
        this.userRepository.save(new User("Tom", "Cruise", "tom@gmail.com"));
        this.userRepository.save(new User("Tony", "Stark", "tony@gmail.com"));
    }
}


