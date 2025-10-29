package com.example.ontapcustom.de1.controller;

import com.example.ontapcustom.de1.model.DonHang;
import com.example.ontapcustom.de1.repository.DonHangRepository;
import com.example.ontapcustom.de1.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/de1/don-hang")
public class DonHangController {
    @Autowired
    DonHangRepository dhRepo;

    @Autowired
    KhachHangRepository khRepo;

    @ModelAttribute("khList")
    public List<DonHang> getAllDH() {
        return dhRepo.findAll();
    }

    @GetMapping("/index")
    public String indexDH(Model m) {
        m.addAttribute("dhList", dhRepo.findAll());
        return "/de1/donHang/index";
    }
    @PostMapping("/add")
    public String addDH(DonHang dh) {
        dhRepo.save(dh);
        return "redirect:/de1/don-hang/index";
    }
    @GetMapping("/update/{id}")
    public String viewUpdateDH(@PathVariable("id") Integer id, Model m) {
        DonHang dh = dhRepo.findById(id).get();
        m.addAttribute("dh", dh);
        return "/de1/donHang/viewUpdate";
    }
    @PostMapping("/update")
    public String updateDH(DonHang dh) {
        dhRepo.save(dh);
        return "redirect:/de1/don-hang/index";
    }
    @GetMapping("/delete")
    public String deleteDH(@RequestParam("id") Integer id) {
        dhRepo.deleteById(id);
        return "redirect:/de1/don-hang/index";
    }
    @GetMapping("/page")
    public String pageDH(@RequestParam(name = "page", defaultValue = "0", required = false) Integer page, Model m) {
        int pageSize = 2;
        Sort sort = Sort.by(Sort.Direction.ASC, "ngayDat");
        Pageable pageable = PageRequest.of(page, pageSize, sort);
        m.addAttribute("page", dhRepo.findAll(pageable));
        return "/de1/donHang/page";
    }
}