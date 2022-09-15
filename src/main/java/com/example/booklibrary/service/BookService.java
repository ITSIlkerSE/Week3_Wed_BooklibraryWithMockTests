package com.example.booklibrary.service;

import com.example.booklibrary.model.Book;
import com.example.booklibrary.repository.BookDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;


@Service
public class BookService {

    private BookDB repo;

    @Autowired
    public BookService(BookDB repo) {
        this.repo = repo;
    }

    public Book getBookByID(String id) {
        Book foundBook = repo.getBookById(id);

        if (foundBook == null) {

            throw new NoSuchElementException("No Book with id " + id + " was found ");
        }

        return foundBook;
    }

    public List<Book> getAllBooks() {
        List<Book> foundBooks = repo.getAllBooks();

        return foundBooks;

    }

}
