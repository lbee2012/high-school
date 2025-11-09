package com.example.botucsof3012.buoi4.controller;

import com.example.botucsof3012.buoi4.model.MayTinh;
import com.example.botucsof3012.buoi4.repository.MayTinhRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "mayTinhController", value = {
        "/buoi4/index", //GET
        "/buoi4/detail", //GET
        "/buoi4/add", //POST
        "/buoi4/view-update", //GET
        "/buoi4/update", //POST
        "/buoi4/delete", //GET
})
public class MayTinhController extends HttpServlet {
    MayTinhRepository mtRepo = new MayTinhRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("index")) {
            indexMT(req, resp);
        } else if (uri.contains("detail")) {
            detailMT(req, resp);
        } else if (uri.contains("view-update")) {
            viewUpdateMT(req, resp);
        } else if (uri.contains("delete")) {
            deleteMT(req, resp);
        }
    }

    private void deleteMT(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        mtRepo.delete(id);
        resp.sendRedirect("/buoi4/index");
    }

    private void viewUpdateMT(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("mt", mtRepo.getOne(id));
        req.getRequestDispatcher("/buoi4/viewUpdate.jsp").forward(req, resp);
    }

    private void detailMT(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("mt", mtRepo.getOne(id));
        req.getRequestDispatcher("/buoi4/detail.jsp").forward(req, resp);
    }

    private void indexMT(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listAll", mtRepo.getAll());
        req.getRequestDispatcher("/buoi4/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("add")) {
            addMT(req, resp);
        } else if (uri.contains("update")) {
            updateMT(req, resp);
        }
    }

    private void updateMT(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String hang = req.getParameter("hang");
        Integer tonKho = Integer.valueOf(req.getParameter("tonKho"));
        Float boNho = Float.valueOf(req.getParameter("boNho"));

        MayTinh mt = new MayTinh(id, hang, tonKho, boNho);
        mtRepo.update(mt);
        resp.sendRedirect("/buoi4/index");
    }

    private void addMT(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String hang = req.getParameter("hang");
        Integer tonKho = Integer.valueOf(req.getParameter("tonKho"));
        Float boNho = Float.valueOf(req.getParameter("boNho"));

        MayTinh mt = new MayTinh(null, hang, tonKho, boNho);
        mtRepo.add(mt);
        resp.sendRedirect("/buoi4/index");
    }
}
