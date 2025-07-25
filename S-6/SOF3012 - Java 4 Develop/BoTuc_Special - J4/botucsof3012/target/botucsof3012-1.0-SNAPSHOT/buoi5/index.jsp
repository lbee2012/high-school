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
        th, td {
            border: 1px solid;
            padding: 4px;
        }
    </style>
</head>
<body>
    <h3>Form add Phong:</h3>
    <br>
    <form action="/buoi5/add" method="post">
        Ten phong: <input type="text" name="tenPhong"><br>
        Gia: <input type="text" name="gia"><br>
        Trang thai:
        Con <input type="radio" name="conTrong" value="true">
        Het <input type="radio" name="conTrong" value="false"><br>
        Khach san:
        <select name="khachSan">
            <c:forEach items="${listKhachSan}" var="khachSan">
                <option value="${khachSan.id}" label="${khachSan.tenKhachSan}"></option>
            </c:forEach>
        </select>
        <br>
        <button>Add</button>
    </form>
    <br>
    <h1>Database:</h1>
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
            <c:forEach items="${listPhong}" var="phong">
                <tr>
                    <td>${phong.id}</td>
                    <td>${phong.tenPhong}</td>
                    <td>${phong.gia}</td>
                    <td>${phong.conTrong == "true" ? "Con" : "Het"}</td>
                    <td>${phong.khachSan.tenKhachSan}</td>
                    <td>${phong.khachSan.diaChi}</td>
                    <td>
                        <a href="/buoi5/view-update?id=${phong.id}">view update</a>
                        <a href="/buoi5/delete?id=${phong.id}">delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
