package com.grzeprza.funlib.funlib.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping(value = {"", "/", "/index"})
public class IndexController {

    public String index(Model model){
        return "index";
    }

}
