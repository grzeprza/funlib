package com.grzeprza.funlib.service;


import com.grzeprza.funlib.model.Book;

public interface LibraryService {

    boolean addBook(Book book, String authorName, String authorSurname, String publisher);
}
