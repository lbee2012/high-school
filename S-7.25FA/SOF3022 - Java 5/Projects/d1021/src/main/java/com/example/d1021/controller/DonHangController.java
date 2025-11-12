package com.example.d1021.controller;

import com.example.d1021.model.DonHang;
import com.example.d1021.model.SanPham;
import com.example.d1021.repository.DonHangRepo;
import com.example.d1021.repository.SanPhamRepo;
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
@RequestMapping("/don-hang")
public class DonHangController {
    @Autowired
    DonHangRepo dhRepo;
    @Autowired
    SanPhamRepo spRepo;

    @ModelAttribute("spList")
    public List<SanPham> getAllsp() {
        return spRepo.findAll();
    }

    @GetMapping("/index")
    public String index(Model model, @ModelAttribute("dh") DonHang dh) {
        model.addAttribute("dhList", dhRepo.findAll());
        return "/donHang/index";
    }
    @GetMapping("/update/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model model) {
        DonHang dh = dhRepo.findById(id).get();
        model.addAttribute("dh", dh);
        return "/donHang/viewUpdate";
    }
    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("dh") @Valid DonHang dh, Errors errors) {
        if (errors.hasErrors()) {
            return "/donHang/index";
        }
        dhRepo.save(dh);
        return "redirect:/don-hang/index";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("dh") @Valid DonHang dh, Errors errors) {
        if (errors.hasErrors()) {
            return "/donHang/index";
        }
        dhRepo.save(dh);
        return "redirect:/don-hang/index";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        dhRepo.deleteById(id);
        return "redirect:/don-hang/index";
    }
    @GetMapping("/page")
    public String page(@RequestParam(name = "page", defaultValue = "0", required = false) Integer page, Model model) {
        int pageSize = 3;
        Sort sort = Sort.by(Sort.Direction.DESC, "soLuongDat");
        Pageable pageable = PageRequest.of(page, pageSize, sort);
        model.addAttribute("page", dhRepo.findAll(pageable));
        return "/donHang/page";
    }
    @GetMapping("/search")
    public String search(@RequestParam("ten") String ten, Model model, @ModelAttribute("dh") DonHang dh) {
        model.addAttribute("dhList", dhRepo.findDonHangsByTenKhachHangContains(ten));
        return "/donHang/index";
    }
}
