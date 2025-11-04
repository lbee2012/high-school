package com.example.sd202033.prac1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/prac1")
public class SinhVienController {
    @Autowired
    SinhVienService svs;

    @GetMapping("/index")
    public String index(Model m) {
        m.addAttribute("svList", svs.getAll());
        return "/prac1/index";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model m, @PathVariable("id") Integer id) {
        SinhVien sv = svs.getOne(id);
        m.addAttribute("sv", sv);
        return "/prac1/detail";
    }

    @PostMapping("/add")
    public String add(SinhVien sv) {
        svs.addSV(sv);
        return "redirect:/prac1/index";
    }

    @GetMapping("/view-update/{id}")
    public String viewUpdate(Model m, @PathVariable("id") Integer id) {
        SinhVien sv = svs.getOne(id);
        m.addAttribute("sv", sv);
        return "/prac1/viewUpdate";
    }

    @PostMapping("/update")
    public String update(SinhVien sv) {
        svs.updateSV(sv);
        return "redirect:/prac1/index";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        svs.delSV(id);
        return "redirect:/prac1/index";
    }

    @GetMapping("/search")
    public String search(Model m, String ten) {
        List<SinhVien> svList = svs.searchSV(ten);
        m.addAttribute("svList", svList);
        return "/prac1/index";
    }

}
