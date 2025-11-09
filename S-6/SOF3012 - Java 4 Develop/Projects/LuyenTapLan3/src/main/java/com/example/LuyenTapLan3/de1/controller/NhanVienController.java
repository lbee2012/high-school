package com.example.LuyenTapLan3.de1.controller;

import com.example.LuyenTapLan3.de1.model.ChucVu;
import com.example.LuyenTapLan3.de1.model.NhanVien;
import com.example.LuyenTapLan3.de1.repository.ChucVuRepo;
import com.example.LuyenTapLan3.de1.repository.NhanVienRepo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "nvController", value = {
        "/de1/index",
        "/de1/detail",
        "/de1/add",
        "/de1/view-update",
        "/de1/update",
        "/de1/delete",
        "/de1/search",
        "/de1/sort",
        "/de1/page",
})

public class NhanVienController extends HttpServlet {
    ChucVuRepo cvr = new ChucVuRepo();
    NhanVienRepo nvr = new NhanVienRepo();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("index")) {
            indexNV(req, resp);
        } else if (uri.contains("detail")) {
            detailNV(req, resp);
        } else if (uri.contains("view-update")) {
            viewUpdateNV(req, resp);
        } else if (uri.contains("delete")) {
            deleteNV(req, resp);
        } else if (uri.contains("search")) {
            searchNV(req, resp);
        } else if (uri.contains("sort")) {
            sortNV(req, resp);
        } else if (uri.contains("page")) {
            pageNV(req, resp);
        }
    }

    private void pageNV(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int page = 0;
        int pageSize = 5;
        String param = req.getParameter("page");
        if (param != null && !param.isEmpty()) {
            page = Integer.valueOf(param);
        }
        req.setAttribute("page", page);
        req.setAttribute("listNV", nvr.pageBy5(page, pageSize));
        req.setAttribute("listCV", cvr.getAll());
        req.getRequestDispatcher("/de1/index.jsp").forward(req, resp);
    }

    private void sortNV(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listNV", nvr.sortByTen());
        req.setAttribute("listCV", cvr.getAll());
        req.getRequestDispatcher("/de1/index.jsp").forward(req, resp);
    }

    private void searchNV(HttpServletRequest req, HttpServletResponse resp) {
        String ten = req.getParameter("ten");
        String tenDem = req.getParameter("tenDem");
        String ho = req.getParameter("ho");
    }

    private void deleteNV(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        nvr.delete(id);
        resp.sendRedirect("/de1/index");
    }

    private void viewUpdateNV(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("nv", nvr.getOne(id));
        req.setAttribute("listCV", cvr.getAll());
        req.getRequestDispatcher("/de1/view-update.jsp").forward(req, resp);
    }

    private void detailNV(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("nv", nvr.getOne(id));
        req.setAttribute("listCV", cvr.getAll());
        req.getRequestDispatcher("/de1/detail.jsp").forward(req, resp);
    }

    private void indexNV(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listNV", nvr.getAll());
        req.setAttribute("listCV", cvr.getAll());
        req.getRequestDispatcher("/de1/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("add")) {
            addNV(req, resp);
        } else if (uri.contains("update")) {
            updateNV(req, resp);
        }
    }

    private void updateNV(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String ma = req.getParameter("ma");
        String ten = req.getParameter("ten");
        String tenDem = req.getParameter("tenDem");
        String ho = req.getParameter("ho");
        String gioiTinh = req.getParameter("gioiTinh");
        String diaChi = req.getParameter("diaChi");
        String sdt = req.getParameter("sdt");
        String matKhau = req.getParameter("matKhau");

        Integer idCV = Integer.valueOf(req.getParameter("cv"));
        ChucVu cv = cvr.getOne(idCV);

        Integer trangThai = Integer.valueOf(req.getParameter("trangThai"));

        NhanVien nv = new NhanVien(id, ma, ten, tenDem, ho, gioiTinh, diaChi, sdt, matKhau, cv, trangThai);
        nvr.update(nv);
        resp.sendRedirect("/de1/index");
    }

    private void addNV(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String ma = req.getParameter("ma");
        String ten = req.getParameter("ten");
        String tenDem = req.getParameter("tenDem");
        String ho = req.getParameter("ho");
        String gioiTinh = req.getParameter("gioiTinh");
        String diaChi = req.getParameter("diaChi");
        String sdt = req.getParameter("sdt");
        String matKhau = req.getParameter("matKhau");

        Integer idCV = Integer.valueOf(req.getParameter("cv"));
        ChucVu cv = cvr.getOne(idCV);

        Integer trangThai = Integer.valueOf(req.getParameter("trangThai"));

        NhanVien nv = new NhanVien(null, ma, ten, tenDem, ho, gioiTinh, diaChi, sdt, matKhau, cv, trangThai);
        nvr.add(nv);
        resp.sendRedirect("/de1/index");
    }
}
