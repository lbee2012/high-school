package com.example.sd2020333.bang2.controller;

import com.example.sd2020333.bang2.model.NhanVien;
import com.example.sd2020333.bang2.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/nhan-vien")

public class NhanVienController {
    @Autowired
    NhanVienService nvService;

    @GetMapping("/index")
    public String hienThi(Model m) {
        m.addAttribute("listNV", nvService.getAll());
        return "/nhanVien/index"; //thymeleaf
    }
    @PostMapping("/add")
    public String them(NhanVien nv) {
        nvService.addNV(nv);
        return "redirect:/nhan-vien/index"; //url; uri
    }
    @GetMapping("/update/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model m) {
        NhanVien nv = nvService.getOne(id);
        m.addAttribute("nv", nv);
        return "/nhanVien/viewUpdate";
    }
    @PostMapping("/update")
    public String update(NhanVien nv) {
        nvService.updateNV(nv);
        return "redirect:/nhan-vien/index";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        nvService.deleteNV(id);
        return "redirect:/nhan-vien/index";
    }
}
