package com.example.tutorsof3012.buoi1.controller;

import com.example.tutorsof3012.buoi1.model.SanPham;
import com.example.tutorsof3012.buoi1.repository.SanPhamRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "sanPhamController", value = {
        "/buoi1/index", //GET
        "/buoi1/detail", //GET
        "/buoi1/add", //POST
        "/buoi1/view-update", //GET
        "/buoi1/update", //POST
        "/buoi1/delete", //GET
})
public class SanPhamController extends HttpServlet {
    SanPhamRepository spRepo = new SanPhamRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("index")) {
            indexSP(req, resp);
        } else if (uri.contains("detailSP")) {
            detailSP(req, resp);
        } else if (uri.contains("view-update")) {
            viewUpdateSP(req, resp);
        } else if (uri.contains("delete")) {
            deleteSP(req, resp);
        }
    }

    private void deleteSP(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        spRepo.delete(id);
        resp.sendRedirect("buoi1/index");
    }

    private void viewUpdateSP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("sp", spRepo.getOne(id));
        req.getRequestDispatcher("/buoi1/viewUpdate.jsp").forward(req, resp);
    }

    private void detailSP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("sp", spRepo.getOne(id));
        req.getRequestDispatcher("/buoi1/detail.jsp").forward(req, resp);
    }

    private void indexSP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listAll", spRepo.getAll());
        req.getRequestDispatcher("/buoi1/index.jsp").forward(req, resp);
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

    private void updateSP(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void addSP(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String tenSanPham = req.getParameter("tenSanPham");
        String nhaSanXuat = req.getParameter("nhaSanXuat");
        Float gia = Float.valueOf(req.getParameter("gia"));
        Integer soLuong = Integer.valueOf(req.getParameter("soLuong"));
        Boolean conHang = Boolean.valueOf(req.getParameter("conHang"));

        SanPham sp = new SanPham(null, tenSanPham, nhaSanXuat, gia, soLuong, conHang);
        spRepo.add(sp);
        resp.sendRedirect("/buoi1/index");
    }
}
