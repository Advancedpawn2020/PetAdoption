package com.pet.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/manage")
    public String manage(){
        return "manage";
    }
    @GetMapping("/navigation")
    public String nav(){
        return "navigation";
    }
}
