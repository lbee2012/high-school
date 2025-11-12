package com.example.botucsof3012.buoi1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "helloWorldController", value = {
        "/buoi1/hello", // GET
        "/buoi1/hien-thi", // GET
        "/buoi1/dang-nhap", // POST
})
public class HelloWorldController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if(uri.contains("hello")) {
            helloWord(req, resp);
        } else if (uri.contains("hien-thi")) {
            hienThi(req, resp);
        }
    }

    private void hienThi(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/buoi1/hienThi.jsp").forward(req, resp);
    }

    private void helloWord(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("ten", "Skibidi");
        req.getRequestDispatcher("/buoi1/helloWorld.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("dang-nhap")) {
            dangNhap(req, resp);
        }
    }

    private void dangNhap(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("username"); //param trung voi name tu input o form dang nhap
        String pass = req.getParameter("password");
        req.setAttribute("username", user);
        req.setAttribute("password", pass);
        req.getRequestDispatcher("/buoi1/thongTin.jsp").forward(req, resp);
    }
}
