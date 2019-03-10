package com.grzeprza.funlib.controller;

import com.grzeprza.funlib.service.WorkService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/works")
public class WorkController {

    private WorkService workService;

    public WorkController(WorkService workService) {
        this.workService = workService;
    }

    @GetMapping
    public String getAllWorks(Model model){
        model.addAttribute("works",workService.findAll());
        return "works"; 
    }

    @GetMapping("/{id}")
    public String getWorkById(Model model, @PathVariable Long id){
        model.addAttribute("work", workService.findById(id));
        return "work";
    }
}
