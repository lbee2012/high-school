package com.example.botucsof3012.buoi5.controller;

import com.example.botucsof3012.buoi5.repository.PhongRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "phong", value = {
        "/buoi5/index", //GET
        "/buoi5/detail", //GET
        "/buoi5/add", //POST
        "/buoi5/view-update", //GET
        "/buoi5/update", //POST
        "/buoi5/delete", //GET
})
public class PhongController extends HttpServlet {
    PhongRepository pRepo = new PhongRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("index")) {
            indexP(req, resp);
        } else if (uri.contains("detail")) {
            detailP(req, resp);
        } else if (uri.contains("view-update")) {
            viewUpdateP(req, resp);
        } else if (uri.contains("delete")) {
            deleteP(req, resp);
        }
    }

    private void deleteP(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void viewUpdateP(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void detailP(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void indexP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listAll", pRepo.getAllPhong());
        req.getRequestDispatcher("/buoi5/index.jsp").forward(req, resp);
    }
}
