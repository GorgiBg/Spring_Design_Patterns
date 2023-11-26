package com.sirma.springhtmlcss.contollers;

import com.sirma.springhtmlcss.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping( "/home")
    public String home(Model model) {
        model.addAttribute("message", "Hello World!");
        model.addAttribute("user", new User(1, "Peter", "peter123"
        , "peter@peter.peter"));
        return "home-view";
    }
}


