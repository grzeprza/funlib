package com.grzeprza.funlib.funlib.service;


import com.grzeprza.funlib.funlib.model.Book;

public interface LibraryService {

    boolean addBook(Book book, String authorName, String authorSurname, String publisher);
}
