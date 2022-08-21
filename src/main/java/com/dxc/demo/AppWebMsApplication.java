package com.dxc.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppWebMsApplication implements CommandLineRunner {
	
	private static Logger LOG = LoggerFactory.getLogger(AppWebMsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AppWebMsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Hello World !!!");
		
	}

}
