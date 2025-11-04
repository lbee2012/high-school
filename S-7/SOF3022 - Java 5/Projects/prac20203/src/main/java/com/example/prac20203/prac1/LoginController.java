package com.example.prac20203.prac1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/prac1")
public class LoginController {
    @GetMapping("/login")
    public String getLogin() {
        return "prac1/login";
    }
    @PostMapping("/login")
    public String postLogin(RedirectAttributes ra, LoginRequest lg) {
        ra.addAttribute("username", lg.getUsername());
        ra.addAttribute("password", lg.getPassword());

        return "redirect:/prac1/greeting";
    }

    @GetMapping("/greeting")
    public String getCourses(Model m) {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course(1, "Listening", "IELTS", 200));
        courses.add(new Course(2, "Reading", "IELTS", 200));
        courses.add(new Course(3, "Writing", "IELTS", 300));
        courses.add(new Course(4, "Speaking", "IELTS", 250));
        courses.add(new Course(5, "Kanji", "JLPT", 200));
        courses.add(new Course(6, "Hiragana", "JLPT", 150));
        courses.add(new Course(7, "Katakana", "JLPT", 150));
        m.addAttribute("courses", courses);

        return "prac1/greeting";
    }

//    @ResponseBody
//    @GetMapping("/greeting")
//    public List<Course> getCourses() {
//        return Arrays.asList(
//            new Course(1, "Listening", "IELTS", 200),
//            new Course(2, "Reading", "IELTS", 200),
//            new Course(3, "Writing", "IELTS", 300),
//            new Course(4, "Speaking", "IELTS", 250),
//            new Course(5, "Kanji", "JLPT", 200),
//            new Course(6, "Hiragana", "JLPT", 150),
//            new Course(7, "Katakana", "JLPT", 150)
//        );
//    }
}
