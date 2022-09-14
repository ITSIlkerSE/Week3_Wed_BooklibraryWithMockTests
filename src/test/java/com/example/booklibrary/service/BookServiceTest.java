package com.example.booklibrary.service;

import com.example.booklibrary.model.Book;
import com.example.booklibrary.repository.BookDB;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class BookServiceTest {

    BookDB repoBooks = mock(BookDB.class);
    BookService serviceBooks = new BookService(repoBooks);

    @Test
    void testIfReturnsBookByIdMethodWorks() {

        //Given

        Book bookOne = new Book("Vampires", "HansWurst","23");

        String id = "3";

        when(repoBooks.getBookById(id)).thenReturn(bookOne);

        //When

        Book actual = serviceBooks.getBookByID(id);


        //Then

        assertEquals(bookOne, actual);
    }

    @Test
    void testMethodToGetAllBooksInList() {

        List<Book>bookListTest = new ArrayList<>();

        Book testBookOne = new Book("hans", "peter", "22");
        Book testBookTwo = new Book("lurch", "wurst", "24");
        Book testBookThree = new Book("siegmund", "jonas", "23");

        when(repoBooks.getAllBooks()).thenReturn((bookListTest));

        List<Book> actual = serviceBooks.getAllBooks();

        assertEquals(bookListTest, actual);
    }
}