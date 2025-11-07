package org.example.springbasicauthentication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {
    @RequestMapping
    public String home(Model model) {
        model.addAttribute("message", "@/ => home");
        return "/home";
    }

    @RequestMapping("/poly/url0")
    public String method0(Model model) {
        model.addAttribute("message", "@/poly/url0 => method0");
        return "/home";
    }
    @RequestMapping("/poly/url1")
    public String method1(Model model) {
        model.addAttribute("message", "@/poly/url1 => method0");
        return "/home";
    }
    @RequestMapping("/poly/url2")
    public String method2(Model model) {
        model.addAttribute("message", "@/poly/url2 => method0");
        return "/home";
    }
    @RequestMapping("/poly/url3")
    public String method3(Model model) {
        model.addAttribute("message", "@/poly/url3 => method0");
        return "/home";
    }
    @RequestMapping("/poly/url4")
    public String method4(Model model) {
        model.addAttribute("message", "@/poly/url4 => method0");
        return "/home";
    }
}
