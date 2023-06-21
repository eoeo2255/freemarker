package com.example.HW.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HwController {

    @GetMapping("/")
    public String hello(Model model){
        model.addAttribute("sentence", "Hello World!");

        return "hello";
    }
}
