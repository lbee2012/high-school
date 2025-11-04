package com.example.ontapcustom.de2.controller;

import com.example.ontapcustom.de2.model.HocSinh;
import com.example.ontapcustom.de2.model.LopHoc;
import com.example.ontapcustom.de2.repository.HocSinhRepo;
import com.example.ontapcustom.de2.repository.LopHocRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/de2/hoc-sinh")
public class HocSinhController {
    @Autowired
    HocSinhRepo hsRepo;

    @Autowired
    LopHocRepo lhRepo;

    @ModelAttribute("lhList")
    public List<LopHoc> getAllLH() {
        return lhRepo.findAll();
    }

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("hsList", hsRepo.findAll());
        return "/de2/hocSinh/index";
    }
    @PostMapping("/add")
    public String add(HocSinh hs) {
        hsRepo.save(hs);
        return "redirect:/de2/hoc-sinh/index";
    }
    @GetMapping("/update/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model model) {
        HocSinh hs = hsRepo.findById(id).get();
        model.addAttribute("hs", hs);
        return "/de2/hocSinh/viewUpdate";
    }
    @PostMapping("/update")
    public String update(HocSinh hs) {
        hsRepo.save(hs);
        return "redirect:/de2/hoc-sinh/index";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        hsRepo.deleteById(id);
        return "redirect:/de2/hoc-sinh/index";
    }
    @GetMapping("/page")
    public String page(@RequestParam(name = "page", defaultValue = "0", required = false) Integer page, Model model) {
        int pageSize = 3;
        Sort sort = Sort.by(Sort.Direction.ASC, "tuoi");
        Pageable pageable = PageRequest.of(page, pageSize, sort);
        model.addAttribute("page", hsRepo.findAll(pageable));
        return "/de2/hocSinh/page";
    }
    @GetMapping("/search")
    public String search(@RequestParam("ten") String ten, Model model) {
        model.addAttribute("hsList", hsRepo.findHocSinhsByTenContains(ten));
        return "/de2/hocSinh/index";
    }
}
