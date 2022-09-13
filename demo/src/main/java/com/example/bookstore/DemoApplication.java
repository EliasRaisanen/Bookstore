package com.example.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bookstore.domain.Bookstore;
import com.example.bookstore.domain.BookstoreRepository;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookstoreRepository repository) {
	return (args) -> {
		
		
		Bookstore Book1 = new Bookstore("NallePuh", "Taavi", "jjj", "2000", "10");
		Bookstore Book2 = new Bookstore("Tiikeri", "Taavi", "hhh", "2010", "14");
		Bookstore Book3 = new Bookstore("Nasu", "Taavi", "zzz", "2009", "12");
		
		repository.save(Book1);
		repository.save(Book2);
		repository.save(Book3);
	};
	}

}
