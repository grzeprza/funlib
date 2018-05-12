package com.grzeprza.funlib.funlib.controller;

import com.grzeprza.funlib.funlib.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    private BookService bookService;

    @RequestMapping({"/", "", "/index"})
    public String index(Model model){

        model.addAttribute("allBooks", bookService.findAllBooks());

        return "index";
    }

}
