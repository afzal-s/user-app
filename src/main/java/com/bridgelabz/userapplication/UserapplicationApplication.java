package com.bridgelabz.userapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.bridgelabz.userapplication")
@EnableJpaRepositories("com.bridgelabz.userapplication.repository")
public class UserapplicationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(UserapplicationApplication.class, args);
		System.out.println(context.getBean(UserapplicationApplication.class));
	}

}