package com.example.kiemtra10p0927;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/kiemtra10p0927")
public class FormController {
    @GetMapping("/calculation")
    public String getForm() {
        return "kiemtra10p0927/calculation";
    }

    @PostMapping("/calculation")
    public String postForm(RedirectAttributes ra, Float numa, Float numb) {
        ra.addAttribute("numa", numa);
        ra.addAttribute("numb", numb);
        return "redirect:/kiemtra10p0927/result";
    }

    @GetMapping("/result")
    public String getResult(Model m, @RequestAttribute(required = false) Float numa, @RequestAttribute(required = false) Float numb) {
        Float tich = numa * numb;
        Float thuong = numa / numb;
        m.addAttribute("tich", tich);
        m.addAttribute("tich", thuong);

        return "kiemtra10p0927/result";
    }
}
