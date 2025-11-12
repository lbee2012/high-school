package com.example.sof3022de4.controller;

import com.example.sof3022de4.model.LoaiXe;
import com.example.sof3022de4.model.Xe;
import com.example.sof3022de4.repository.LoaiXeRepo;
import com.example.sof3022de4.repository.XeRepo;
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

    @GetMapping("/index")
    public String index(Model model, @ModelAttribute("x") Xe x) {
        model.addAttribute("xList", xRepo.findAll());
        return "/xe/index";
    }
    @GetMapping("/update/{id}")
    public String viewUpdate(Model model, @PathVariable("id") Integer id) {
        Xe x = xRepo.findById(id).get();
        model.addAttribute("x", x);
        return "/xe/viewUpdate";
    }
    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("x") @Valid Xe x, Errors errors) {
        if (errors.hasErrors()) {
            return "/xe/index";
        }
        xRepo.save(x);
        return "redirect:/xe/index";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("x") @Valid Xe x, Errors errors) {
        if (errors.hasErrors()) {
            return "/xe/index";
        }
        xRepo.save(x);
        return "redirect:/xe/index";
    }
    @GetMapping("/delete")
    public String delete(Model model, @RequestParam("id") Integer id) {
        xRepo.deleteById(id);
        return "redirect:/xe/index";
    }
    @GetMapping("/search")
    public String search(Model model, @RequestParam("tenXe") String tenXe, @ModelAttribute("x") Xe x) {
        model.addAttribute("xList", xRepo.findXesByTenXeContains(tenXe));
        return "/xe/search";
    }
    @GetMapping("/page")
    public String page(Model model, @RequestParam(name = "page", defaultValue = "0", required = false) Integer page) {
        int pageSize = 5;
        Sort sort = Sort.by(Sort.Direction.DESC, "gia");
        Pageable pageable = PageRequest.of(page,pageSize,sort);
        model.addAttribute("page", xRepo.findAll(pageable));
        return "/xe/page";
    }
}
