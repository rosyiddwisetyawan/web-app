package com.dev.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Menu {

    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }

    @GetMapping("/project")
    public String project(){
        return "project";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
}
