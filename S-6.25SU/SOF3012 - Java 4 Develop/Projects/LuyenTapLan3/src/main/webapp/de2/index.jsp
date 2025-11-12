<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 8/15/2025
  Time: 6:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>Form add Nha</h3>
    <form action="/de2/add" method="post">
        Dia chi: <input type="text" name="diaChi"><br>
        Loai nha:
        Nha dat <input type="radio" name="loaiNha" value="nhaDat">
        Chung cu <input type="radio" name="loaiNha" value="chungCu"><br>
        Gia tien: <input type="text" name="giaTien"><br>
        Chu nha
        <select name="cn">
            <c:forEach items="${listCN}" var="cn">
                <option value="${cn.id}" label="${cn.ten}"></option>
            </c:forEach>
        </select><br>
        <button>Submit</button>
    </form>
    <h1>Database</h1>
    <form action="/de2/search">
        <input type="text" name="diaChi" placeholder="Nhap dia chi lien quan can tim">
        <button>Search</button>
    </form>
    <button><a href="/de2/sort">Sort by Gia tien</a></button>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Dia chi</th>
                <th>Loai nha</th>
                <th>Gia tien</th>
                <th>Chu nha</th>
                <th>Hanh dong</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listN}" var="n">
                <tr>
                    <td>${n.id}</td>
                    <td>${n.diaChi}</td>
                    <td>${n.loaiNha}</td>
                    <td>${n.giaTien}</td>
                    <td>${n.cn.ten}</td>
                    <td>
                        <a href="/de2/view-update?id=${n.id}">Update</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/de2/page?page=${page - 1}">Prev</a>
    <a href="/de2/page?page=${page + 1}">Next</a>
</body>
</html>
