<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 8/5/2025
  Time: 10:22 AM
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
            margin: 4px;
        }
    </style>
</head>
<body>
    <h3>Form add HS</h3>
    <form action="/buoi13/add" method="post">
        Ten: <input type="text" name="tenHocSinh"><br>
        Tuoi: <input type="text" name="tuoi"><br>
        Trang thai:
        Dang hoc <input type="radio" name="dangHoc" value="true">
        Khong hoc <input type="radio" name="dangHoc" value="false"><br>
        Truong:
        <select name="truongHoc">
            <c:forEach items="${listTH}" var="th">
                <option value="${th.id}" label="${th.tenTruong}"></option>
            </c:forEach>
        </select>
        <br>
        <button>Submit</button>
    </form>
    <h1>Database</h1>
    <form action="/buoi13/search">
        Ten: <input type="text" name="tenHocSinh" placeholder="Tim kiem ten hoc sinh">
        <button>Submit</button>
    </form>
    <br>
    <button><a href="/buoi13/sort">Sap xep theo tuoi</a></button>
    <br>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Ten</th>
                <th>Tuoi</th>
                <th>Dang hoc?</th>
                <th>Truong</th>
                <th>Hanh dong</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listHS}" var="hs">
                <tr>
                    <td>${hs.id}</td>
                    <td>${hs.tenHocSinh}</td>
                    <td>${hs.tuoi}</td>
                    <td>${hs.dangHoc == "true" ? "Co" : "Khong"}</td>
                    <td>${hs.truongHoc.tenTruong}</td>
                    <td>
                        <a href="/buoi13/view-update?id=${hs.id}">Update</a>
                        <a href="/buoi13/delete?id=${hs.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/buoi13/page?page=${page - 1}">Prev</a>
    <a href="/buoi13/page?page=${page + 1}">Next</a>
</body>
</html>
