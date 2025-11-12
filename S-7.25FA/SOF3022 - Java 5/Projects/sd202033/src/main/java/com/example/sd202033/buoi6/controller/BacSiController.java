package com.example.sd202033.buoi6.controller;

import com.example.sd202033.buoi6.model.BacSi;
import com.example.sd202033.buoi6.service.BacSiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/buoi6")
public class BacSiController {
    @Autowired
    BacSiService bss;
    @GetMapping("/index")
    public String index(Model m) {
        m.addAttribute("bsList", bss.getAll());
        return "/buoi6/index";
    }

    @PostMapping("/add")
    public String add(BacSi bs) {
        bss.addBS(bs);
        return "redirect:/buoi6/index";
    }

    @GetMapping("view-update/{id}")
    public String viewUpd(@PathVariable("id") Integer id, Model m) {
        BacSi bs = bss.getOne(id);
        m.addAttribute("bs", bs);
        return "/buoi6/viewUpdate";
    }
    @PostMapping("/update")
    public String upd(BacSi bs) {
        bss.updBS(bs);
        return "redirect:/buoi6/index";
    }

    @GetMapping("delete")
    public String delete(@RequestParam("id") Integer id) {
        bss.delBS(id);
        return "redirect:/buoi6/index";
    }
}
