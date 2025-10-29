package com.example.sd20203.buoi3;

import com.example.sd20203.buoi2.LoginRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/buoi3")
public class Buoi3Controller {
    @GetMapping("/hien-thi")
    public String hienThi(Model m) {
        m.addAttribute(new Date());
        m.addAttribute("now", new Date());
        return "/buoi3/hienThi";
    }
    @ModelAttribute("thoiGian")
    public Date getThoiGian() {
        return new Date();
    }

    @GetMapping("/url1")
    public String url1(Model m, @RequestParam("message") String message) {
        m.addAttribute("message", message);
        return "/buoi3/demoForwardRedirect";
    }

    //method: forward
    @GetMapping("/fwd")
    public String fwd(Model m) {
        m.addAttribute("message", "From fwd");
        return "forward:/buoi3/url1";
    }

    //method: redirect
    @GetMapping("/red")
    public String red(RedirectAttributes ra) {
        ra.addAttribute("message", "From red");
        return "redirect:/buoi3/url1";
    }

    @ResponseBody
    @GetMapping("/xin-chao")
    public String xinChao() {
        return "Xin chao cac ban";
    }

    @ResponseBody
    @GetMapping("/danh-sach")
    public List<LoginRequest> getDanhSach() {
        return Arrays.asList(
            new LoginRequest("admin1", "1"),
            new LoginRequest("admin2", "2"),
            new LoginRequest("admin3", "3"),
            new LoginRequest("admin4", "4")
        );
    }
}
