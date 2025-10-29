package com.example.sof3022de5.controller;

import com.example.sof3022de5.model.PhieuNhap;
import com.example.sof3022de5.model.ChiTiet;
import com.example.sof3022de5.repository.ChiTietRepo;
import com.example.sof3022de5.repository.PhieuNhapRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/chi-tiet")
public class PhieuNhapChiTietController {
    @Autowired
    PhieuNhapRepo pnRepo;
    @Autowired
    ChiTietRepo ctRepo;

    @ModelAttribute("pnList")
    public List<PhieuNhap> getAll() {
        return pnRepo.findAll();
    }

    @GetMapping("/index")
    public String index(Model model, @ModelAttribute("ct") ChiTiet ct) {
        model.addAttribute("ctList", ctRepo.findAll());
        return "/chiTiet/index";
    }
    @GetMapping("/update/{id}")
    public String viewUpdate(Model model, @PathVariable("id") Integer id) {
        ChiTiet ct = ctRepo.findById(id).get();
        model.addAttribute("ct", ct);
        return "/chiTiet/viewUpdate";
    }
    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("ct") @Valid ChiTiet ct, Errors errors) {
        if (errors.hasErrors()) {
            return "/chiTiet/index";
        }
        ctRepo.save(ct);
        return "redirect:/chi-tiet/index";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("ct") @Valid ChiTiet ct, Errors errors) {
        if (errors.hasErrors()) {
            return "/chiTiet/index";
        }
        ctRepo.save(ct);
        return "redirect:/chi-tiet/index";
    }
    @GetMapping("/delete")
    public String delete(Model model, @RequestParam("id") Integer id) {
        ctRepo.deleteById(id);
        return "redirect:/chi-tiet/index";
    }
    @GetMapping("/page")
    public String page(Model model, @RequestParam(name = "page", defaultValue = "0", required = false) Integer page, @ModelAttribute("ct") ChiTiet ct) {
        int pageSize = 5;
        Sort sort = Sort.by(Sort.Direction.DESC, "tenSanPham");
        Pageable pageable = PageRequest.of(page, pageSize, sort);
        model.addAttribute("page", ctRepo.findAll(pageable));
        return "/chiTiet/page";
    }
    @GetMapping("/search")
    public String search(Model model, @RequestParam(required = false) Double min, @RequestParam(required = false) Double max, @ModelAttribute("ct") ChiTiet ct) {
        model.addAttribute("ctList", ctRepo.findChiTietsByGiaNhapBetween(min, max));
        return "/chiTiet/index";
    }
}
