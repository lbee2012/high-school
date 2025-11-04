package com.example.sd202033.buoi10.controller;

import com.example.sd202033.buoi10.model.DanhMuc;
import com.example.sd202033.buoi10.model.SanPham;
import com.example.sd202033.buoi10.repository.SanPhamRepository;
import com.example.sd202033.buoi10.service.DanhMucService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/san-pham")
public class SanPhamController {
    @Autowired
    SanPhamRepository sanPhamRepository;

    @Autowired
    DanhMucService danhMucService;

    @ModelAttribute("listDanhMuc")
    List<DanhMuc> getListDanhMuc() {
        return danhMucService.getAllDanhMuc();
    }
    @GetMapping("/hien-thi")
    public String hienThi(Model model, @ModelAttribute("sp") SanPham sp) {
        model.addAttribute("listSanPham", sanPhamRepository.findAll());
        return "/sanPham/hienThi";
    }
    @PostMapping("/them")
    public String them(Model model, @ModelAttribute("sp") @Valid SanPham sp, Errors errors) {
        if (errors.hasErrors()) {
            return "/sanPham/hienThi";
        }
        sanPhamRepository.save(sp);
        return "redirect:/san-pham/hien-thi";
    }
}
