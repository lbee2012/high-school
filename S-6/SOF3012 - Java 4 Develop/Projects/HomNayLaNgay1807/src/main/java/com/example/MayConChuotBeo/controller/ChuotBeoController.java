package com.example.MayConChuotBeo.controller;

import com.example.MayConChuotBeo.repository.ChuotBeoRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "chuotBeoController", value = {
        "/chuot-gaming/hien-thi", //GET
        "/chuot-gaming/them", //POST
        "/chuot-gaming/view-chinh-sua", //GET
        "/chuot-gaming/sua", //POST
        "/chuot-gaming/xoa", //GET
        "/chuot-gaming/chi-tiet", //GET
        "/chuot-gaming/sap-xep", //GET
        "/chuot-gaming/tim-kiem", //GET
        "/chuot-gaming/phan-trang", //GET
})

public class ChuotBeoController extends HttpServlet {
    ChuotBeoRepository cbRepo = new ChuotBeoRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("hien-thi")) {
            hienThi(req, resp);
        }
    }

    private void hienThi(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("danhSach", cbRepo.getAll());
        req.getRequestDispatcher("/chuot-gaming/hienThi.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("them")) {
            themChuotBeo(req, resp);
        }
    }

    private void themChuotBeo(HttpServletRequest req, HttpServletResponse resp) {
        String ten
    }
}
