<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 8/7/2025
  Time: 12:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>Form add Phim</h3>
    <form action="/de3/them" method="post">
        Ten: <input type="text", name="tenPhim"><br>
        Dao dien: <input type="text", name="daoDien"><br>
        Nam phat hanh: <input type="text", name="namPhatHanh"><br>
        Dang chieu:
        Co <input type="radio", name="dangChieu" value="true">
        Khong <input type="radio", name="dangChieu" value="false"><br>
        <select name="tl">
            <c:forEach items="${listTL}" var="tl">
                <option value="${tl.id}" label="${tl.tenTheLoai}"></option>
            </c:forEach>
        </select>
        <br>
        <button>Them</button>
    </form>
    <h1>Table: Phim + TheLoai</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Ten phim</th>
                <th>Dao dien</th>
                <th>Nam phat hanh</th>
                <th>Dang chieu</th>
                <th>The loai</th>
                <th>Hanh dong</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listP}" var="p">
                <tr>
                    <td>${p.id}</td>
                    <td>${p.tenPhim}</td>
                    <td>${p.daoDien}</td>
                    <td>${p.namPhatHanh}</td>
                    <td>${p.dangChieu == true ? "Co" : "khong"}</td>
                    <td>${p.tl.tenTheLoai}</td>
                    <td>
                        <a href="/de3/chi-tiet?id=${p.id}">Xem</a>
                        <a href="/de3/xem-sua?id=${p.id}">Sua</a>
                        <a href="/de3/xoa?id=${p.id}">Xoa</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/de3/phan-trang?page=${page - 1}">Prev</a>
    <a href="/de3/phan-trang?page=${page + 1}">Next</a>
</body>
</html>
