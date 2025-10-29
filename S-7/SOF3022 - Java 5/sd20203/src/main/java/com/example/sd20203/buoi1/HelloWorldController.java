package com.example.sd20203.buoi1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("fullname", "Hoang Quy Long");
        return "/buoi1/hello";
    }
}
