<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 8/8/2025
  Time: 8:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>Form add</h3>
    <form action="/exam/add" method="post">
        Tieu de: <input type="text" name="tieuDe"><br>
        Nam xuat ban: <input type="text" name="namXuatBan"><br>
        Trang thai:
        Mo ban <input type="radio" name="trangThai">
        Khong mo ban: <input type="radio" name="trangThai"><br>
        <select name="tg">
            <c:forEach items="${listTG}" var="tg">
                <option value="${tg.id}" label="${tg.tenTacGia}"></option>
            </c:forEach>
        </select>
    </form>
    <h1>Database</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Tieu de</th>
                <th>Nam xuat ban</th>
                <th>Trang thai</th>
                <th>Tac gia</th>
                <th>Hanh dong</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listS}" var="s">
                <tr>
                    <td>${s.id}</td>
                    <td>${s.tieuDe}</td>
                    <td>${s.namXuatBan}</td>
                    <td>${s.trangThai == true ? "Mo ban" : "Khong mo ban"}</td>
                    <td>${s.tg.tenTacGia}</td>
                    <td>
                        <a href="/exam/detail?id=${s.id}">Detail</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
