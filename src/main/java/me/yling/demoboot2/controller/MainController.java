package me.yling.demoboot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController
{
    @GetMapping("/")
    public String showAgency()
    {
        return"index";
    }
}
