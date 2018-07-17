package com.grzeprza.funlib.repository;

import com.grzeprza.funlib.model.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long> {
    Book findByTitle(String title);

    Book findByIsbn(String ISBN);
}
