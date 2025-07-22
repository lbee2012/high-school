<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 22-Jul-25
  Time: 7:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Table: phong - khach_san</title>
    <style>
        table, th, td {
            border: 1px solid;
        }
    </style>
</head>
<body>
    <h1>Database</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Ten phong</th>
                <th>Gia</th>
                <th>Con trong</th>
                <th>Ten khach san</th>
                <th>Dia chi</th>
                <th>Hanh dong</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listAll}" var="phong">
                <tr>
                    <td>${phong.id}</td>
                    <td>${phong.tenPhong}</td>
                    <td>${phong.gia}</td>
                    <td>${phong.conTrong == "true" ? "Trong" : "Con"}</td>
                    <td>${phong.khachSan.tenKhachSan}</td>
                    <td>${phong.khachSan.diaChi}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
