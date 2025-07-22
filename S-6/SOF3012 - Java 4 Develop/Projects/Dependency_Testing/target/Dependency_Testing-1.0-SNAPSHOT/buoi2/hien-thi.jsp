<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lovep
  Date: 7/4/2025
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Them thong tin: <br>
    <form action="/sinh-vien/them" method="post">
        Ten: <input type="text" name="ten"> <br>
        Dia chi: <input type="text" name="diaChi"> <br>
        Nam sinh: <input type="text" name="namSinh"> <br>
        <button>Save</button>
    </form>
    <br>
    <form action="/sinh-vien/search">
        Ten: <input type="text" name="ten">
        <button>Tim kiem</button>
    </form>
    <br>
    <button><a href="/sinh-vien/sap-xep">Sap xep theo Nam sinha></button>
    <br>
    Bang thong tin
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Ten</th>
                <th>Dia chi</th>
                <th>Nam sinh</th>
                <th>Hanh dong</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${danhSach}" var="sv">
                <tr>
                    <td>${sv.id}</td>
                    <td>${sv.ten}</td>
                    <td>${sv.diaChi}</td>
                    <td>${sv.namSinh}</td>
                    <td>
                        <a href="/sinh-vien/view-update?id=${sv.id}">View update</a>
                        <a href="/sinh-vien/xoa?id=${sv.id}">Xoa</a>
                        <a href="/sinh-vien/chi-tiet?id=${sv.id}">Chi tiet</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/sinh-vien/phan-trang?page=${page - 1}">Prev</a>
    <a href="/sinh-vien/phan-trang?page=${page + 1}">Next</a>
</body>
</html>
