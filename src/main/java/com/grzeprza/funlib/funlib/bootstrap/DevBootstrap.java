package com.grzeprza.funlib.funlib.bootstrap;

import com.grzeprza.funlib.funlib.model.Author;
import com.grzeprza.funlib.funlib.model.Book;
import com.grzeprza.funlib.funlib.model.Publisher;
import com.grzeprza.funlib.funlib.repository.AuthorRepository;
import com.grzeprza.funlib.funlib.repository.BookRepository;
import com.grzeprza.funlib.funlib.repository.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(BookRepository bookRepository, AuthorRepository authorRepository, PublisherRepository publisherRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initStaticData();
    }

    private void initStaticData() {

    }
}
