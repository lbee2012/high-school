package com.example.sd20203.buoi4prac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/buoi4prac")
public class B4PracController {
    @GetMapping("/hien-thi")
    public String hienThi(Model m) {
        LongBeo lb = new LongBeo("SD20203", "TH03115", "long", 18, 65f);
        m.addAttribute("long", lb);

        return "/buoi4prac/hienThi";
    }
}
