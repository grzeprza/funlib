package com.grzeprza.funlib.funlib.bootstrap;

import com.grzeprza.funlib.funlib.model.Book;
import com.grzeprza.funlib.funlib.service.LibraryServiceImpl;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

   private LibraryServiceImpl libRepo;

    public DevBootstrap(LibraryServiceImpl libRepo) {
        this.libRepo = libRepo;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initStaticData();
    }

    private void initStaticData() {
        //
        Book  book = new Book();
        book.setIsbn("1234");
        book.setTitle("Spring Boot - new beginnings");
        book.setDescription("I hope you will be able to compile it");
        libRepo.addBook(book, "Grze", "Prza", "GPPublishing");

        Book book1 = new Book();
        book1.setIsbn("2345");
        book1.setTitle("Z dupy");
        book1.setDescription("Od zera do milionera");
        libRepo.addBook(book1, "Marcin", "Kras", "MKPublishing");

        Book book2 = new Book();
        book2.setIsbn("3456");
        book2.setTitle("Ekonomia buraka");
        book2.setDescription("Jak Burak postrzega swiat");
        libRepo.addBook(book2, "Adam","Buracz", "ABPublishing");

        Book  book3 = new Book();
        book3.setIsbn("4567");
        book3.setTitle("Thymeleaf: design uncharted");
        book3.setDescription("Developer guide to sweet design");
        libRepo.addBook(book3, "Anonim", "Anonimus", "GPPublishing");

        Book book4 = new Book();
        book4.setIsbn("5678");
        book4.setTitle("Z/od bytu");
        book4.setDescription("The journey for the one cheeseburger");
        libRepo.addBook(book4, "Marcin","Kras", "ABPublishing");

    }
}
