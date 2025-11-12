package com.example.SD20205.demoAjax;

import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ajaxController", value = {
        "/api/ajax/demo"
})

public class AjaxController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SinhVien sv = new SinhVien(2012, "Hoang Quy Long", "SOF3012");

        Gson gson = new Gson();
        String data = gson.toJson(sv);

        resp.setContentType("application/json");

        PrintWriter pw = resp.getWriter();
        pw.print(data);
        pw.flush();
    }
}
