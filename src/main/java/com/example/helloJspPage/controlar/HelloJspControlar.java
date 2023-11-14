package com.example.helloJspPage.controlar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloJspControlar {
    @GetMapping("/hello")
    public String h(Model model)
    {
     return "hello";   
    }
    @GetMapping("/login")
    public String login(Model model)
    {
     return "login";   
    }
    
    
}
