<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Table: sach-the_loai</title>
    <style>
        table, th, td {
            border: 1px solid;
        }
    </style>
</head>
<body>
    <h3>Form add Sach</h3>
    <form action="/buoi7/add" method="post">
        Ten: <input type="text" name="tenSach"><br>
        Tac gia: <input type="text" name="tacGia"><br>
        Gia: <input type="text" name="gia"><br>
        So luong: <input type="text" name="soLuong"><br>
        Con hang: 
        Con <input type="radio" name="conHang" value="true">
        Het <input type="radio" name="conHang" value="false"><br>
        <select name="theLoai">
            <c:forEach items="${listTheLoai}" var="tl">
                <option value="${tl.id}" label="${tl.tenTheLoai}"></option>
            </c:forEach>
        </select>
        <br>
        <button>Add</button>
    </form>
    <h3>INFORMATION</h3>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Ten sach</th>
                <th>Tac gia</th>
                <th>Gia</th>
                <th>So luong</th>
                <th>Con hang</th>
                <th>The loai</th>
                <th>Hanh dong</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listSach}" var="s">
                <tr>
                    <td>${s.id}</td>
                    <td>${s.tenSach}</td>
                    <td>${s.tacGia}</td>
                    <td>${s.gia}</td>
                    <td>${s.soLuong}</td>
                    <td>${s.conHang == "true" ? "Con" : "Het"}</td>
                    <td>${s.theLoai.tenTheLoai}</td>
                    <td>
                        <a href="/buoi7/view-update?id=${s.id}">Update</a>
                        <a href="/buoi7/delete?id=${s.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>