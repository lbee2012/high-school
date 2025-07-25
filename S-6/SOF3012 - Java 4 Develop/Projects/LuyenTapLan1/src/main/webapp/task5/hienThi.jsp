<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 7/25/2025
  Time: 9:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Database</title>
</head>
<body>
    <h1>Database</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Ten dang nhap</th>
                <th>Mat khau</th>
                <th>Email</th>
                <th>Ho ten</th>
                <th>Trang thai</th>
                <th>Hanh dong</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listND}" var="nd">
                <tr>
                    <td>${nd.id}</td>
                    <td>${nd.tenDangNhap}</td>
                    <td>${nd.matKhau}</td>
                    <td>${nd.email}</td>
                    <td>${nd.hoTen}</td>
                    <td>${nd.trangThai == "true" ? "Hoat dong" : "Khong hoat dong"}</td>
                    <td>
                        <a href="/task5/view-sua?id=${nd.id}">Update</a>
                        <a href="/task5/xoa?id=${nd.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
