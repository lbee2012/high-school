package com.example.LuyenTapLan2.de1.controller;

import com.example.LuyenTapLan2.de1.model.DanhMuc;
import com.example.LuyenTapLan2.de1.model.SanPham;
import com.example.LuyenTapLan2.de1.repository.DanhMucRepo;
import com.example.LuyenTapLan2.de1.repository.SanPhamRepo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "spController", value = {
        "/de1/hien-thi",
        "/de1/detail",
        "/de1/add",
        "/de1/view-update",
        "/de1/update",
        "/de1/delete",
        "/de1/search",
        "/de1/sort",
        "/de1/page",
})

public class SanPhamController extends HttpServlet {
    SanPhamRepo spr = new SanPhamRepo();
    DanhMucRepo dmr = new DanhMucRepo();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("hien-thi")) {
            hienThiSP(req, resp);
        } else if (uri.contains("detal")) {
            detailSP(req, resp);
        } else if (uri.contains("view-update")) {
            viewUpdateSP(req, resp);
        } else if (uri.contains("delete")) {
            deleteSP(req, resp);
        } else if (uri.contains("search")) {
            searchSP(req, resp);
        } else if (uri.contains("sort")) {
            sortSP(req, resp);
        } else if (uri.contains("page")) {
            pageSP(req, resp);
        }
    }

    private void pageSP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int page = 0;
        int pageSize = 5;
        String pageParam = req.getParameter("page");
        if (pageParam != null & !pageParam.isEmpty()) {
            page = Integer.valueOf(pageParam);
        }
        req.setAttribute("page", page);

        req.setAttribute("listSP", spr.pageBy5(page, pageSize));
        req.setAttribute("listDM", dmr.getAll());
        req.getRequestDispatcher("/de1/hien-thi.jsp").forward(req, resp);
    }

    private void sortSP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listSP", spr.sortByGia());
        req.setAttribute("lsitDM", dmr.getAll());
        req.getRequestDispatcher("/de1/hien-thi.jsp").forward(req, resp);
    }

    private void searchSP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tenSP = req.getParameter("tenSP");
        req.setAttribute("listSP", spr.searchByTen(tenSP));
        req.setAttribute("lsitDM", dmr.getAll());
        req.getRequestDispatcher("/de1/hien-thi.jsp").forward(req, resp);
    }

    private void deleteSP(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        spr.delete(id);
        resp.sendRedirect("/de1/hien-thi");
    }

    private void viewUpdateSP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("sp", spr.getOne(id));
        req.setAttribute("listDM", dmr.getAll());
        req.getRequestDispatcher("/de1/view-update.jsp").forward(req, resp);
    }

    private void detailSP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("sp", spr.getOne(id));
        req.getRequestDispatcher("/de1/detail.jsp").forward(req, resp);
    }

    private void hienThiSP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listSP", spr.getAll());
        req.setAttribute("listDM", dmr.getAll());
        req.getRequestDispatcher("/de1/hien-thi.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("add")) {
            addSP(req, resp);
        } else if (uri.contains("update")) {
            updateSP(req, resp);
        }
    }

    private void updateSP(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String tenSP = req.getParameter("tenSP");
        String moTa = req.getParameter("moTa");
        Float giaBan = Float.valueOf(req.getParameter("giaBan"));
        Integer soLuong = Integer.valueOf(req.getParameter("soLuong"));
        Boolean conHang = Boolean.valueOf(req.getParameter("conHang"));

        Integer idDanhMuc = Integer.valueOf(req.getParameter("dm"));
        DanhMuc dm = dmr.getOne(idDanhMuc);

        SanPham sp = new SanPham(id, tenSP, moTa, giaBan, soLuong, conHang, dm);
        spr.update(sp);

        resp.sendRedirect("/de1/hien-thi");
    }

    private void addSP(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String tenSP = req.getParameter("tenSP");
        String moTa = req.getParameter("moTa");
        Float giaBan = Float.valueOf(req.getParameter("giaBan"));
        Integer soLuong = Integer.valueOf(req.getParameter("soLuong"));
        Boolean conHang = Boolean.valueOf(req.getParameter("conHang"));

        Integer idDanhMuc = Integer.valueOf(req.getParameter("dm"));
        DanhMuc dm = dmr.getOne(idDanhMuc);

        SanPham sp = new SanPham(null, tenSP, moTa, giaBan, soLuong, conHang, dm);
        spr.add(sp);

        resp.sendRedirect("/de1/hien-thi");
    }
}
