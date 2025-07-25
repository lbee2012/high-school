package com.example.LuyenTapLan1.task5.controller;

import com.example.LuyenTapLan1.task5.repository.NguoiDungRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "controller", value = {
        "/task5/hien-thi", //GET
        "/task5/them", //POST
        "/task5/view-sua", //GET
        "/task5/sua", //POST
        "/task5/xoa", //GET
})

public class NguoiDungController extends HttpServlet {
    NguoiDungRepository ndRepo = new NguoiDungRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("hien-thi")) {
            hienThiND(req, resp);
        } else if (uri.contains("view-sua")) {
            viewSuaND(req, resp);
        } else if (uri.contains("xoa")) {
            xoaND(req, resp);
        }
    }

    private void xoaND(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void viewSuaND(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void hienThiND(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listND", ndRepo.getAll());
        req.getRequestDispatcher("/task5/hienThi.jsp").forward(req, resp);
    }
}
