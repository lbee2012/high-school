package com.example.sd20203.buoi2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/buoi2")
public class LoginController {
    @GetMapping("/login")
    public String showForm() {
        return "/buoi2/login";
    }
    @PostMapping("/login")
    public String login(LoginRequest lg, Model model) {
        model.addAttribute("username", lg.getUsername());
        model.addAttribute("password", lg.getPassword());
        return "/buoi2/information";
    }
    @ResponseBody
    @GetMapping("/path-variable/{id}")
    public void pathVariable(@PathVariable("id") String id) {
        System.out.println(id);
    }
}
