package com.example.LuyenTapLan3.de3.controller;

import com.example.LuyenTapLan3.de3.repository.LoaiSPRepo;
import com.example.LuyenTapLan3.de3.repository.SanPhamRepo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "spController", value = {
        "/de3/index",
        "/de3/detail",
        "/de3/add",
        "/de3/view-update",
        "/de3/update",
        "/de3/search",
        "/de3/page",
})
public class SanPhamController extends HttpServlet {
    LoaiSPRepo lspr = new LoaiSPRepo();
    SanPhamRepo spr = new SanPhamRepo();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("index")) {
            indexSP(req, resp);
        } else if (uri.contains("detail")) {
            detailSP(req, resp);
        } else if (uri.contains("view-update")) {
            viewUpdateSP(req, resp);
        } else if (uri.contains("search")) {
            searchSP(req, resp);
        } else if (uri.contains("page")) {
            pageSP(req, resp);
        }
    }

    private void pageSP(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void searchSP(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void viewUpdateSP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("sp", spr.getOne(id));
        req.setAttribute("listLSP", lspr.getAll());
        req.getRequestDispatcher("/de3/index.jsp").forward(req, resp);
    }

    private void detailSP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("sp", spr.getOne(id));
        req.setAttribute("listLSP", lspr.getAll());
        req.getRequestDispatcher("/de3/index.jsp").forward(req, resp);
    }

    private void indexSP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listSP", spr.getAll());
        req.setAttribute("listLSP", lspr.getAll());
        req.getRequestDispatcher("/de3/index.jsp").forward(req, resp);
    }
}
