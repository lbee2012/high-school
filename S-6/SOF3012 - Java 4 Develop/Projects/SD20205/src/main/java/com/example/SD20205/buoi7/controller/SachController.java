package com.example.SD20205.buoi7.controller;

import com.example.SD20205.buoi7.repository.SachRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "sachController", value = {
        "/buoi7/index", //GET
        "/buoi7/detail", //GET
        "/buoi7/add", //POST
        "/buoi7/view-update", //GET
        "/buoi7/update", //POST
        "/buoi7/delete", //GET
//        "/buoi7/search", //GET
//        "/buoi7/sort", //GET
})
public class SachController extends HttpServlet {
    SachRepository sRepo = new SachRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("index")) {
            show(req, resp);
        }
    }

    private void show(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listSach", sRepo.getAll());
        req.getRequestDispatcher("/buoi7/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("add")) {
            addS(req, resp);
        }
    }

    private void addS(HttpServletRequest req, HttpServletResponse resp) {
        String ten = req.getParameter("ten");
    }
}
