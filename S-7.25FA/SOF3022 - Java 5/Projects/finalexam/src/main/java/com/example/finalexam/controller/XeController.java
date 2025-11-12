package com.example.finalexam.controller;

import com.example.finalexam.model.LoaiXe;
import com.example.finalexam.model.Xe;
import com.example.finalexam.repository.LoaiXeRepo;
import com.example.finalexam.repository.XeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/xe")
public class XeController {
    @Autowired
    XeRepo xRepo;
    @Autowired
    LoaiXeRepo lxRepo;

    @ModelAttribute("lxList")
    public List<LoaiXe> getAll() {
        return lxRepo.findAll();
    }

    @GetMapping("/hien-thi")
    public String index(Model model) {
        model.addAttribute("xList", xRepo.findAll());
        return "/xe/hienThi";
    }
    @GetMapping("/update/{id}")
    public String viewUpdate(Model model, @PathVariable("id") Integer id) {
        Xe xe = xRepo.findById(id).get();
        model.addAttribute("xe", xe);
        return "/xe/viewUpdate";
    }
    @PostMapping("/update")
    public String update(Xe xe) {
        xRepo.save(xe);
        return "redirect:/xe/hien-thi";
    }
    @GetMapping("/page")
    public String page(Model model, @RequestParam(name = "page", defaultValue = "0", required = false) Integer page) {
        int pageSize = 5;
        Sort sort = Sort.by(Sort.Direction.DESC, "gia");
        Pageable pageable = PageRequest.of(page, pageSize, sort);
        model.addAttribute("page", xRepo.findAll(pageable));
        return "/xe/page";
    }
}
