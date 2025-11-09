<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 22-Jul-25
  Time: 7:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Updating</title>
</head>
<body>
    <h3>Form update Phong:</h3>
    <br>
    <form action="/buoi5/update" method="post">
        ID: <input type="text" name="id" value="${phong.id}"><br>
        Ten phong: <input type="text" name="tenPhong" value="${phong.tenPhong}"><br>
        Gia: <input type="text" name="gia" value="${phong.gia}"><br>
        Trang thai:
        Con <input type="radio" name="conTrong" value="true" ${phong.conTrong == "true" ? "checked" : ""}>
        Het <input type="radio" name="conTrong" value="false" ${phong.conTrong == "false" ? "checked" : ""}><br>
        Khach san:
        <select name="khachSan">
            <c:forEach items="${listKhachSan}" var="khachSan">
                <option value="${khachSan.id}" label="${khachSan.tenKhachSan}" ${phong.khachSan.id == khachSan.id ? "selected" : ""}></option>
            </c:forEach>
        </select>
        <br>
        <button>Update</button>
    </form>
    <br>
</body>
</html>
