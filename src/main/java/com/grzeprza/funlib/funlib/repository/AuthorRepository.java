package com.grzeprza.funlib.funlib.repository;

import com.grzeprza.funlib.funlib.model.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author, Long> {
}
