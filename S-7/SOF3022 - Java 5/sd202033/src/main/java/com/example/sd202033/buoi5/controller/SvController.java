package com.example.sd202033.buoi5.controller;

import com.example.sd202033.buoi5.model.SinhVien;
import com.example.sd202033.buoi5.service.SvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/buoi5")
public class SvController {
    @Autowired
    SvService svs;

    @GetMapping("/hien-thi")
    public String hienThi(Model m) {
        m.addAttribute("svList", svs.getAll());
        return "/buoi5/hienThi";
    }

    @PostMapping("/add")
    public String them(SinhVien sv) {
        svs.addSV(sv);
        return "redirect:/buoi5/hien-thi";
    }

    @GetMapping("/view-update/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model m) {
        SinhVien sv = svs.getOne(id);
        m.addAttribute("sv", sv);
        return "/buoi5/viewUpdate";
    }

    @PostMapping("/update")
    public String update(SinhVien sv) {
        svs.updateSV(sv);
        return "redirect:/buoi5/hien-thi";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        svs.deleteSV(id);
        return "redirect:/buoi5/hien-thi";
    }
}
