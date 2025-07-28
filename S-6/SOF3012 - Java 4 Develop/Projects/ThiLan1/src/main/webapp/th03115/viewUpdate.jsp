<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 7/25/2025
  Time: 2:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Updating</title>
</head>
<body>
    <h3>Form update Cap sach</h3>
    <form action="/th03115/update" method="post">
        ID: <input type="text" name="id" value="${cs.id}"><br>
        Ten cap sach: <input type="text" name="tenCapSach" value="${cs.tenCapSach}"><br>
        Mo ta: <input type="text" name="moTa" value="${cs.moTa}"><br>
        So ngan: <input type="text" name="soNgan" value="${cs.soNgan}"><br>
        Trong luong: <input type="text" name="trongLuong" value="${cs.trongLuong}"><br>
        Ngan dung laptop:
        Co <input type="radio" name="laptop" value="true" ${cs.laptop == "true" ? "checked" : ""}>
        Khong <input type="radio" name="laptop" value="false" ${cs.laptop == "false" ? "checked" : ""}><br>
        <br>
        <button>Submit</button>
    </form>
</body>
</html>
