package com.example.springbootapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.springbootapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
    
}