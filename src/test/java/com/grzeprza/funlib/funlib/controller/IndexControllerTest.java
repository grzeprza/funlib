package com.grzeprza.funlib.funlib.controller;

import com.grzeprza.funlib.funlib.model.Book;
import com.grzeprza.funlib.funlib.service.BookService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class IndexControllerTest {

    @Mock
    BookService bookService;

    IndexController indexController;

    @Mock
    private Model model;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        indexController = new IndexController(bookService);
    }

    @Test
    public void getIndexPage() {
        //given
        List<Book> books = new LinkedList<>();
        books.add(new Book());
        Book book = new Book();
        book.setId(1L);
        books.add(book);

        when(bookService.findAllBooks()).thenReturn(books);

        ArgumentCaptor<List<Book>> listArgumentCaptor = ArgumentCaptor.forClass(List.class);

        //when
        String displayPage = indexController.getIndexPage(model);

        //then
        assertEquals("index", displayPage);
        verify(bookService, times(1)).findAllBooks();
        verify(model, times(1)).addAttribute(eq("allBooks"), listArgumentCaptor.capture());
        List<Book> booksList = listArgumentCaptor.getValue();
        assertEquals(2, booksList.size());
    }
}