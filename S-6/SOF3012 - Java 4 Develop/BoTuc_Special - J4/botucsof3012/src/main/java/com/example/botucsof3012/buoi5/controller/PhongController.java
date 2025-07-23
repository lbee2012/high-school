package com.example.botucsof3012.buoi5.controller;

import com.example.botucsof3012.buoi5.model.KhachSan;
import com.example.botucsof3012.buoi5.model.Phong;
import com.example.botucsof3012.buoi5.repository.KhachSanRepository;
import com.example.botucsof3012.buoi5.repository.PhongRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "phong", value = {
        "/buoi5/index", //GET
        "/buoi5/add", //POST
        "/buoi5/view-update", //GET
        "/buoi5/update", //POST
        "/buoi5/delete", //GET
})
public class PhongController extends HttpServlet {
    PhongRepository pRepo = new PhongRepository();
    KhachSanRepository ksRepo = new KhachSanRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("index")) {
            indexP(req, resp);
        } else if (uri.contains("view-update")) {
            viewUpdateP(req, resp);
        } else if (uri.contains("delete")) {
            deleteP(req, resp);
        }
    }

    private void deleteP(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void viewUpdateP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("phong", pRepo.getOnePhong(id));
        req.setAttribute("listKhachSan", ksRepo.getAllKhachSan());
        req.getRequestDispatcher("/buoi5/index.jsp").forward(req, resp);
    }

    private void indexP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listKhachSan", ksRepo.getAllKhachSan());
        req.setAttribute("listPhong", pRepo.getAllPhong());
        req.getRequestDispatcher("/buoi5/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("add")) {
            System.out.println("addP(req, resp);");
            addP(req, resp);
        } else if (uri.contains("update")) {
            updateP(req, resp);
        }
    }

    private void updateP(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void addP(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String tenPhong = req.getParameter("tenPhong");
        Integer gia = Integer.valueOf(req.getParameter("gia"));
        Boolean conTrong = Boolean.valueOf(req.getParameter("conTrong"));

        //Tim thuc the KhachSan qua ID va gan vao bien ks
        Integer khachSanId = Integer.valueOf(req.getParameter("khachSan"));
        KhachSan ks = ksRepo.getOneKhachSan(khachSanId);

        //Tao thuc the Phong voi cac thong tin KhachSan duoc tim thay qua 'ks'
        Phong p = new Phong(null, tenPhong, gia, conTrong, ks);
        pRepo.addPhong(p);
        resp.sendRedirect("/buoi5/index");
    }
}
