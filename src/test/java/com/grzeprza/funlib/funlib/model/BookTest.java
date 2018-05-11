package com.grzeprza.funlib.funlib.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    Book book;

    @Before
    public void setUp(){
        book = new Book();
    }

    @Test
    public void getId() {
        Long specificId = 1L;
        book.setId(specificId);
        assertEquals(specificId, book.getId());
    }

    @Test
    public void getTitle() {
        String specificTitle = "Best book in the world";
        book.setTitle(specificTitle);
        assertEquals(specificTitle, book.getTitle());
    }

    @Test
    public void getDescription() {
        String specificDescription = "Best book in the world";
        book.setDescription(specificDescription);
        assertEquals(specificDescription, book.getDescription());
    }
}