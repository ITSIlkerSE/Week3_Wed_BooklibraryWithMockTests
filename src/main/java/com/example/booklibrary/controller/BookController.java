package com.example.booklibrary.controller;

import com.example.booklibrary.model.Book;
import com.example.booklibrary.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private BookService service;

    public BookController(BookService service){
        this.service = service;

    }

    @GetMapping
    public List<Book> getAllBooks (){
        List<Book> foundBooks = service.getAllBooks();

        return foundBooks;
    }


    @GetMapping(path = "{id}")
    public Book getBookById (@PathVariable String id){

        Book foundBook = service.getBookByID(id);

        return foundBook;
    }


}
