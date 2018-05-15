package com.grzeprza.funlib.funlib.service;

import com.grzeprza.funlib.funlib.model.Author;
import com.grzeprza.funlib.funlib.repository.AuthorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
@Slf4j
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> findAll() {
        List<Author> authors = new LinkedList<>();
        authorRepository.findAll().forEach(author -> authors.add(author));
        return authors;
    }

    @Override
    public Author findByNameAndSurname(String name, String surname) {
        Author author = authorRepository.findByNameAndSurname(name, surname);
        if(author == null){
            log.debug(String.format("Author %s %s not found", name, surname));
        }
        return author;
    }
}
