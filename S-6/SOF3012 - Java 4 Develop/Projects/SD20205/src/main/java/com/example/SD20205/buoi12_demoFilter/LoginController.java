package com.example.SD20205.buoi12_demoFilter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "loginController", value = {
        "/filter/login", //BOTH
        "/filter/logout",
})

public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("login")) {
            req.getRequestDispatcher("/filter/login.jsp").forward(req, resp);
        } else {
            HttpSession session = req.getSession();
            session.invalidate();
            req.getRequestDispatcher("/filter/login.jsp").forward(req, resp);
            resp.sendRedirect("/filter/login");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        HttpSession session = req.getSession();
        if (username.equals("admin") && password.equals("123") || username.equals("staff") && password.equals("234")) {
            session.setAttribute("username", username);
            if (username.equals("admin")) {
                session.setAttribute("role", "adminPermission");
                resp.sendRedirect("/admin/index");
            } else if (username.equals("staff")) {
                session.setAttribute("role", "staffPermission");
                resp.sendRedirect("/staff/index");
            }
        } else {
            req.setAttribute("message", "Wrong credential");
            req.getRequestDispatcher("filter/login.jsp").forward(req, resp);
        }
    }
}
