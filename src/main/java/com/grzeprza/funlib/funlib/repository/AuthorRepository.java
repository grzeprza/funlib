package com.grzeprza.funlib.funlib.repository;

import com.grzeprza.funlib.funlib.dto.AuthorDTO;
import com.grzeprza.funlib.funlib.model.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author, Long> {
    Author findByNameAndSurname(String authorName, String authorSurname);
}
