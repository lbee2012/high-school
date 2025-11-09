package com.example.LuyenTapLan1.task3.controller;

import com.example.LuyenTapLan1.task3.model.NhanVien;
import com.example.LuyenTapLan1.task3.model.PhongBan;
import com.example.LuyenTapLan1.task3.repository.NhanVienRepository;
import com.example.LuyenTapLan1.task3.repository.PhongBanRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "controller", value = {
        "/task3/hien-thi", //GET
        "/task3/them", //POST
        "/task3/view-sua", //GET
        "/task3/sua", //POST
        "/task3/xoa", //GET
})

public class NhanVienController extends HttpServlet {
    NhanVienRepository nvRepo = new NhanVienRepository();
    PhongBanRepository pbRepo = new PhongBanRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("hien-thi")) {
            hienThiNV(req, resp);
        } else if (uri.contains("view-sua")) {
            viewSuaNV(req, resp);
        } else if (uri.contains("xoa")) {
            xoaNV(req, resp);
        }
    }

    private void xoaNV(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        nvRepo.delete(id);
        resp.sendRedirect("/task3/hien-thi");
    }

    private void viewSuaNV(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("nhanVien", nvRepo.getOne(id));
        req.setAttribute("listPB", pbRepo.getAll());
        req.getRequestDispatcher("/task3/viewSua.jsp").forward(req, resp);
    }

    private void hienThiNV(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listNV", nvRepo.getAll());
        req.setAttribute("listPB", pbRepo.getAll());
        req.getRequestDispatcher("/task3/hienThi.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("them")) {
            themNV(req, resp);
        } else if (uri.contains("sua")) {
            suaNV(req, resp);
        }
    }

    private void suaNV(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String tenNhanVien = req.getParameter("tenNhanVien");
        String ngaySinh = req.getParameter("tenNhanVien");
        Boolean gioiTinh = Boolean.valueOf(req.getParameter("gioiTinh"));
        Float luong = Float.valueOf(req.getParameter("luong"));

        Integer idPhongBan = Integer.valueOf(req.getParameter("phongBan"));
        PhongBan pb = pbRepo.getOne(idPhongBan);

        NhanVien nv = new NhanVien(id, tenNhanVien, ngaySinh, gioiTinh, luong, pb);
        nvRepo.update(nv);
        resp.sendRedirect("/task3/hien-thi");
    }

    private void themNV(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String tenNhanVien = req.getParameter("tenNhanVien");
        String ngaySinh = req.getParameter("tenNhanVien");
        Boolean gioiTinh = Boolean.valueOf(req.getParameter("gioiTinh"));
        Float luong = Float.valueOf(req.getParameter("luong"));

        Integer idPhongBan = Integer.valueOf(req.getParameter("phongBan"));
        PhongBan pb = pbRepo.getOne(idPhongBan);

        NhanVien nv = new NhanVien(null, tenNhanVien, ngaySinh, gioiTinh, luong, pb);
        nvRepo.add(nv);
        resp.sendRedirect("/task3/hien-thi");
    }
}