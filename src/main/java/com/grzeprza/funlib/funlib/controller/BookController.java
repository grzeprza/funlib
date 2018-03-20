package com.grzeprza.funlib.funlib.controller;

import com.grzeprza.funlib.funlib.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private BookRepository bookRepository;


    @RequestMapping("/books")
    public String getAllBooks(Model model){
        model.addAttribute("books", bookRepository.findAll());

        return "books";
    }

}
