package com.example.LuyenTapLan2.de4.filter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "loginController", value = {
        "/mon-an/login",
        "/mon-an/logout",
})

public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("login")) {
            req.getRequestDispatcher("/de4/login.jsp").forward(req, resp);
        } else {
            HttpSession s = req.getSession();
            s.invalidate();

            req.getRequestDispatcher("/de4/login.jsp").forward(req, resp);
            resp.sendRedirect("/mon-an/login");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        HttpSession s = req.getSession();

        if (username.equals("manager") & password.equals("123") || username.equals("employee") & password.equals("234")) {
            s.setAttribute("username", username);
            if (username.equals("manager")) {
                s.setAttribute("role", "managerPermission");
                resp.sendRedirect("/manager/index");
            } else if (username.equals("employee")) {
                s.setAttribute("role", "employeePermission");
                resp.sendRedirect("/employee/index");
            }
        } else {
            req.setAttribute("message", "Wrong credentials");
            req.getRequestDispatcher("/de4/login.jsp").forward(req, resp);
        }
    }
}
