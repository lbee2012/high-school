package com.example.SD20205.buoi11_demoScope.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "controllerA", value = {
        "/scope-a",
})
public class ControllerA extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Request Scope
        req.setAttribute("name", "SD20205");
        req.getRequestDispatcher("/scope-b").forward(req, resp);

        //Session Scope
        HttpSession session = req.getSession();
        session.setAttribute("role", "admin");

        //Application scope
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("scope", "applicatoin");

        req.getRequestDispatcher("/scope-b").forward(req, resp);
    }
}
