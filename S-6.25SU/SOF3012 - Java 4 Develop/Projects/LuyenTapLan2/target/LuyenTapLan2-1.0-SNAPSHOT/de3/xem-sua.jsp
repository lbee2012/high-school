<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 8/7/2025
  Time: 12:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>Form update Phim</h3>
    <form action="/de3/sua" method="post">
        ID: <input type="text", name="id" value="${p.id}"><br>
        Ten: <input type="text", name="tenPhim" value="${p.tenPhim}"><br>
        Dao dien: <input type="text", name="daoDien" value="${p.daoDien}"><br>
        Nam phat hanh: <input type="text", name="namPhatHanh" value="${p.namPhatHanh}"><br>
        Dang chieu:
        Co <input type="radio", name="dangChieu" value="true" ${p.dangChieu == "true" ? "checked" : ""}>
        Khong <input type="radio", name="dangChieu" value="false" ${p.dangChieu == "false" ? "checked" : ""}><br>
        <select name="tl">
            <c:forEach items="${listTL}" var="tl">
                <option value="${tl.id}" label="${tl.tenTheLoai}" ${tl.id == p.tl.id ? "selected" : ""}></option>
            </c:forEach>
        </select>
        <br>
        <button>Sua</button>
    </form>
</body>
</html>
