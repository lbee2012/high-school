package com.example.ontapcustom.de3.controller;

import com.example.ontapcustom.de3.model.BacSi;
import com.example.ontapcustom.de3.model.BenhNhan;
import com.example.ontapcustom.de3.repository.BacSiRepo;
import com.example.ontapcustom.de3.repository.BenhNhanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/de3/benh-nhan")
public class BenhNhanController {
    @Autowired
    BenhNhanRepo bnRepo;

    @Autowired
    BacSiRepo bsRepo;

    @ModelAttribute("bsList")
    public List<BacSi> getAllBS() {
        return bsRepo.findAll();
    }

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("bnList", bnRepo.findAll());
        return "/de3/benhNhan/index";
    }
    @PostMapping("/add")
    public String add(BenhNhan bn) {
        bnRepo.save(bn);
        return "redirect:/de3/benh-nhan/index";
    }
    @GetMapping("/update/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model model) {
        BenhNhan bn = bnRepo.findById(id).get();
        model.addAttribute("bn", bn);
        return "/de3/benhNhan/viewUpdate";
    }
    @PostMapping("/update")
    public String update(BenhNhan bn) {
        bnRepo.save(bn);
        return "redirect:/de3/benh-nhan/index";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        bnRepo.deleteById(id);
        return "redirect:/de3/benh-nhan/index";
    }
    @GetMapping("/page")
    public String page(@RequestParam(name = "page", defaultValue = "0", required = false) Integer page, Model model) {
        int pageSize = 2;
        Sort sort = Sort.by(Sort.Direction.DESC, "ten");
        Pageable pageable = PageRequest.of(page, pageSize, sort);
        model.addAttribute("page", bnRepo.findAll(pageable));
        return "/de3/benhNhan/page";
    }
    @GetMapping("/search")
    public String search(@RequestParam("ten") String ten, Model model) {
        model.addAttribute("bnList", bnRepo.findBenhNhansByTenContains(ten));
        return "/de3/benhNhan/index";
    }
}
