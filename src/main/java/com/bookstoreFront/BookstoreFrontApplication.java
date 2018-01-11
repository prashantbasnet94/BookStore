package com.bookstoreFront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.bookstoreFront"})
public class BookstoreFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreFrontApplication.class, args);
	}
}
