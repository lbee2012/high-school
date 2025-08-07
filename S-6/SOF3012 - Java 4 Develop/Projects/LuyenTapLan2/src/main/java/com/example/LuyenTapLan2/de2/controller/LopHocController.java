package com.example.LuyenTapLan2.de2.controller;

import com.example.LuyenTapLan2.de2.repository.GiaoVienRepo;
import com.example.LuyenTapLan2.de2.repository.LopHocRepo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "lhController", value = {
        "/de2/hien-thi",
        "/de2/chi-tiet",
        "/de2/them",
        "/de2/view-sua",
        "/de2/sua",
        "/de2/xoa",
        "/de2/tim-kiem",
        "/de2/sap-xep",
        "/de2/phan-trang",
})

public class LopHocController extends HttpServlet {
    LopHocRepo lhr = new LopHocRepo();
    GiaoVienRepo gvr = new GiaoVienRepo();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("hien-thi")) {
            hienThiLH(req, resp);
        } else if (uri.contains("chi-tiet")) {
            chiTietLH(req, resp);
        } else if (uri.contains("view-sua")) {
            viewSuaLH(req, resp);
        } else if (uri.contains("xoa")) {
            xoaLH(req, resp);
        } else if (uri.contains("tim-kiem")) {
            timKiemLH(req, resp);
        } else if (uri.contains("sap-xep")) {
            sapXepLH(req, resp);
        } else if (uri.contains("phan-trang")) {
            phanTrangLH(req, resp);
        }
    }

    private void phanTrangLH(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void sapXepLH(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void timKiemLH(HttpServletRequest req, HttpServletResponse resp) {
        String tenLop = req.getParameter("tenLop");
        req.setAttribute("listLH", lhr.searchByTen(tenLop));
    }

    private void xoaLH(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        lhr.delete(id);
        resp.sendRedirect("/de2/hien-thi");
    }

    private void viewSuaLH(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("oneLH", lhr.getOne(id));
        req.setAttribute("listGV", gvr.getAll());
        req.getRequestDispatcher("/de2/view-sua.jsp").forward(req, resp);
    }

    private void chiTietLH(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("oneLH", lhr.getOne(id));
        req.setAttribute("listGV", gvr.getAll());
        req.getRequestDispatcher("/de2/chi-tiet.jsp").forward(req, resp);
    }

    private void hienThiLH(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listLH", lhr.getAll());
        req.setAttribute("listGV", gvr.getAll());
        req.getRequestDispatcher("/de2/hien-thi.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("them")) {
            themLH(req, resp);
        } else if (uri.contains("sua")) {
            suaLH(req, resp);
        }
    }

    private void suaLH(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void themLH(HttpServletRequest req, HttpServletResponse resp) {
    }
}
