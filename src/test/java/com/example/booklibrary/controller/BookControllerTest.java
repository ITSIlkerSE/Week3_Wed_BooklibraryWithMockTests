package com.example.booklibrary.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getAllBooks_MustReturnAllBooks() throws Exception {

        //Given
        String expectJson = """
                             
                   [
                       {
                           "title": "Hans im Glück",
                           "author": "Jacob Grimm",
                           "id": "1"
                       },
                       {
                           "title": "Java ist auch eine Insel",
                           "author": "Christian Ullenboom",
                           "id": "2"
                       },
                       {
                           "title": "Die besten Flachwitze für Coaches",
                           "author": "Dominic",
                           "id": "3"
                       }
                   ]
                             
                """;


        //When & Then
        mockMvc.perform(get("/book"))
                .andExpect(status().isOk())
                .andExpect(content().json(expectJson));


    }


    @Test
    void getBookById_MustReturnAllBooks() throws Exception {

        //Given
        String expectJson = """
                             
                   
                       {
                           "title": "Hans im Glück",
                           "author": "Jacob Grimm",
                           "id": "1"
                       }


                   
                             
                """;


        //When & Then
        mockMvc.perform(get("/book/1"))
                .andExpect(status().isOk())
                .andExpect(content().json(expectJson));


    }


}