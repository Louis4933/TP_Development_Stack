package com.example.springbootapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootapp.model.Book;
import com.example.springbootapp.service.BookService;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @CrossOrigin("http://localhost:4200")
    @RequestMapping(method = RequestMethod.GET, value="/books")
	public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @RequestMapping("/book/{id}")
    public Book getBook(@PathVariable int id){
        return bookService.getBook(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="book/{id}")
    public void deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/books")
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/book/{id}")
    public void updateBook(@RequestBody Book book, @PathVariable int id) {
        bookService.updateBook(book, id);
    }
}
