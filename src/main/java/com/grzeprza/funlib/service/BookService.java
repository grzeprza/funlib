package com.grzeprza.funlib.service;

import com.grzeprza.funlib.model.Book;

import java.util.List;

public interface BookService {

    List<Book> findAllBooks();

    Book findBookByISBN(String ISBN);

}
