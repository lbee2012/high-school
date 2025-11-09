package com.example.SD20205.buoi10.controller;

import com.example.SD20205.buoi10.model.BaiHat;
import com.example.SD20205.buoi10.model.CaSi;
import com.example.SD20205.buoi10.repository.BaiHatRepository;
import com.example.SD20205.buoi10.repository.CaSiRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.eclipse.tags.shaded.org.apache.xpath.operations.Bool;

import java.io.IOException;

@WebServlet(name = "baiHatController", value = {
        "/buoi10/index", //GET
        "/buoi10/add", //POST
        "/buoi10/view-update", //GET
        "/buoi10/update", //POST
        "/buoi10/delete", //GET
        "/buoi10/search", //GET
        "/buoi10/page", //GET
})

public class BaiHatController extends HttpServlet {
    CaSiRepository csRepo = new CaSiRepository();
    BaiHatRepository bhRepo = new BaiHatRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("index")) {
            indexBH(req, resp);
        } else if (uri.contains("view-update")) {
            viewUpdateBH(req, resp);
        } else if (uri.contains("delete")) {
            deleteBH(req, resp);
        } else if (uri.contains("search")) {
            searchBH(req, resp);
        } else if (uri.contains("sort")) {
            sortBH(req, resp);
        } else if (uri.contains("page")) {
            pageBH(req, resp);
        }
    }

    private void pageBH(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int page = 0;
        int pageSize = 3;
        if (req.getParameter("page") != null & !req.getParameter("page").isEmpty()) {
            page= Integer.valueOf(req.getParameter("page"));
        }
        req.setAttribute("listBH", bhRepo.page(page, pageSize));
        req.setAttribute("page", page);
        req.getRequestDispatcher("/buoi10/index.jsp").forward(req, resp);
    }

    private void sortBH(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listBH", bhRepo.sortByThoiLuong());
        req.getRequestDispatcher("/buoi10/index.jsp").forward(req, resp);
    }

    private void searchBH(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tenBaiHat = req.getParameter("tenBaiHat");
        req.setAttribute("listBH", bhRepo.searchByTen(tenBaiHat));
        req.getRequestDispatcher("/buoi10/index.jsp").forward(req, resp);
    }

    private void deleteBH(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        bhRepo.delete(id);
        resp.sendRedirect("/buoi10/index");
    }

    private void viewUpdateBH(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("bh", bhRepo.getOne(id));
        req.setAttribute("listCS", csRepo.getAll());
        req.getRequestDispatcher("/buoi10/viewUpdate.jsp").forward(req, resp);
    }

    private void indexBH(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listBH", bhRepo.getAll());
        req.setAttribute("listCS", csRepo.getAll());
        req.getRequestDispatcher("/buoi10/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("add")) {
            addBH(req, resp);
        } else if (uri.contains("update")) {
            updateBH(req, resp);
        }
    }

    private void updateBH(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String tenBaiHat = req.getParameter("tenBaiHat");
        Integer thoiLuong = Integer.valueOf(req.getParameter("thoiLuong"));
        Boolean phatHanhChua = Boolean.valueOf(req.getParameter("phatHanhChua"));

        Integer idCaSi = Integer.valueOf(req.getParameter("caSi"));
        CaSi cs = csRepo.getOne(idCaSi);

        BaiHat bh = new BaiHat(id, tenBaiHat, thoiLuong, phatHanhChua, cs);
        bhRepo.update(bh);

        resp.sendRedirect("/buoi10/index");
    }

    private void addBH(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String tenBaiHat = req.getParameter("tenBaiHat");
        Integer thoiLuong = Integer.valueOf(req.getParameter("thoiLuong"));
        Boolean phatHanhChua = Boolean.valueOf(req.getParameter("phatHanhChua"));

        Integer idCaSi = Integer.valueOf(req.getParameter("caSi"));
        CaSi cs = csRepo.getOne(idCaSi);

        BaiHat bh = new BaiHat(null, tenBaiHat, thoiLuong, phatHanhChua, cs);
        bhRepo.add(bh);

        resp.sendRedirect("/buoi10/index");
    }
}
