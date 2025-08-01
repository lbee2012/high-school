package com.example.SD20205.buoi11_demoScope.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "controllerB", value = {
        "/scope-b",
})
public class ControllerB extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Request Scope
        String name = (String) req.getAttribute("name");
        System.out.println(name);

        //Session Scope
        HttpSession session = req.getSession();
        String role = (String) session.getAttribute("role");
        System.out.println(role);

        req.getRequestDispatcher("/scope/index.jsp").forward(req, resp);
    }
}
