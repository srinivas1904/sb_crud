package com.learn.springboot.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootCrudOperationsApplication extends SpringBootServletInitializer {

	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(SpringBootCrudOperationsApplication.class);
	 }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudOperationsApplication.class, args);
	}

}
