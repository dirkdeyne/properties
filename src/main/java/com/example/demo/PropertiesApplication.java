package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(CurrencyProperties.class)
public class PropertiesApplication implements CommandLineRunner{
  
	public static void main(String[] args) {
		SpringApplication.run(PropertiesApplication.class, args);
	}
	
	private final CurrencyService service;
	
	PropertiesApplication(CurrencyService service){
	  this.service = service;
	}
	
	
	@Override
	public void run(String... args) throws Exception {
	  service.print();
	}
}
