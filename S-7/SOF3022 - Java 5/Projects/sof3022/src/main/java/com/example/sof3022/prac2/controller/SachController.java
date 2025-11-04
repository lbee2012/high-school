package com.example.sof3022.prac2.controller;

import com.example.sof3022.prac2.model.Sach;
import com.example.sof3022.prac2.service.SachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/prac2")
public class SachController {
    @Autowired
    SachService ss;

    @GetMapping("/hien-thi")
    public String hienThi(Model m) {
        m.addAttribute("sList", ss.getAll());
        return "/prac2/hienThi";
    }
    @PostMapping("/add")
    public String add(Sach s) {
        ss.addS(s);
        return "redirect:/prac2/hien-thi";
    }
    @GetMapping("/view-update/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model m) {
        Sach s = ss.getOne(id);
        m.addAttribute("s", s);
        m.addAttribute("sList", ss.getAll());
        return "/prac2/viewUpdate";
    }
    @PostMapping("/update")
    public String update(Sach s) {
        ss.updateS(s);
        return "redirect:/prac2/hien-thi";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        ss.deleteS(id);
        return "redirect:/prac2/hien-thi";
    }
}
