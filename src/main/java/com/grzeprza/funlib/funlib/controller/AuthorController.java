package com.grzeprza.funlib.funlib.controller;

import com.grzeprza.funlib.funlib.repository.AuthorRepository;
import com.grzeprza.funlib.funlib.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    @RequestMapping("/authors")
    public String getAllBooks(Model model){
        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }

}
