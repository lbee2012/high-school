package com.example.LuyenTapLan2.de4.ajax;

import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ajaxController", value = {
        "/api/ajax/index"
})

public class ajaxController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        NhaHang nh = new NhaHang(2012, "Nha hang A du Ang Long");

        Gson gson = new Gson();
        String data = gson.toJson(nh);

        resp.setContentType("application/json");

        PrintWriter pw = resp.getWriter();
        pw.print(data);
        pw.flush();
    }
}
