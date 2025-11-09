<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 8/5/2025
  Time: 9:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
    <style>
        th, td {
            border: 1px solid;
            margin: 4px;
            padding: 4px;
        }
    </style>
</head>
<body>
    <h3>Form add SP</h3>
    <form action="/de1/add" method="post">
        Ten: <input type="text" name="tenSP"><br>
        Mo ta: <input type="text" name="moTa"><br>
        Gia ban: <input type="text" name="giaBan"><br>
        So luong: <input type="text" name="soLuong"><br>
        Con hang:
        Con <input type="radio" name="conHang" value="true">
        Het <input type="radio" name="conHang" value="false"><br>
        Danh muc
        <select name="dm">
            <c:forEach items="${listDM}" var="dm">
                <option value="${dm.id}" label="${dm.tenDanhMuc}"></option>
            </c:forEach>
        </select>
        <button>Submit</button>
    </form>
    <h1>Database</h1>
    <form action="/de1/search">
        <input type="text" name="tenSP" placeholder="Nhap Ten san pham">
        <button>Search</button>
    </form>
    <button><a href="/de1/sort">Sap xep theo Gia</a></button>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Ten</th>
                <th>Mo ta</th>
                <th>Gia ban</th>
                <th>So luong</th>
                <th>Con hang</th>
                <th>Danh muc</th>
                <th>Hanh dong</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listSP}" var="sp">
                <tr>
                    <td>${sp.id}</td>
                    <td>${sp.tenSP}</td>
                    <td>${sp.moTa}</td>
                    <td>${sp.giaBan}</td>
                    <td>${sp.soLuong}</td>
                    <td>${sp.conHang == true ? "Con" : "Het"}</td>
                    <td>${sp.dm.tenDanhMuc}</td>
                    <td>
                        <a href="/de1/detail?id=${sp.id}">Detail</a>
                        <a href="/de1/view-update?id=${sp.id}">Update</a>
                        <a href="/de1/delete?id=${sp.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/de1/page?page=${page - 1}">Prev</a>
    <a href="/de1/page?page=${page + 1}">Next</a>
</body>
</html>
