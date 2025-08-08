package com.example.LuyenTapLan2.de4.controller;

import com.example.LuyenTapLan2.de4.model.MonAn;
import com.example.LuyenTapLan2.de4.model.NhaHang;
import com.example.LuyenTapLan2.de4.repository.MonAnRepo;
import com.example.LuyenTapLan2.de4.repository.NhaHangRepo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "monAnController", value = {
        "/mon-an/index",
        "/mon-an/detail",
        "/mon-an/add",
        "/mon-an/view-update",
        "/mon-an/update",
        "/mon-an/delete",
        "/mon-an/search",
        "/mon-an/page",
})
public class MonAnController extends HttpServlet {
    MonAnRepo mar = new MonAnRepo();
    NhaHangRepo nhr = new NhaHangRepo();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("index")) {
            indexMA(req, resp);
        } else if (uri.contains("detail")) {
            detailMA(req, resp);
        } else if (uri.contains("view-update")) {
            viewUpdateMA(req, resp);
        } else if (uri.contains("delete")) {
            deleteMA(req, resp);
        } else if (uri.contains("search")) {
            searchMA(req, resp);
        } else if (uri.contains("page")) {
            pageMA(req, resp);
        }
    }

    private void pageMA(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int page = 0;
        int pageSize = 3;
        String pageParam = req.getParameter("page");
        if (pageParam != null & !pageParam.isEmpty()) {
            page = Integer.valueOf(pageParam);
        }
        req.setAttribute("page", page);

        req.setAttribute("listMA", mar.pageBy3(page, pageSize));
        req.setAttribute("listNH", nhr.getAll());
        req.getRequestDispatcher("/de4/index.jsp").forward(req, resp);
    }

    private void searchMA(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer min = Integer.valueOf(req.getParameter("min"));
        Integer max = Integer.valueOf(req.getParameter("max"));
        req.setAttribute("listMA", mar.searchByKhoangGia(min, max));
        req.setAttribute("listNH", nhr.getAll());
        req.getRequestDispatcher("/de4/index.jsp").forward(req, resp);
    }

    private void deleteMA(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        mar.delete(id);
        resp.sendRedirect("/mon-an/index");
    }

    private void viewUpdateMA(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("ma", mar.getOne(id));
        req.setAttribute("listNH", nhr.getAll());
        req.getRequestDispatcher("/de4/view-update.jsp").forward(req, resp);
    }

    private void detailMA(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("ma", mar.getOne(id));
        req.setAttribute("listNH", nhr.getAll());
        req.getRequestDispatcher("/de4/detail.jsp").forward(req, resp);
    }

    private void indexMA(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listMA", mar.getAll());
        req.setAttribute("listNH", nhr.getAll());
        req.getRequestDispatcher("/de4/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("add")) {
            addMA(req, resp);
        } else if (uri.contains("update")) {
            updateMA(req, resp);
        }
    }

    private void updateMA(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String tenMonAn = req.getParameter("tenMonAn");
        String loaiMon = req.getParameter("loaiMon");
        Integer gia = Integer.valueOf(req.getParameter("gia"));
        Boolean conPhucVu = Boolean.valueOf(req.getParameter("conPhucVu"));

        Integer nhaHangId = Integer.valueOf(req.getParameter("nh"));
        NhaHang nh = nhr.getOne(nhaHangId);

        MonAn ma = new MonAn(id, tenMonAn, loaiMon, gia, conPhucVu, nh);
        mar.update(ma);

        resp.sendRedirect("/mon-an/index");
    }

    private void addMA(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String tenMonAn = req.getParameter("tenMonAn");
        String loaiMon = req.getParameter("loaiMon");
        Integer gia = Integer.valueOf(req.getParameter("gia"));
        Boolean conPhucVu = Boolean.valueOf(req.getParameter("conPhucVu"));

        Integer nhaHangId = Integer.valueOf(req.getParameter("nh"));
        NhaHang nh = nhr.getOne(nhaHangId);

        MonAn ma = new MonAn(null, tenMonAn, loaiMon, gia, conPhucVu, nh);
        mar.add(ma);

        resp.sendRedirect("/mon-an/index");
    }
}
