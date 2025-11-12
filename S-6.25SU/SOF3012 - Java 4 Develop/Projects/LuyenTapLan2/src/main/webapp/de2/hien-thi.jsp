<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 8/7/2025
  Time: 9:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>Form them Lop hoc</h3>
    <form action="/de2/them" method="post">
        Ten lop: <input type="text" name="tenLop"><br>
        So luong SV: <input type="text" name="soLuongSV"><br>
        Thoi luong: <input type="text" name="thoiLuong"><br>
        <select name="gv">
            <c:forEach items="${listGV}" var="gv">
                <option value="${gv.id}" label="${gv.chuyenMon}"></option>
            </c:forEach>
        </select>
        <br>
        <button>Them</button>
    </form>
    <h1>Co so du lieu</h1>
    <form action="/de2/tim-kiem">
        <input type="text" name="tenLop" placeholder="Nhap ten lop">
        <button>Tim kiem</button>
    </form>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Ten lop</th>
                <th>So luong SV</th>
                <th>Thoi luong</th>
                <th>Ten GV</th>
                <th>Email</th>
                <th>SDT</th>
                <th>Chuyen mon</th>
                <th>Hanh dong</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listLH}" var="lh">
                <tr>
                    <td>${lh.id}</td>
                    <td>${lh.tenLop}</td>
                    <td>${lh.soLuongSV}</td>
                    <td>${lh.thoiLuong}</td>
                    <td>${lh.gv.tenGV}</td>
                    <td>${lh.gv.email}</td>
                    <td>${lh.gv.sdt}</td>
                    <td>${lh.gv.chuyenMon}</td>
                    <td>
                        <a href="/de2/chi-tiet?id=${lh.id}">Xem</a>
                        <a href="/de2/view-sua?id=${lh.id}">Sua</a>
                        <a href="/de2/xoa?id=${lh.id}">Xoa</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
