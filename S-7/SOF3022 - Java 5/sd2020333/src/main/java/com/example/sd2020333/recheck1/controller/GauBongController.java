package com.example.sd2020333.recheck1.controller;

import com.example.sd2020333.recheck1.model.GauBong;
import com.example.sd2020333.recheck1.service.GauBongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/gau-bong")
public class GauBongController {
    @Autowired
    GauBongService gbService;

    @GetMapping("/index")
    public String index(Model m) {
        m.addAttribute("listGB", gbService.getAll());
        return "/gauBong/index";
    }
    @PostMapping("/add")
    public String add(GauBong gb) {
        gbService.addGB(gb);
        return "redirect:/gau-bong/index";
    }
    @GetMapping("/update/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model m) {
        GauBong gb = gbService.getOne(id);
        m.addAttribute("gb", gb);
        return "/gauBong/viewUpdate";
    }
    @PostMapping("/update")
    public String update(GauBong gb) {
        gbService.updateGB(gb);
        return "redirect:/gau-bong/index";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        gbService.deleteGB(id);
        return "redirect:/gau-bong/index";
    }
}
