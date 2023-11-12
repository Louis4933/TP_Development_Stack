package com.example.springbootapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.springbootapp.model.Book;
import com.example.springbootapp.repository.BookRepository;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

	@Bean
    public CommandLineRunner initializeDB(BookRepository repository) {
        return (args) -> {
            // save a few books
            repository.save(new Book(1, "Book1", 10));
            repository.save(new Book(2, "Book2", 15));
            repository.save(new Book(3, "Book3", 20));
        };
    }

}