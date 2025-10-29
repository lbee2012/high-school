package com.example.ontapcustom.de1.controller;

import com.example.ontapcustom.de1.model.KhachHang;
import com.example.ontapcustom.de1.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/de1/khach-hang")
public class KhachHangController {
    @Autowired
    KhachHangRepository khRepo;

    @GetMapping("/index")
    public String indexKH(Model m) {
        m.addAttribute("khList", khRepo.findAll());
        return "/de1/khachHang/index";
    }
    @PostMapping("/add")
    public String addKH(KhachHang kh) {
        khRepo.save(kh);
        return "redirect:/de1/khach-hang/index";
    }
    @GetMapping("/update/{id}")
    public String viewUpdateKH(@PathVariable("id") Integer id, Model m) {
        KhachHang kh = khRepo.findById(id).get();
        m.addAttribute("kh", kh);
        return "/de1/khachHang/viewUpdate";
    }
    @PostMapping("/update")
    public String updateKH(KhachHang kh) {
        khRepo.save(kh);
        return "redirect:/de1/khach-hang/index";
    }
    @GetMapping("/delete")
    public String deleteKH(@RequestParam("id") Integer id) {
        khRepo.deleteById(id);
        return "redirect:/de1/khach-hang/index";
    }
}
