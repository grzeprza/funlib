package com.grzeprza.funlib.controller;

import com.grzeprza.funlib.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @RequestMapping("/publishers")
    public String getAllBooks(Model model){
        model.addAttribute("publishers", publisherService.findAll());

        return "publishers";
    }

    @RequestMapping("/publishers/{publisherName}")
    public String getPublisherByName(Model model, @PathVariable String publisherName){
        model.addAttribute("publisher", publisherService.findByName(publisherName));
        return "publisher";
    }
}
