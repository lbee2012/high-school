<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 22-Jul-25
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Table: may_tinh</title>
</head>
<body>
    <h3>Form Add MT:</h3>
    <form action="/buoi4/add" method="post">
        Hang: <input type="text" name="hang"><br>
        Ton kho: <input type="text" name="tonKho"><br>
        Bo nho: <input type="text" name="boNho"><br>
        <br>
        <button>Add</button>
    </form>

    <br>

    <h1>Thong tin May tinh:</h1>
    <table>
        <thead>
            <tr>
                <td>ID</td>
                <td>Hang</td>
                <td>Ton kho</td>
                <td>Bo nho</td>
                <td>Hanh dong</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listAll}" var="mt">
                <tr>
                    <td>${mt.id}</td>
                    <td>${mt.hang}</td>
                    <td>${mt.tonKho}</td>
                    <td>${mt.boNho}</td>
                    <td>
                        <a href="/buoi4/detail?id=${mt.id}">Detail</a>
                        <a href="/buoi4/view-update?id=${mt.id}">Update</a>
                        <a href="/buoi4/delete?id=${mt.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
