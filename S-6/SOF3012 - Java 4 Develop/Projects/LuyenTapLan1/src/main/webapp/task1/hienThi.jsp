<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 7/24/2025
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Database</title>
</head>
<body>
    <h3>Form add SP</h3>
    <form action="/task1/them" method="post">
        Ten san pham: <input type="text" name="tenSanPham"><br>
        Mo ta: <input type="text" name="moTa"><br>
        Gia ban: <input type="text" name="giaBan"><br>
        So luong ton: <input type="text" name="soLuongTon"><br>
        Trang thai:
        Con hang: <input type="radio" name="conHang" value="true">
        Het hang: <input type="radio" name="conHang" value="false"><br>
        <select name="phanLoai">
            <c:forEach items="${listPL}" var="pl">
                <option value="${pl.id}" label="${pl.tenPhanLoai}"></option>
            </c:forEach>
        </select>
        <br>
        <button>Submit</button>
    </form>
    <br>
    <h1>DATABASE FETCH</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Ten san pham</th>
                <th>Mo ta</th>
                <th>Gia ban</th>
                <th>So luong ton</th>
                <th>Trang thai</th>
                <th>Phan loai</th>
                <th>Hanh dong</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listSP}" var="sp">
                <tr>
                    <td>${sp.id}</td>
                    <td>${sp.tenSanPham}</td>
                    <td>${sp.moTa}</td>
                    <td>${sp.giaBan}</td>
                    <td>${sp.soLuongTon}</td>
                    <td>${sp.conHang == "true" ? "Con hang" : "Het hang"}</td>
                    <td>${sp.phanLoai.tenPhanLoai}</td>
                    <td>
                        <a href="/task1/view-sua?id=${sp.id}">Update</a>
                        <a href="/task1/xoa?id=${sp.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
