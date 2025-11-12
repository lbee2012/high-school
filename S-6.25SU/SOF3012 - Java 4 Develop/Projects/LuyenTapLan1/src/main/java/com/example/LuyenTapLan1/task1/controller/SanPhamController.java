package com.example.LuyenTapLan1.task1.controller;

import com.example.LuyenTapLan1.task1.model.PhanLoai;
import com.example.LuyenTapLan1.task1.model.SanPham;
import com.example.LuyenTapLan1.task1.repository.PhanLoaiRepository;
import com.example.LuyenTapLan1.task1.repository.SanPhamRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "controller", value = {
        "/task1/hien-thi", //GET
        "/task1/them", //GET
        "/task1/view-sua", //GET
        "/task1/sua", //GET
        "/task1/xoa", //GET
})
public class SanPhamController extends HttpServlet {
    SanPhamRepository spRepo = new SanPhamRepository();
    PhanLoaiRepository plRepo = new PhanLoaiRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("hien-thi")) {
            hienThiSP(req, resp);
        } else if (uri.contains("view-sua")) {
            viewSuaSP(req, resp);
        } else if (uri.contains("xoa")) {
            xoaSP(req, resp);
        }
    }

    private void xoaSP(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        spRepo.delete(id);
        resp.sendRedirect("/task1/hien-thi");
    }

    private void viewSuaSP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listPL", plRepo.getAll());
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("sp", spRepo.getOne(id));
        req.getRequestDispatcher("/task1/viewSua.jsp").forward(req, resp);
    }

    private void hienThiSP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listPL", plRepo.getAll());
        req.setAttribute("listSP", spRepo.getAll());
        req.getRequestDispatcher("/task1/hienThi.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("them")) {
            themSP(req, resp);
        } else if (uri.contains("sua")) {
            suaSP(req, resp);
        }
    }

    private void suaSP(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String tenSanPham = req.getParameter("tenSanPham");
        String moTa = req.getParameter("moTa");
        Float giaBan = Float.valueOf(req.getParameter("giaBan"));
        Integer soLuongTon = Integer.valueOf(req.getParameter("soLuongTon"));
        Boolean conHang = Boolean.valueOf(req.getParameter("conHang"));

        Integer idPhanLoai = Integer.valueOf(req.getParameter("phanLoai"));
        PhanLoai pl = plRepo.getOne(idPhanLoai);

        SanPham sp = new SanPham(id, tenSanPham, moTa, giaBan, soLuongTon, conHang, pl);
        spRepo.update(sp);

        resp.sendRedirect("/task1/hien-thi");
    }

    private void themSP(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String tenSanPham = req.getParameter("tenSanPham");
        String moTa = req.getParameter("moTa");
        Float giaBan = Float.valueOf(req.getParameter("giaBan"));
        Integer soLuongTon = Integer.valueOf(req.getParameter("soLuongTon"));
        Boolean conHang = Boolean.valueOf(req.getParameter("conHang"));

        Integer idPhanLoai = Integer.valueOf(req.getParameter("phanLoai"));
        PhanLoai pl = plRepo.getOne(idPhanLoai);

        SanPham sp = new SanPham(null, tenSanPham, moTa, giaBan, soLuongTon, conHang, pl);
        spRepo.add(sp);

        resp.sendRedirect("/task1/hien-thi");
    }
}
