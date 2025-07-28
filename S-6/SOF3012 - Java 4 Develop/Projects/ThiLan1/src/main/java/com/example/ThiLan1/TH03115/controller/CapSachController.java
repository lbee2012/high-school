package com.example.ThiLan1.TH03115.controller;

import com.example.ThiLan1.TH03115.model.CapSach;
import com.example.ThiLan1.TH03115.repository.CapSachRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "capSachController", value = {
        "/th03115/index", //GET
        "/th03115/add", //POST
        "/th03115/view-update", //GET
        "/th03115/update", //POST
        "/th03115/delete", //GET
        "/th03115/search", //GET
})
public class CapSachController extends HttpServlet {
    CapSachRepository csRepo = new CapSachRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("index")) {
            indexCS(req, resp);
        } else if (uri.contains("view-update")) {
            viewUpdateCS(req, resp);
        } else if (uri.contains("delete")) {
            deleteCS(req, resp);
        } else if (uri.contains("search")) {
            searchByTenCS(req, resp);
        }
    }

    private void searchByTenCS(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String ten = req.getParameter("ten");
//        req.setAttribute("cs", csRepo.search(ten));
//        req.getRequestDispatcher("/th03115/index.jsp").forward(req, resp);
    }

    private void deleteCS(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void viewUpdateCS(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("cs", csRepo.getOne(id));
        req.getRequestDispatcher("/th03115/viewUpdate.jsp").forward(req, resp);
    }

    private void indexCS(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listCS", csRepo.getAll());
        req.getRequestDispatcher("/th03115/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("add")) {
            addCS(req, resp);
        } else if (uri.contains("update")) {
            updateCS(req, resp);
        }
    }

    private void updateCS(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String tenCapSach = req.getParameter("tenCapSach");
        String moTa = req.getParameter("moTa");
        Integer soNgan = Integer.valueOf(req.getParameter("soNgan"));
        Float trongLuong = Float.valueOf(req.getParameter("trongLuong"));
        Boolean laptop = Boolean.valueOf(req.getParameter("laptop"));

        CapSach cs = new CapSach(id, tenCapSach, moTa, soNgan, trongLuong, laptop);
        csRepo.update(cs);

        resp.sendRedirect("/th03115/index");
    }

    private void addCS(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String tenCapSach = req.getParameter("tenCapSach");
        String moTa = req.getParameter("moTa");
        Integer soNgan = Integer.valueOf(req.getParameter("soNgan"));
        Float trongLuong = Float.valueOf(req.getParameter("trongLuong"));
        Boolean laptop = Boolean.valueOf(req.getParameter("laptop"));

        CapSach cs = new CapSach(null, tenCapSach, moTa, soNgan, trongLuong, laptop);
        csRepo.add(cs);

        resp.sendRedirect("/th03115/index");
    }
}
