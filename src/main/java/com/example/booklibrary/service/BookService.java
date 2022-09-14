package com.example.booklibrary.service;

import com.example.booklibrary.model.Book;
import com.example.booklibrary.repository.BookDB;
import org.springframework.stereotype.Service;

import java.util.List;


@Service


public class BookService {

    private BookDB repo;

    public BookService(BookDB repo){
    this.repo = repo;
}

    public Book getBookByID(String id){
        return repo.getBookById(id);
    }

    public List<Book> getAllBooks(){

        return repo.getAllBooks();

    }

}
