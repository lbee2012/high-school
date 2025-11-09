package com.example.buoi2.controller;

import com.example.buoi2.model.SinhVien;
import com.example.buoi2.repository.SinhVienRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "SinhVienController", value = {
        "/sinh-vien/hien-thi", // GET
        "/sinh-vien/them", // POST
        "/sinh-vien/view-update", // GET
        "/sinh-vien/update", // POST
        "/sinh-vien/xoa", // GET
        "/sinh-vien/chi-tiet", // GET
        "/sinh-vien/sap-xep", // GET
        "/sinh-vien/search", // GET
        "/sinh-vien/phan-trang", // GET
})
public class SinhVienController extends HttpServlet {
    SinhVienRepository svRepo = new SinhVienRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if(uri.contains("hien-thi")) {
            hienThi(req, resp);
        } else if(uri.contains("chi-tiet")) {
            chiTiet(req, resp);
        } else if(uri.contains("view-update")) {
            viewUpdate(req, resp);
        } else if(uri.contains("xoa")) {
            xoaSinhVien(req,resp);
        } else if(uri.contains("sap-xep")) {
            sapXep(req, resp);
        } else if(uri.contains("search")) {
            search(req, resp);
        } else if(uri.contains("phan-trang")) {
            phanTrang(req, resp);
        }
    }

    private void phanTrang(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int pageSize = 5;
        int page = 0;
        if (req.getParameter("page") != null & !req.getParameter("page").isEmpty()) {
            page = Integer.valueOf(req.getParameter("page"));
        }
        req.setAttribute("danhSach", svRepo.phanTrang(page, pageSize));
        req.setAttribute("page", page);
        req.getRequestDispatcher("/buoi2/hien-thi.jsp").forward(req, resp);
    }

    private void search(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ten = req.getParameter("ten");
        req.setAttribute("danhSach", svRepo.searchByTen(ten));
        req.getRequestDispatcher("/buoi2/hien-thi.jsp").forward(req, resp);
    }

    private void sapXep(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("danhSach", svRepo.sapXepTheoNamSinh());
        req.getRequestDispatcher("/buoi2/hien-thi.jsp").forward(req, resp);
    }

    private void xoaSinhVien(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        svRepo.xoaSinhVien(id);
        resp.sendRedirect("/sinh-vien/hien-thi");
    }

    private void viewUpdate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("sinhVien", svRepo.getOne(id));
        req.getRequestDispatcher("/buoi2/view-update.jsp").forward(req, resp);
    }

    private void chiTiet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("sinhVien", svRepo.getOne(id));
        req.getRequestDispatcher("/buoi2/chi-tiet.jsp").forward(req, resp);
    }

    private void hienThi(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("danhSach", svRepo.getAll());
        req.getRequestDispatcher("/buoi2/hien-thi.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if(uri.contains("them")) {
            themSinhVien(req, resp);
        } else if(uri.contains("update")) {
            updateSinhVien(req, resp);
        }
    }

    private void updateSinhVien(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String ten = req.getParameter("ten");
        String diaChi = req.getParameter("diaChi");
        Integer namSinh = Integer.valueOf(req.getParameter("namSinh"));

        svRepo.suaSinhVien(new SinhVien(id, ten, diaChi, namSinh));
        resp.sendRedirect("/sinh-vien/hien-thi");
    }

    private void themSinhVien(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String ten = req.getParameter("ten");
        String diaChi = req.getParameter("diaChi");
        Integer namSinh = Integer.valueOf(req.getParameter("namSinh"));

        svRepo.themSinhVien(new SinhVien(null, ten, diaChi, namSinh));
        resp.sendRedirect("/sinh-vien/hien-thi");
    }
}
