package org.example.springcustomauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class LoginController {
    @RequestMapping("/{action}")
    public String login(Model model, @PathVariable("action") String action) {
        return switch (action) {
            case "form" -> {
                model.addAttribute("message", "Login");
                yield "/auth/login";
            }
            case "success" -> {
                model.addAttribute("message", "Login successful");
                yield "/auth/success";
            }
            case "failure" -> {
                model.addAttribute("message", "Login failed");
                yield "/auth/failure";
            }
            case "exit" -> {
                model.addAttribute("message", "Logout successful");
                yield "/auth/logout";
            }
            default -> "/auth/login";
        };
    }
}
