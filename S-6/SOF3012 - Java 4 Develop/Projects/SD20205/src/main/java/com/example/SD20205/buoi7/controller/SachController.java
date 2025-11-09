package com.example.SD20205.buoi7.controller;

import com.example.SD20205.buoi7.model.Sach;
import com.example.SD20205.buoi7.model.TheLoai;
import com.example.SD20205.buoi7.repository.SachRepository;
import com.example.SD20205.buoi7.repository.TheLoaiRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "sachController", value = {
        "/buoi7/index", //GET
        "/buoi7/add", //POST
        "/buoi7/view-update", //GET
        "/buoi7/update", //POST
        "/buoi7/delete", //GET
//        "/buoi7/search", //GET
//        "/buoi7/sort", //GET
})
public class SachController extends HttpServlet {
    SachRepository sRepo = new SachRepository();
    TheLoaiRepository tlRepo = new TheLoaiRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("index")) {
            indexS(req, resp);
        } else if (uri.contains("view-update")) {
            viewUpdateS(req, resp);
        } else if (uri.contains("delete")) {
            delete(req, resp);
        }
    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        sRepo.delete(id);
        resp.sendRedirect("/buoi7/index");
    }

    private void viewUpdateS(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("listTheLoai", tlRepo.getAll());
        req.setAttribute("sach", sRepo.getOne(id));
        req.getRequestDispatcher("/buoi7/viewUpdate.jsp").forward(req, resp);
    }

    private void indexS(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listTheLoai", tlRepo.getAll());
        req.setAttribute("listSach", sRepo.getAll());
        req.getRequestDispatcher("/buoi7/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("add")) {
            addS(req, resp);
        } else if (uri.contains("update")) {
            updateS(req, resp);
        }
    }

    private void updateS(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String tenSach = req.getParameter("tenSach");
        String tacGia = req.getParameter("tacGia");
        Float gia = Float.valueOf(req.getParameter("gia"));
        Integer soLuong = Integer.valueOf(req.getParameter("soLuong"));
        Boolean conHang = Boolean.valueOf(req.getParameter("conHang"));

        Integer idTheLoai = Integer.valueOf(req.getParameter("theLoai"));
        TheLoai tl = tlRepo.getOne(idTheLoai);

        Sach s = new Sach(id, tenSach, tacGia, gia, soLuong, conHang, tl);
        sRepo.update(s);
        resp.sendRedirect("/buoi7/index");
    }

    private void addS(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String tenSach = req.getParameter("tenSach");
        String tacGia = req.getParameter("tacGia");
        Float gia = Float.valueOf(req.getParameter("gia"));
        Integer soLuong = Integer.valueOf(req.getParameter("soLuong"));
        Boolean conHang = Boolean.valueOf(req.getParameter("conHang"));

        Integer idTheLoai = Integer.valueOf(req.getParameter("theLoai"));
        TheLoai tl = tlRepo.getOne(idTheLoai);

        Sach s = new Sach(null, tenSach, tacGia, gia, soLuong, conHang, tl);
        sRepo.add(s);
        resp.sendRedirect("/buoi7/index");
    }
}
