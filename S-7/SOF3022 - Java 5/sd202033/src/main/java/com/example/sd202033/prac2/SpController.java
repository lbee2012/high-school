package com.example.sd202033.prac2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/prac2")
public class SpController {
    @Autowired
    SanPhamService sps;

    @GetMapping("/index")
    public String index(Model m) {
        m.addAttribute("spList", sps.getAll());
        return "/prac2/index";
    }

    @PostMapping("/add")
    public String add(SanPham sp) {
        sps.addSP(sp);
        return "redirect:/prac2/index";
    }

    @GetMapping("/view-update/{id}")
    public String viewUpdate(Model m, @PathVariable("id") Integer id) {
        SanPham sp = sps.getOne(id);
        m.addAttribute("sp", sp);
        return "/prac2/viewUpdate";
    }

    @PostMapping("/update")
    public String update(SanPham sp) {
        sps.updateSP(sp);
        return "redirect:/prac2/index";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        sps.deleteSP(id);
        return "redirect:/prac2/index";
    }
}
