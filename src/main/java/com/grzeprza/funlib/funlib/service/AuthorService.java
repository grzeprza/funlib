package com.grzeprza.funlib.funlib.service;

import com.grzeprza.funlib.funlib.dto.AuthorDTO;
import com.grzeprza.funlib.funlib.model.Author;

import java.util.List;

public interface AuthorService {

    List<Author> findAll();

    Author findByNameAndSurname(String name, String surname);

    AuthorDTO saveOrUpdate(AuthorDTO authorDTO);
}
