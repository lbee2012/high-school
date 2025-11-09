package com.example.LuyenTapLan2.de3.controller;

import com.example.LuyenTapLan2.de3.model.Phim;
import com.example.LuyenTapLan2.de3.model.TheLoai;
import com.example.LuyenTapLan2.de3.repository.PhimRepository;
import com.example.LuyenTapLan2.de3.repository.TheLoaiRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "phimController", value = {
        "/de3/hien-thi",
        "/de3/chi-tiet",
        "/de3/them",
        "/de3/xem-sua",
        "/de3/sua",
        "/de3/xoa",
        "/de3/tim-kiem",
        "/de3/sap-xep",
        "/de3/phan-trang",
})
public class PhimController extends HttpServlet {
    PhimRepository pr = new PhimRepository();
    TheLoaiRepository tlr = new TheLoaiRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("hien-thi")) {
            hienThiP(req, resp);
        } else if (uri.contains("chi-tiet")) {
            chiTietP(req, resp);
        } else if (uri.contains("xem-sua")) {
            xemSuaP(req, resp);
        } else if (uri.contains("xoa")) {
            xoaP(req, resp);
        } else if (uri.contains("tim-kiem")) {
            timKiemP(req, resp);
        } else if (uri.contains("sap-xep")) {
            sapXepP(req, resp);
        } else if (uri.contains("phan-trang")) {
            phanTrangP(req, resp);
        }
    }

    private void phanTrangP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int page = 0;
        int pageSize = 3;
        String pageParam = req.getParameter("page");
        if (pageParam != null & !pageParam.isEmpty()) {
            page = Integer.valueOf(pageParam);
        }
        req.setAttribute("page", page);

        req.setAttribute("listP", pr.pageBy3(page, pageSize));
        req.setAttribute("listTL", tlr.getAll());
        req.getRequestDispatcher("/de3/hien-thi.jsp").forward(req, resp);
    }

    private void sapXepP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listP", pr.sortByNamPhatHanh());
        req.setAttribute("listTL", tlr.getAll());
        req.getRequestDispatcher("/de3/hien-thi.jsp").forward(req, resp);
    }

    private void timKiemP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tenPhim = req.getParameter("tenPhim");
        req.setAttribute("listP", pr.searchByTen(tenPhim));
        req.setAttribute("listTL", tlr.getAll());
        req.getRequestDispatcher("/de3/hien-thi.jsp").forward(req, resp);
    }

    private void xoaP(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        pr.delete(id);
        resp.sendRedirect("/de3/hien-thi");
    }

    private void xemSuaP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("p", pr.getOne(id));
        req.setAttribute("listTL", tlr.getAll());
        req.getRequestDispatcher("/de3/xem-sua.jsp").forward(req, resp);
    }

    private void chiTietP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("p", pr.getOne(id));
        req.setAttribute("listTL", tlr.getAll());
        req.getRequestDispatcher("/de3/chi-tiet.jsp").forward(req, resp);
    }

    private void hienThiP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listP", pr.getAll());
        req.setAttribute("listTL", tlr.getAll());
        req.getRequestDispatcher("/de3/hien-thi.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("them")) {
            themP(req, resp);
        } else if (uri.contains("sua")) {
            suaP(req, resp);
        }
    }

    private void suaP(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String tenPhim = req.getParameter("tenPhim");
        String daoDien = req.getParameter("daoDien");
        Integer namPhatHanh = Integer.valueOf(req.getParameter("namPhatHanh"));
        Boolean dangChieu = Boolean.valueOf(req.getParameter("dangChieu"));

        Integer idTheLoai = Integer.valueOf(req.getParameter("tl"));
        TheLoai tl = tlr.getOne(idTheLoai);

        Phim p = new Phim(id, tenPhim, daoDien, namPhatHanh, dangChieu, tl);
        pr.update(p);

        resp.sendRedirect("/de3/hien-thi");
    }

    private void themP(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String tenPhim = req.getParameter("tenPhim");
        String daoDien = req.getParameter("daoDien");
        Integer namPhatHanh = Integer.valueOf(req.getParameter("namPhatHanh"));
        Boolean dangChieu = Boolean.valueOf(req.getParameter("dangChieu"));

        Integer idTheLoai = Integer.valueOf(req.getParameter("tl"));
        TheLoai tl = tlr.getOne(idTheLoai);

        Phim p = new Phim(null, tenPhim, daoDien, namPhatHanh, dangChieu, tl);
        pr.add(p);

        resp.sendRedirect("/de3/hien-thi");
    }
}
