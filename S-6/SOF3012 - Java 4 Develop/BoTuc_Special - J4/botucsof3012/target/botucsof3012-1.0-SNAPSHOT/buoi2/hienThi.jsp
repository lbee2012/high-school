<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 20-Jul-25
  Time: 9:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Table: nuoc_hoa</title>
</head>
<body>
    <h3>Them Nuoc hoa</h3>
    <form action="/buoi2/them" method="post">
        Ten: <input type="text" name="ten"> <br>
        So luong: <input type="text" name="soLuong"> <br>
        Gia: <input type="text" name="gia"> <br>
        <br>
        <button>Them</button>
    </form>
    <br>
    <h3>Thong tin Nuoc hoa:</h3>
    <table>
        <thead>
            <tr>
                <td>ID</td>
                <td>Ten</td>
                <td>So luong</td>
                <td>Gia</td>
                <td>Hanh dong</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${danhSach}" var="nh">
                <tr>
                    <td>${nh.id}</td>
                    <td>${nh.ten}</td>
                    <td>${nh.soLuong}</td>
                    <td>${nh.gia}</td>
                    <td>
                        <a href="/buoi2/chi-tiet?id=${nh.id}">Chi tiet</a>
                        <a href="/buoi2/view-update?id=${nh.id}">View update</a>
                        <a href="/buoi2/xoa?id=${nh.id}">Xoa</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
