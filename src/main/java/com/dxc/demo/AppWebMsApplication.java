package com.dxc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class AppWebMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppWebMsApplication.class, args);
	}
}
