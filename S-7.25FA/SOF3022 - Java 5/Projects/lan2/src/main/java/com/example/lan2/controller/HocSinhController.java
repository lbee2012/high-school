package com.example.lan2.controller;

import com.example.lan2.model.HocSinh;
import com.example.lan2.model.TruongHoc;
import com.example.lan2.repository.HocSinhRepo;
import com.example.lan2.repository.TruongHocRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/hoc-sinh")
public class HocSinhController {
    @Autowired
    HocSinhRepo hsRepo;

    @Autowired
    TruongHocRepo thRepo;

    @ModelAttribute("thList")
    public List<TruongHoc> getAllTH() {
        return thRepo.findAll();
    }
    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("hsList", hsRepo.findAll());
        return "/hocSinh/index";
    }
    @PostMapping("/add")
    public String add(HocSinh hs) {
        hsRepo.save(hs);
        return "redirect:/hoc-sinh/index";
    }
    @GetMapping("/update/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model model) {
        HocSinh hs = hsRepo.findById(id).get();
        model.addAttribute("hs", hs);
        return "/hocSinh/viewUpdate";
    }
    @PostMapping("/update")
    public String update(HocSinh hs) {
        hsRepo.save(hs);
        return "redirect:/hoc-sinh/index";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        hsRepo.deleteById(id);
        return "redirect:/hoc-sinh/index";
    }
    @GetMapping("/page")
    public String page(@RequestParam(name = "page", defaultValue = "0", required = false) Integer page, Model model) {
        int pageSize = 4;
        Sort sort = Sort.by(Sort.Direction.ASC, "tuoi");
        Pageable pageable = PageRequest.of(page, pageSize, sort);
        model.addAttribute("hsList", hsRepo.findAll(pageable));
        return "/hocSinh/page";
    }
    @GetMapping("/search")
    public String search(@RequestParam("tenHocSinh") String tenHocSinh, Model model) {
        model.addAttribute("hsList", hsRepo.findHocSinhsByTenHocSinhContains(tenHocSinh));
        return "/hocSinh/index";
    }
}
