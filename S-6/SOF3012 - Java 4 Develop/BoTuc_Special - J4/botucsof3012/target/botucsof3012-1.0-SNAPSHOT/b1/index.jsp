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
</head>
<body>
    <h3>From add SP:</h3>
    <form action="/b1/add">
        Ten san pham: <input type="text" name="tenSanPham"><br>
        Nha san xuat: <input type="text" name="nhaSanXuat"><br>
        Gia: <input type="text" name="gia"><br>
        So luong: <input type="text" name="soLuong"><br>
        Con hang: <input type="boolean" name="conHang"><br>
        <br>
        <button>Add</button>
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
                <td>Con hang</td>
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
                    <td>${sp.conHang}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
