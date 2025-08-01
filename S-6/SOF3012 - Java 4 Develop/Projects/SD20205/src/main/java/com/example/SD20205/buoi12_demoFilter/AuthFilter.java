package com.example.SD20205.buoi12_demoFilter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "authFilter", value = {
        "/admin/*",
        "/staff/*",
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

        HttpSession session = req.getSession();

        String username = (String) session.getAttribute("username");
        String role = (String) session.getAttribute("role");

        if (username != null) {
           if (role.equals("adminPermission")) {
               filterChain.doFilter(req, resp);
           } else if (role.equals("staffPermission")) {
               String uri = req.getRequestURI();
               if (uri.contains("staff")) {
                   filterChain.doFilter(req, resp);
               } else {
                   req.getRequestDispatcher("/filter/403.jsp").forward(req, resp);
               }
           }
        } else {
            resp.sendRedirect("/filter/login");
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
