<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 7/28/2025
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Database</title>
    <style>
        th, td {
            border: 1px solid;
            padding: 4px;
        }
    </style>
</head>
<body>
    <h3>Form add BH</h3>
    <form action="/buoi10/add" method="post">
        Ten bai hat: <input type="text" name="tenBaiHat"><br>
        Thoi luong: <input type="text" name="thoiLuong"><br>
        Phat hanh:
        Roi <input type="radio" name="phatHanhChua" value="true">
        Chua <input type="radio" name="phatHanhChua" value="false"><br>
        Ten ca si:
        <select name="caSi">
            <c:forEach items="${listCS}" var="cs">
                <option value="${cs.id}" label="${cs.tenCaSi}"></option>
            </c:forEach>
        </select>
        <br>
        <button>Submit</button>
    </form>
    <br>
    <h1>Database Fetching</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Bai hat</th>
                <th>Thoi luong</th>
                <th>Phat hanh</th>
                <th>Ca si</th>
                <th>Hanh dong</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listBH}" var="bh">
                <tr>
                    <td>${bh.id}</td>
                    <td>${bh.tenBaiHat}</td>
                    <td>${bh.thoiLuong}</td>
                    <td>${bh.phatHanhChua == "true" ? "Da phat hanh" : "Chua phat hanh"}</td>
                    <td>${bh.caSi.tenCaSi}</td>
                    <td>
                        <a href="/buoi10/view-update?id=${bh.id}">Update</a>
                        <a href="/buoi10/delete?id=${bh.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
