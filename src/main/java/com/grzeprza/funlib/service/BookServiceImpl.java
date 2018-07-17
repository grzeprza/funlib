package com.grzeprza.funlib.service;

import com.grzeprza.funlib.model.Book;
import com.grzeprza.funlib.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Slf4j
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAllBooks() {
        List<Book> books = new LinkedList<>();
        bookRepository.findAll().forEach(books::add);
        log.debug(String.format("Found %d books", books.size()));
        return books;
    }

    @Override
    public Book findBookByISBN(String ISBN) {
        Book book = bookRepository.findByIsbn(ISBN);
        return book;
    }
}
