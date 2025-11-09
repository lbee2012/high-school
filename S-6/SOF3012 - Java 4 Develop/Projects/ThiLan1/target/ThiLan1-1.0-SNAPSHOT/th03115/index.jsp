<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 7/25/2025
  Time: 2:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        th, td {
            border: 1px solid;
            padding: 4px;
        }
    </style>
</head>
<body>
    <h3>Form add Cap sach</h3>
    <form action="/th03115/add" method="post">
        Ten cap sach: <input type="text" name="tenCapSach"><br>
        Mo ta: <input type="text" name="moTa"><br>
        So ngan: <input type="text" name="soNgan"><br>
        Trong luong: <input type="text" name="trongLuong"><br>
        Ngan dung laptop:
        Co <input type="radio" name="laptop" value="true">
        Khong <input type="radio" name="laptop" value="false"><br>
        <br>
        <button>Submit</button>
    </form>
    <h1>Database</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Ten cap sach</th>
                <th>Mo ta</th>
                <th>So ngan</th>
                <th>Trong luong</th>
                <th>Ngan dung Laptop</th>
                <th>Hanh dong</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listCS}" var="cs">
                <tr>
                    <td>${cs.id}</td>
                    <td>${cs.tenCapSach}</td>
                    <td>${cs.moTa}</td>
                    <td>${cs.soNgan}</td>
                    <td>${cs.trongLuong}</td>
                    <td>${cs.laptop == "true" ? "Co" : "Khong"}</td>
                    <td>
                        <a href="/th03115/view-update?id=${cs.id}">Update</a>
<%--                        <a href="/th03115/delete?id=${cs.id}">Delete</a>--%>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
