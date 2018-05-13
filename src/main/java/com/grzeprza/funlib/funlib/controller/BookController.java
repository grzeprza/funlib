package com.grzeprza.funlib.funlib.controller;

import com.grzeprza.funlib.funlib.repository.BookRepository;
import com.grzeprza.funlib.funlib.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/books")
    public String getAllBooks(Model model){

        model.addAttribute("books", bookService.findAllBooks());

        return "books";
    }

    @RequestMapping("/books/{isbn}")
    public String getBookByISBN(Model model, @PathVariable String isbn){

        model.addAttribute("book", bookService.findBookByISBN(isbn));

        return "book";
    }

}
