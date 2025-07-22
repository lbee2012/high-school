<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h3>INFORMATION</h3>
    <table>
        <thead>
            <tr>
                <td>ID</td>
                <td>Ten sach</td>
                <td>Tac gia</td>
                <td>Gia</td>
                <td>So luong</td>
                <td>Con hang</td>
                <td>The loai</td>
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
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>