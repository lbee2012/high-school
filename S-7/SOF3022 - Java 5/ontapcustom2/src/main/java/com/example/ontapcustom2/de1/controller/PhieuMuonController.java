package com.example.ontapcustom2.de1.controller;

import com.example.ontapcustom2.de1.model.DocGia;
import com.example.ontapcustom2.de1.model.PhieuMuon;
import com.example.ontapcustom2.de1.repository.DocGiaRepo;
import com.example.ontapcustom2.de1.repository.PhieuMuonRepo;
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
@RequestMapping("/de1/phieu-muon")
public class PhieuMuonController {
    @Autowired
    PhieuMuonRepo pmRepo;
    @Autowired
    DocGiaRepo dgRepo;
    @ModelAttribute("dgList")
    public List<DocGia> getAllDG() {
        return dgRepo.findAll();
    }

    @GetMapping("/index")
    public String index(Model model, @ModelAttribute("pm") PhieuMuon pm) {
        model.addAttribute("pmList", pmRepo.findAll());
        return "/de1/phieuMuon/index";
    }
    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("pm") @Valid PhieuMuon pm, Errors errors) {
        if (errors.hasErrors()) {
            return "/de1/phieuMuon/index";
        }
        pmRepo.save(pm);
        return "redirect:/phieu-muon/index";
    }
}
