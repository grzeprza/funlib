package com.grzeprza.funlib.funlib.controller;

import com.grzeprza.funlib.funlib.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/books")
    public String getAllBooks(Model model){

        model.addAttribute("books", bookRepository.findAll());

        return "books";
    }

}
