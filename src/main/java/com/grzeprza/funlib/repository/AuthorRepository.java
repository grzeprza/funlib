package com.grzeprza.funlib.repository;

import com.grzeprza.funlib.model.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author, Long> {
    Author findByNameAndSurname(String authorName, String authorSurname);
}
