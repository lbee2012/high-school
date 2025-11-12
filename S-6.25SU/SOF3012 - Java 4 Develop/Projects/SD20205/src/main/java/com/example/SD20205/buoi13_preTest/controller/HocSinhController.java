package com.example.SD20205.buoi13_preTest.controller;

import com.example.SD20205.buoi13_preTest.model.HocSinh;
import com.example.SD20205.buoi13_preTest.model.TruongHoc;
import com.example.SD20205.buoi13_preTest.repository.HocSinhRepository;
import com.example.SD20205.buoi13_preTest.repository.TruongHocRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "hocSinhController", value = {
        "/buoi13/index", // GET
        "/buoi13/add", // POST
        "/buoi13/view-update", // GET
        "/buoi13/update", // POST
        "/buoi13/delete", // GET
        "/buoi13/search", // GET
        "/buoi13/sort", // GET
        "/buoi13/page", // GET
})

public class HocSinhController extends HttpServlet {
    HocSinhRepository hsr = new HocSinhRepository();
    TruongHocRepository thr = new TruongHocRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("index")) {
            indexHS(req, resp);
        } else if (uri.contains("view-update")) {
            viewHS(req, resp);
        } else if (uri.contains("delete")) {
            deleteHS(req, resp);
        } else if (uri.contains("search")) {
            searchHS(req, resp);
        } else if (uri.contains("sort")) {
            sortHS(req, resp);
        } else if (uri.contains("page")) {
            pageHS(req, resp);
        }
    }

    private void pageHS(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int page = 0;
        int pageSize = 3;
        if (req.getParameter("page") != null & !req.getParameter("page").isEmpty()) {
            page = Integer.valueOf(req.getParameter("page"));
        }
        req.setAttribute("listHS", hsr.paging(page, pageSize));
        req.setAttribute("page", page);
        req.setAttribute("listTH", thr.getAll());
        req.getRequestDispatcher("/buoi13/index.jsp").forward(req, resp);
    }

    private void sortHS(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listHS", hsr.sortByTuoi());
        req.setAttribute("listTH", thr.getAll());
        req.getRequestDispatcher("/buoi13/index.jsp").forward(req, resp);
    }

    private void searchHS(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tenHocSinh = req.getParameter("tenHocSinh");
        req.setAttribute("listHS", hsr.searchByTen(tenHocSinh));
        req.setAttribute("listTH", thr.getAll());
        req.getRequestDispatcher("/buoi13/index.jsp").forward(req, resp);
    }

    private void deleteHS(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        hsr.delete(id);
        resp.sendRedirect("/buoi13/index");
    }

    private void viewHS(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("hs", hsr.getOne(id));
        req.setAttribute("listTH", thr.getAll());
        req.getRequestDispatcher("/buoi13/view-update.jsp").forward(req, resp);
    }

    private void indexHS(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listHS", hsr.getAll());
        req.setAttribute("listTH", thr.getAll());
        req.getRequestDispatcher("/buoi13/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("add")) {
            addHS(req, resp);
        } else if (uri.contains("update")) {
            updateHS(req, resp);
        }
    }

    private void updateHS(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String tenHocSinh = req.getParameter("tenHocSinh");
        Integer tuoi = Integer.valueOf(req.getParameter("tuoi"));
        Boolean dangHoc = Boolean.valueOf(req.getParameter("dangHoc"));

        Integer idTruong = Integer.valueOf(req.getParameter("truongHoc"));
        TruongHoc th = thr.getOne(idTruong);

        HocSinh hs = new HocSinh(id, tenHocSinh, tuoi, dangHoc, th);
        hsr.update(hs);

        resp.sendRedirect("/buoi13/index");
    }

    private void addHS(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String tenHocSinh = req.getParameter("tenHocSinh");
        Integer tuoi = Integer.valueOf(req.getParameter("tuoi"));
        Boolean dangHoc = Boolean.valueOf(req.getParameter("dangHoc"));

        Integer idTruong = Integer.valueOf(req.getParameter("truongHoc"));
        TruongHoc th = thr.getOne(idTruong);

        HocSinh hs = new HocSinh(null, tenHocSinh, tuoi, dangHoc, th);
        hsr.add(hs);

        resp.sendRedirect("/buoi13/index");
    }
}
