package com.grzeprza.funlib.funlib.service;

import com.grzeprza.funlib.funlib.dto.AuthorDTO;
import com.grzeprza.funlib.funlib.dto.converter.AuthorDTOToAuthor;
import com.grzeprza.funlib.funlib.dto.converter.AuthorToAuthorDTO;
import com.grzeprza.funlib.funlib.model.Author;
import com.grzeprza.funlib.funlib.repository.AuthorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;

@Service
@Slf4j
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;
    private AuthorToAuthorDTO authorToAuthorDTO;
    private AuthorDTOToAuthor  authorDTOToAuthor;

     public AuthorServiceImpl(AuthorRepository authorRepository, AuthorToAuthorDTO authorToAuthorDTO, AuthorDTOToAuthor authorDTOToAuthor){
         this.authorRepository = authorRepository;
         this.authorDTOToAuthor = authorDTOToAuthor;
         this.authorToAuthorDTO = authorToAuthorDTO;
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

    @Override
    @Transactional
    public AuthorDTO saveOrUpdate(AuthorDTO authorDTO) {
        Author detachedAuthor = authorDTOToAuthor.convert(authorDTO);

        Author savedAuthor = authorRepository.save(detachedAuthor);
        log.debug("Saved author "+ savedAuthor.getId());
        return authorToAuthorDTO.convert(savedAuthor);
    }
}
