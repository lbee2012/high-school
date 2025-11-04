package com.example.sof3022.prac1.controller;

import com.example.sof3022.prac1.model.MayTinh;
import com.example.sof3022.prac1.service.MayTinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/prac1")
public class MayTinhController {
    @Autowired
    MayTinhService mts;

    @GetMapping("/hien-thi")
    public String hienThi(Model m) {
        m.addAttribute("mtList", mts.getAll());
        return "/prac1/hienThi";
    }
    @PostMapping("/add")
    public String add(MayTinh mt) {
        mts.addMT(mt);
        return "redirect:/prac1/hien-thi";
    }
    @GetMapping("/view-update/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model m) {
        MayTinh mt = mts.getOne(id);
        m.addAttribute("mt", mt);
        return "/prac1/viewUpdate";
    }
    @PostMapping("/update")
    public String update(MayTinh mt) {
        mts.updateMT(mt);
        return "redirect:/prac1/hien-thi";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        mts.deleteMT(id);
        return "redirect:/prac1/hien-thi";
    }
}
