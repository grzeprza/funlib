package com.grzeprza.funlib.funlib.repository;

import com.grzeprza.funlib.funlib.model.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long> {
}
