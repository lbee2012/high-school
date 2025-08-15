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
    <form action="/de2/update" method="post">
        ID: <input type="text" name="id" value="${n.id}"><br>
        Dia chi: <input type="text" name="diaChi" value="${n.diaChi}"><br>
        Loai nha:
        Nha dat <input type="radio" name="loaiNha" value="nhaDat" ${n.diaChi == "nhaDat" ? "checked" : ""}>
        Chung cu <input type="radio" name="loaiNha" value="chungCu" ${n.diaChi == "chungCu" ? "checked" : ""}><br>
        Gia tien: <input type="text" name="giaTien" value="${n.giaTien}"><br>
        Chu nha
        <select name="cn">
            <c:forEach items="${listCN}" var="cn">
                <option value="${cn.id}" label="${cn.ten}" ${cn.id == n.cn.id ? "selected" : ""}></option>
            </c:forEach>
        </select><br>
        <button>Submit</button>
    </form>
</body>
</html>
