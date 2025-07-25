<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 22-Jul-25
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Table: san_pham</title>
    <style>
        th, td {
            border: 1px solid;
            padding: 4px;
        }
    </style>
</head>
<body>
    <h3>From add SP:</h3>
    <form action="/b1/add" method="post">
        Ten san pham: <input type="text" name="tenSanPham"><br>
        Nha san xuat: <input type="text" name="nhaSanXuat"><br>
        Gia: <input type="text" name="gia"><br>
        So luong: <input type="text" name="soLuong"><br>
        Trang thai:
        Con hang <input type="radio" name="conHang" value="true">
        Het hang <input type="radio" name="conHang" value="false"><br>
        <br>
        <button>Submit</button>
    </form>
    <br>
    <h1>Thong tin San pham:</h1>
    <table>
        <thead>
            <tr>
                <td>ID</td>
                <td>Ten san pham</td>
                <td>Nha san xuat</td>
                <td>Gia</td>
                <td>So luong</td>
                <td>Trang thai</td>
                <td>Hanh dong</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listAll}" var="sp">
                <tr>
                    <td>${sp.id}</td>
                    <td>${sp.tenSanPham}</td>
                    <td>${sp.nhaSanXuat}</td>
                    <td>${sp.gia}</td>
                    <td>${sp.soLuong}</td>
                    <td>${sp.conHang == "true" ? "Con hang" : "Het hang"}</td>
                    <td>
                        <a href="/b1/view-update?id=${sp.id}">Update</a>
                        <a href="/b1/delete?id=${sp.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
