package com.grzeprza.funlib.funlib.controller;

import com.grzeprza.funlib.funlib.repository.BookRepository;
import com.grzeprza.funlib.funlib.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublisherController {

    @Autowired
    private PublisherRepository publisherRepository;

    @RequestMapping("/publishers")
    public String getAllBooks(Model model){
        model.addAttribute("publishers", publisherRepository.findAll());

        return "publishers";
    }

}
