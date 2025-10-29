package com.example.sd202033.buoi10.controller;

import com.example.sd202033.buoi10.model.DanhMuc;
import com.example.sd202033.buoi10.service.DanhMucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/danh-muc")
public class DanhMucController {
    @Autowired
    DanhMucService danhMucService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("danhSach", danhMucService.getAllDanhMuc());
        return "/danhMuc/hienThi";
    }

    @PostMapping("/them")
    public String themDanhMuc(DanhMuc danhMuc) {
        danhMucService.addDanhMuc(danhMuc);
        return "redirect:/danh-muc/hien-thi";
    }

    @GetMapping("/sua/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("danhMuc", danhMucService.getDanhMucById(id));
        return "/danhMuc/viewUpdate";
    }

    @PostMapping("/sua")
    public String updateDanhMuc(DanhMuc danhMuc) {
        danhMucService.updateDanhMuc(danhMuc);
        return "redirect:/danh-muc/hien-thi";
    }

    @GetMapping("/xoa")
    public String xoaDanhMuc(@RequestParam("id") Integer id) {
        danhMucService.deleteDanhMucById(id);
        return "redirect:/danh-muc/hien-thi";
    }
}