package com.example.d1023.controller;

import com.example.d1023.model.DatPhong;
import com.example.d1023.model.Phong;
import com.example.d1023.repository.DatPhongRepo;
import com.example.d1023.repository.PhongRepo;
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
@RequestMapping("/dat-phong")
public class DatPhongController {
    @Autowired
    DatPhongRepo dpRepo;
    @Autowired
    PhongRepo pRepo;

    @ModelAttribute("pList")
    public List<Phong> getAllP() {
        return pRepo.findAll();
    }

    @GetMapping("/index")
    public String index(Model model, @ModelAttribute("dp") DatPhong dp) {
        model.addAttribute("dpList", dpRepo.findAll());
        return "/datPhong/index";
    }
    @GetMapping("/update/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model model) {
        DatPhong dp = dpRepo.findById(id).get();
        model.addAttribute("dp", dp);
        return "/datPhong/viewUpdate";
    }
    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("dp") @Valid DatPhong dp, Errors errors) {
        if (errors.hasErrors()) {
            return "/datPhong/index";
        }
        dpRepo.save(dp);
        return "redirect:/dat-phong/index";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("dp") @Valid DatPhong dp, Errors errors) {
        if (errors.hasErrors()) {
            return "/datPhong/index";
        }
        dpRepo.save(dp);
        return "redirect:/dat-phong/index";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        dpRepo.deleteById(id);
        return "redirect:/dat-phong/index";
    }
    @GetMapping("/page")
    public String page(@RequestParam(name = "page", defaultValue = "0", required = false) Integer page, Model model) {
        int pageSize = 5;
        Sort sort = Sort.by(Sort.Direction.DESC, "tenKhachHang");
        Pageable pageable = PageRequest.of(page, pageSize, sort);
        model.addAttribute("page", dpRepo.findAll(pageable));
        return "/datPhong/page";
    }
    @GetMapping("/search")
    public String search(@RequestParam("min") Integer min, @RequestParam("min") Integer max, Model model, @ModelAttribute("dp") DatPhong dp) {
//        model.addAttribute("dpList", dpRepo.findDatPhongsBySoDemDatBetweenMinAndMax(min, max));
        return "/datPhong/index";
    }
}
