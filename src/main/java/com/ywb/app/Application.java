package com.ywb.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ywb")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}