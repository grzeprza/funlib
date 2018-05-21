package com.grzeprza.funlib.funlib.service;


import com.grzeprza.funlib.funlib.model.Author;
import com.grzeprza.funlib.funlib.model.Book;
import com.grzeprza.funlib.funlib.model.Publisher;
import com.grzeprza.funlib.funlib.repository.AuthorRepository;
import com.grzeprza.funlib.funlib.repository.BookRepository;
import com.grzeprza.funlib.funlib.repository.PublisherRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.misc.IOUtils;

import javax.transaction.Transactional;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.LocalDate;
import java.time.LocalTime;

@Service
@Slf4j
public class LibraryServiceImpl implements LibraryService{

    @Autowired
    AuthorRepository authorRepo;

    @Autowired
    BookRepository bookRepo;

    @Autowired
    PublisherRepository publisherRepository;

    @Transactional
    public boolean addBook(Book book, String authorName, String authorSurname, String publisher){
        log.debug("Start adding book " + book.getTitle() + " " + authorSurname + " " + publisher);
        Publisher pub = publisherRepository.findByName(publisher);
        if(pub == null) {
            pub = new Publisher();
            pub.setName(publisher);
            publisherRepository.save(pub);
        }

        Author aut = authorRepo.findByNameAndSurname(authorName, authorSurname);
        if(aut == null){
            aut = new Author(authorName, authorSurname);
            aut.setBirthDate(LocalDate.now());
            aut.setDeathDate(LocalDate.now());
            aut.setPersonalWebsiteURI(("www.about.me"));
            Integer result = authorName.hashCode() < 0 ? authorName.hashCode()*(-1) : authorName.hashCode();
            aut.setRef_nr(result.longValue());
            InputStream is = this.getClass().getClassLoader().getResourceAsStream("static/authorphoto.jpg");
            try {
                aut.setPicture(IOUtils.readFully(is, Integer.MAX_VALUE, false));
            } catch (IOException e) {
                e.printStackTrace();
            }
            aut.setPicture(null);
        }

        //Eric
        if( bookRepo.findByTitle(book.getTitle()) != null ){ log.debug("Book already exists - " + book.getTitle() + " " + authorSurname + " " + publisher); return false;}
        else {
            Book newBook = book;
            newBook.setPublisher(pub);
            newBook.setIsbn(book.getIsbn());
            newBook.setTitle(book.getTitle());
            newBook.setDescription(book.getDescription());
            aut.getBooks().add(newBook);
            newBook.getAuthors().add(aut);

            authorRepo.save(aut);
            bookRepo.save(book);

            log.debug("Book added successfully");
            return true;
        }

    }

}
