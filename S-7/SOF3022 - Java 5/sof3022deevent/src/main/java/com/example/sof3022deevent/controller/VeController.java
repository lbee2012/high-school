package com.example.sof3022deevent.controller;

import com.example.sof3022deevent.model.SuKien;
import com.example.sof3022deevent.model.Ve;
import com.example.sof3022deevent.repository.SuKienRepo;
import com.example.sof3022deevent.repository.VeRepo;
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
@RequestMapping("/ve")
public class VeController {
    @Autowired
    SuKienRepo skRepo;
    @Autowired
    VeRepo vRepo;

    @ModelAttribute("skList")
    public List<SuKien> getAll() {
        return skRepo.findAll();
    }

    @GetMapping("/index")
    public String index(Model model, @ModelAttribute("v") Ve v) {
        model.addAttribute("vList", vRepo.findAll());
        return "/ve/index";
    }
    @GetMapping("/delete")
    public String delete(Model model, @RequestParam("id") Integer id) {
        vRepo.deleteById(id);
        return "redirect:/ve/index";
    }
    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("v") @Valid Ve v, Errors errors) {
        if (errors.hasErrors()) {
            return "/ve/index";
        }
        vRepo.save(v);
        return "redirect:/ve/index";
    }
    @GetMapping("/page")
    public String page(Model model, @RequestParam(name = "page", defaultValue = "0", required = false) Integer page) {
        int pageSize = 5;
        Sort sort = Sort.by(Sort.Direction.DESC, "soLuong");
        Pageable pageable = PageRequest.of(page, pageSize, sort);
        model.addAttribute("page", vRepo.findAll(pageable));
        return "/ve/page";
    }

}
