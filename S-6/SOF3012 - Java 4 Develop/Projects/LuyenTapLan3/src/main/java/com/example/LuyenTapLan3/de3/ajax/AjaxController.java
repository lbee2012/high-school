package com.example.LuyenTapLan3.de3.ajax;

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

@WebServlet(name = "ajaxController3", value = {
        "/api/nha-san-xuat/get-all"
})
public class AjaxController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<NhaSanXuat> nsxList = new ArrayList<>();
        nsxList.add(new NhaSanXuat("m1", "t1", "dc1"));
        nsxList.add(new NhaSanXuat("m2", "t2", "dc2"));
        nsxList.add(new NhaSanXuat("m3", "t3", "dc3"));
        nsxList.add(new NhaSanXuat("m4", "t4", "dc4"));
        nsxList.add(new NhaSanXuat("m5", "t5", "dc5"));

        Gson gson = new Gson();
        String data = gson.toJson(nsxList);

        resp.setContentType("application/json");

        PrintWriter pw = resp.getWriter();
        pw.print(data);
        pw.flush();
    }
}
