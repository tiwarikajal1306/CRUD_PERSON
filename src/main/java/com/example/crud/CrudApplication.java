package com.example.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication            //annotation which comprises of 3 diff annotation 1. @EnableAutoConfiguraion, 2.@ComponentScan
									//@SpringBootConfiguration but it is internally using @configuration
public class CrudApplication {

	public static void main(String[] args) {

		SpringApplication.run(CrudApplication.class, args);
	}

}
