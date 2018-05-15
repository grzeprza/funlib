package com.grzeprza.funlib.funlib.controller;

import com.grzeprza.funlib.funlib.repository.AuthorRepository;
import com.grzeprza.funlib.funlib.repository.BookRepository;
import com.grzeprza.funlib.funlib.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/authors")
    public String getAllBooks(Model model){
        model.addAttribute("authors", authorService.findAll());

        return "authors";
    }

    @RequestMapping("/authors/{name}/{surname}")
    public String getAuthorByNameAndSurname(Model model, @PathVariable String name, @PathVariable String surname){
        model.addAttribute("author", authorService.findByNameAndSurname(name, surname));

        return "author";
    }

}
