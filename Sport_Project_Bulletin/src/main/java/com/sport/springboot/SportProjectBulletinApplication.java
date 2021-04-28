package com.sport.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.sport.springboot.controller","com.sport.springboot.model","com.sport.springboot.repository","com.sport.springboot.service.impl"})
//@EntityScan({"com.sport.springboot.controller","com.sport.springboot.model","com.sport.springboot.repository","com.sport.springboot.service.impl"})
public class SportProjectBulletinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportProjectBulletinApplication.class, args);
	}

}
