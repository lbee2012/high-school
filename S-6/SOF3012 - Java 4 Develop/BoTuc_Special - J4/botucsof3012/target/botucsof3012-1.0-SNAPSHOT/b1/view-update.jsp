<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 22-Jul-25
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Updating</title>
</head>
<body>
    <h3>From update SP:</h3>
    <form action="/b1/add">
        ID: <input type="text" name="id" value="${sp.id}"><br>
        Ten san pham: <input type="text" name="tenSanPham" value="${sp.tenSanPham}"><br>
        Nha san xuat: <input type="text" name="nhaSanXuat" value="${sp.nhaSanXuat}"><br>
        Gia: <input type="text" name="gia" value="${sp.gia}"><br>
        So luong: <input type="text" name="soLuong" value="${sp.soLuong}"><br>
        Con hang: <input type="boolean" name="conHang" value="${sp.conHang}"><br>
        <br>
        <button>Update</button>
    </form>
</body>
</html>
