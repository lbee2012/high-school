<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 8/14/2025
  Time: 5:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>Form add NV</h3>
    <form action="/de1/add" method="post">
        Ma: <input type="text" name="ma"><br>
        Ten: <input type="text" name="ten"><br>
        Dem: <input type="text" name="tenDem"><br>
        Ho: <input type="text" name="ho"><br>
        Gioi tinh: <input type="text" name="gioiTinh"><br>
        Dia chi: <input type="text" name="diaChi"><br>
        SDT: <input type="text" name="sdt"><br>
        Mat khau: <input type="text" name="matKhau"><br>
        Chuc vu
        <select name="cv">
            <c:forEach items="${listCV}" var="cv">
                <option value="${cv.id}" label="${cv.ten}"></option>
            </c:forEach>
        </select><br>
        Trang thai:
        Dang lam viec <input type="radio" name="trangThai" value=1>
        Da nghi lam<input type="radio" name="trangThai" value=0><br>

        <button>Submit</button>
    </form>
    <h1>Dâtbáe</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Ma</th>
                <th>Ten</th>
                <th>Dem</th>
                <th>Ho</th>
                <th>Gioi tinh</th>
                <th>Dia chi</th>
                <th>SDT</th>
                <th>Mat khau</th>
                <th>Chuc vu</th>
                <th>Trang thai</th>
                <th>Hanh dong</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listNV}" var="nv">
                <tr>
                    <td>${nv.id}</td>
                    <td>${nv.ma}</td>
                    <td>${nv.ten}</td>
                    <td>${nv.tenDem}</td>
                    <td>${nv.ho}</td>
                    <td>${nv.gioiTinh}</td>
                    <td>${nv.diaChi}</td>
                    <td>${nv.sdt}</td>
                    <td>${nv.matKhau}</td>
                    <td>${nv.cv.ten}</td>
                    <td>${nv.trangThai == 1 ? "Dang lam viec" : "Da nghi lam"}</td>
                    <td>
                        <a href="/de1/detail?id=${nv.id}">Detail</a>
                        <a href="/de1/view-update?id=${nv.id}">Update</a>
                        <a href="/de1/delete?id=${nv.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
