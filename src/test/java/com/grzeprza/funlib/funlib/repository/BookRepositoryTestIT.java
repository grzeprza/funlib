package com.grzeprza.funlib.funlib.repository;

import com.grzeprza.funlib.funlib.model.Book;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTestIT {

    @Autowired
    BookRepository bookRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByTitle() {
        Optional<Book> book = Optional.ofNullable(bookRepository.findByTitle("Spring Boot - new beginnings"));
        assertEquals(false, book.isPresent());
    }
}