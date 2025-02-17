package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Satya");
        model.addAttribute("number", "123-456-7890");
        model.addAttribute("address", "123 Main St, City, Country");
        model.addAttribute("github", "https://github.com/your-username");

        return "home";  // This will resolve to home.html
    }
}

