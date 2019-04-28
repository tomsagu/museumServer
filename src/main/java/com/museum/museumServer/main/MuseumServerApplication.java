package com.museum.museumServer.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@SpringBootApplication
public class MuseumServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuseumServerApplication.class, args);
		System.out.println("Server is running!");
	}

}
