package com.example.kiemtralan1.lan1.controller;

import com.example.kiemtralan1.lan1.model.MayTinh;
import com.example.kiemtralan1.lan1.service.MayTinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lan1")
public class MayTinhController {
    @Autowired
    MayTinhService mts;

    @GetMapping("/index")
    public String index(Model m) {
        m.addAttribute("mtList", mts.getAll());
        return "/lan1/index";
    }
    @PostMapping("/add")
    public String add(MayTinh mt) {
        mts.addMT(mt);
        return "redirect:/lan1/index";
    }
    @GetMapping("/view-update/{id}")
    public String viewUpdate(Model m, @PathVariable("id") Integer id) {
        MayTinh mt = mts.getOne(id);
        m.addAttribute("mt", mt);
        return "/lan1/viewUpdate";
    }
    @PostMapping("/update")
    public String update(MayTinh mt) {
        mts.updateMT(mt);
        return "redirect:/lan1/index";
    }
}
