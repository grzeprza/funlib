package com.grzeprza.funlib.controller;

import com.grzeprza.funlib.service.WorkService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    private WorkService workService;

    public IndexController(WorkService workService) {
        this.workService = workService;
    }

    @RequestMapping({"/", "", "/index"})
    public String getIndexPage(Model model){
//        model.addAttribute("content","main::searchFragment");
        return "index";
    }

//    @RequestMapping(value = "")
//    public String searchBook(@RequestParam String searchPhrase, Model model){
//        model.addAttribute("searchPhrase", searchPhrase);
//        return "index";
//    }
}
/**
 * TODO: Enable saving new works + upload new images
 * TODO: I18n pl + en
 * TODO: Pojo Validation
 * TODO: Error handling (Advice Controller)
 * */