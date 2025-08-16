<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        th, td {
            border: 1px solid;
            margin: 4px;
            padding: 4px;
        }
    </style>
</head>
<body>
    <h1>Quan ly Phong ban</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Ma phong ban</th>
                <th>Ten phong ban</th>
                <th>So luong</th>
                <th>Ma loai phong ban</th>
                <th>Ten loai phong ban</th>
                <th>Hanh dong</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listPB}" var="pb">
                <tr>
                    <td>${pb.id}</td>
                    <td>${pb.ma}</td>
                    <td>${pb.ten}</td>
                    <td>${pb.soLuong}</td>
                    <td>${pb.lpb.ma}</td>
                    <td>${pb.lpb.ten}</td>
                    <td>
                        <a href="/phong-ban/detail?id=${pb.id}">Detail</a>
                        <a href="/phong-ban/view-update?id=${pb.id}">Update</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>