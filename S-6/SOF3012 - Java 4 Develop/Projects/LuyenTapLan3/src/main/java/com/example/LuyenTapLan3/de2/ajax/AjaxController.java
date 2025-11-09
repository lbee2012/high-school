package com.example.LuyenTapLan3.de2.ajax;

import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ajaxController2", value = {
        "/api/giao-dich/get-all"
})

public class AjaxController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<GiaoDich> gdList = new ArrayList<>();
        gdList.add(new GiaoDich("1/1/1", "1 ti dong", 1));
        gdList.add(new GiaoDich("1/1/2", "2 ti dong", 2));
        gdList.add(new GiaoDich("1/1/3", "3 ti dong", 3));
        gdList.add(new GiaoDich("1/1/4", "4 ti dong", 4));
        gdList.add(new GiaoDich("1/1/5", "5 ti dong", 5));

        Gson gson = new Gson();
        String data = gson.toJson(gdList);

        resp.setContentType("application/json");

        PrintWriter pw = resp.getWriter();
        pw.print(data);
        pw.flush();
    }
}
