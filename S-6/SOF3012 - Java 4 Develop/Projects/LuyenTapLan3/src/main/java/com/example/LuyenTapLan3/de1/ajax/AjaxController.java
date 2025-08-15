package com.example.LuyenTapLan3.de1.ajax;

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

@WebServlet(name = "ajaxController1", value = {
    "/api/mon-hoc/get-all"
})
public class AjaxController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<MonHoc> mhList = new ArrayList<MonHoc>();
        mhList.add(new MonHoc("MH01", "Toan1", 1));
        mhList.add(new MonHoc("MH02", "Toan2", 2));
        mhList.add(new MonHoc("MH03", "Toan3", 3));
        mhList.add(new MonHoc("MH04", "Toan4", 4));
        mhList.add(new MonHoc("MH05", "Toan5", 5));

        Gson gson = new Gson();
        String data = gson.toJson(mhList);

        resp.setContentType("application/json");

        PrintWriter pw = resp.getWriter();
        pw.print(data);
        pw.flush();
    }
}
