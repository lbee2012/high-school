package com.example.sd2020333.buoi13.controller;

import com.example.sd2020333.buoi13.model.CapSach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo-bean1")
public class DemoBean1 {
    @Autowired
    CapSach capSach;

    @GetMapping("/edit")
    @ResponseBody
    public CapSach editCapSach() {
        capSach.setId(999);
        return capSach;
    }
}
