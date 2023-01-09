package com.example.firstpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/greetings")
    public String niceToMeetYou(Model model) {
        model.addAttribute("userName", "JH");
        return "greetings";
    }
}
