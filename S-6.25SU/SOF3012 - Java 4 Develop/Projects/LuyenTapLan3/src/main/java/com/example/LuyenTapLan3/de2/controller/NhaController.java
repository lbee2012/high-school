package com.example.LuyenTapLan3.de2.controller;

import com.example.LuyenTapLan3.de2.model.ChuNha;
import com.example.LuyenTapLan3.de2.model.Nha;
import com.example.LuyenTapLan3.de2.repository.ChuNhaRepo;
import com.example.LuyenTapLan3.de2.repository.NhaRepo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "nhaController", value = {
        "/de2/index",
        "/de2/add",
        "/de2/view-update",
        "/de2/update",
        "/de2/search",
        "/de2/sort",
        "/de2/page",
})

public class NhaController extends HttpServlet {
    ChuNhaRepo cnr = new ChuNhaRepo();
    NhaRepo nr = new NhaRepo();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("index")) {
            indexN(req, resp);
        } else if (uri.contains("view-update")) {
            viewUpdateN(req, resp);
        } else if (uri.contains("search")) {
            searchN(req, resp);
        } else if (uri.contains("sort")) {
            sortN(req, resp);
        } else if (uri.contains("page")) {
            pageN(req, resp);
        }
    }

    private void pageN(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int page = 0;
        int pageSize = 5;
        String pageParam = req.getParameter("page");
        if (pageParam != null && !pageParam.isEmpty()) {
            page = Integer.valueOf(pageParam);
        }
        if (page <= 0) {
            page = 0;
        }
        req.setAttribute("page", page);
        req.setAttribute("listN", nr.pageBy5(page, pageSize));
        req.setAttribute("listCN", cnr.getAll());
        req.getRequestDispatcher("/de2/index.jsp").forward(req, resp);
    }

    private void sortN(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listN", nr.sortByGiaTien());
        req.setAttribute("listCN", cnr.getAll());
        req.getRequestDispatcher("/de2/index.jsp").forward(req, resp);
    }

    private void searchN(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String diaChi = req.getParameter("diaChi");
        req.setAttribute("listN", nr.searchByDiaChi(diaChi));
        req.setAttribute("listCN", cnr.getAll());
        req.getRequestDispatcher("/de2/index.jsp").forward(req, resp);
    }

    private void viewUpdateN(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("n", nr.getOne(id));
        req.setAttribute("listCN", cnr.getAll());
        req.getRequestDispatcher("/de2/view-update.jsp").forward(req, resp);
    }

    private void indexN(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listN", nr.getAll());
        req.setAttribute("listCN", cnr.getAll());
        req.getRequestDispatcher("/de2/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("add")) {
            addN(req, resp);
        } else if (uri.contains("update")) {
            updateN(req, resp);
        }
    }

    private void updateN(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String diaChi = req.getParameter("diaChi");
        String loaiNha = req.getParameter("loaiNha");
        Float giaTien = Float.valueOf(req.getParameter("giaTien"));

        Integer chuNhaID = Integer.valueOf(req.getParameter("cn"));
        ChuNha cn = cnr.getOne(chuNhaID);

        Nha n = new Nha(id, diaChi, loaiNha, giaTien, cn);
        nr.update(n);

        resp.sendRedirect("/de2/index");
    }

    private void addN(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String diaChi = req.getParameter("diaChi");
        String loaiNha = req.getParameter("loaiNha");
        if (loaiNha.equals("nhaDat")) {
            loaiNha = "nhaDat";
        } else if (loaiNha.equals("chungCu")) {
            loaiNha = "chungCu";
        } else {
            System.out.println("nha nay beo!");;
        }
        Float giaTien = Float.valueOf(req.getParameter("giaTien"));

        Integer chuNhaID = Integer.valueOf(req.getParameter("cn"));
        ChuNha cn = cnr.getOne(chuNhaID);

        Nha n = new Nha(null, diaChi, loaiNha, giaTien, cn);
        nr.add(n);

        resp.sendRedirect("/de2/index");
    }
}
