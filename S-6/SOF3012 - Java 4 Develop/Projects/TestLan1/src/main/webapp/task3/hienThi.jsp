<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 7/24/2025
  Time: 1:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Database</title>
</head>
<body>
    <h3>Form add NV</h3>
    <form action="/task3/them" method="post">
        Ten: <input type="text" name="tenNhanVien"><br>
        Ngay sinh: <input type="text" name="ngaySinh"><br>
        Gioi tinh:
        Nam <input type="radio" name="gioiTinh" value="true">
        Nu <input type="radio" name="gioiTinh" value="false"><br>
        Luong: <input type="text" name="luong"><br>
        Phong ban:
        <select name="phongBan">
            <c:forEach items="${listPB}" var="pb">
                <option value="${pb.id}" label="${pb.tenPhongBan}"></option>
            </c:forEach>
        </select>
    </form>
    <h1>Database Fetch</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Ten</th>
                <th>Ngay sinh</th>
                <th>Gioi tinh</th>
                <th>Luong</th>
                <th>Phong ban</th>
                <th>Vi tri</th>
                <th>Hanh dong</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listNV}" var="nv">
                <tr>
                    <td>${nv.id}</td>
                    <td>${nv.tenNhanVien}</td>
                    <td>${nv.ngaySinh}</td>
                    <td>${nv.gioiTinh == "true" ? "Nam" : "Nu"}</td>
                    <td>${nv.phongBan.tenPhongBan}</td>
                    <td>${nv.phongBan.viTri}</td>
                    <td>
                        <a href="/task3/view-update?id=${nv.id}">Update</a>
                        <a href="/task3/delete?id=${nv.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
