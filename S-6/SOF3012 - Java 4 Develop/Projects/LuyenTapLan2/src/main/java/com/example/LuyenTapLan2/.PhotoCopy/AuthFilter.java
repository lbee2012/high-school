package com.example.LuyenTapLan2.de4.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet(name = "authFilter", value = {
        "/manager/*",
        "/employee/*",
})

public class AuthFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        HttpSession s = req.getSession();

        String username = (String) s.getAttribute("username");
        String role = (String) s.getAttribute("role");

        if (username != null) {
            if (role.equals("managerPermission")) {
                filterChain.doFilter(req, resp);
            } else if (role.equals("employeePermission")) {
                String uri = req.getRequestURI();
                if (uri.contains("employee")) {
                    filterChain.doFilter(req, resp);
                } else {
                    req.getRequestDispatcher("/de4/403.jsp").forward(req, resp);
                }
            }
        } else {
            resp.sendRedirect("/mon-an/login");
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
