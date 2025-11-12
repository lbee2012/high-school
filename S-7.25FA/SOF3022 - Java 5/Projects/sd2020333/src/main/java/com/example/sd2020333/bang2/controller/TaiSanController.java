package com.example.sd2020333.bang2.controller;

import com.example.sd2020333.bang2.model.NhanVien;
import com.example.sd2020333.bang2.model.TaiSan;
import com.example.sd2020333.bang2.repository.NhanVienRepository;
import com.example.sd2020333.bang2.repository.TaiSanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tai-san")
public class TaiSanController {
    @Autowired
    TaiSanRepository tsRepo;

    @Autowired
    NhanVienRepository nvRepo;

    @ModelAttribute("nvList")
    public List<NhanVien> getAllNV() {
        return nvRepo.findAll();
    }

    @GetMapping("/index")
    public String index(Model m) {
        m.addAttribute("tsList", tsRepo.findAll());
        return "/taiSan/index";
    }
    @PostMapping("/add")
    public String add(TaiSan ts) {
        tsRepo.save(ts);
        return "redirect:/tai-san/index";
    }
    @GetMapping("/update/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model m) {
        TaiSan ts = tsRepo.findById(id).get();
        m.addAttribute("ts", ts);
        return "redirect:/tai-san/index";
    }
    @PostMapping("/update")
    public String update(TaiSan ts) {
        tsRepo.save(ts);
        return "redirect:/tai-san/index";
    }
    @GetMapping("/delete")
    public String delete(Integer id) {
        tsRepo.deleteById(id);
        return "redirect:/tai-san/index";
    }
//
//    @GetMapping("/page")
//    public String paging(@RequestParam)
}
