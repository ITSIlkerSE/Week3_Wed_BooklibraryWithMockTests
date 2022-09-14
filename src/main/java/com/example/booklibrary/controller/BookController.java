package com.example.booklibrary.controller;

import com.example.booklibrary.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    private BookService service;

    public BookController(BookService service){
        this.service = service;

    }


    @GetMapping(path = "/book/{id}")
    public String getId (@PathVariable String id){
        return String.valueOf(service.getBookByID(id));
    }


}
