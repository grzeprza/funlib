package com.grzeprza.funlib.controller;

import com.grzeprza.funlib.dto.AuthorDTO;
import com.grzeprza.funlib.service.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/authors/new")
    public String newAuthorForm(Model model){

        model.addAttribute("pageType", "Add Author");
        model.addAttribute("author", new AuthorDTO());

        return "editAuthor";
    }

    @PostMapping
    @RequestMapping("/author")
    public String saveOrUpdate(@ModelAttribute AuthorDTO author){
        AuthorDTO savedAuthor = authorService.saveOrUpdate(author);
        System.out.println(savedAuthor.toString());
        return "redirect:/authors/"+savedAuthor.getName() +"/"+ savedAuthor.getSurname();
//    return "authors";
    }
}
