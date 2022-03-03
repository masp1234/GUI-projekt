package com.example.guiprojekt.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuiController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/about")
    public String about() {
        return "about";
    }
    @GetMapping("/signUp")
    public String signUp() {
        return "signUp";
    }
    @GetMapping("/kontakt")
    public String contact() {
        return "contact";
    }
    @GetMapping("/nyheder")
        public String news() {
            return "news";
        }
    @GetMapping("/fact")
    public String fact() {
        return "fact";
    }
}


