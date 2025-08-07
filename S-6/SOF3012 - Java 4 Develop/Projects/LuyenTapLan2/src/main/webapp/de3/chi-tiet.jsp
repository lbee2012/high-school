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
    <h3>Thong tin Chi tiet Phim</h3>
    ID: ${p.id}<br>
    Ten phim: ${p.tenPhim}<br>
    Dao dien: ${p.daoDien}<br>
    Nam phat hanh: ${p.namPhatHanh}<br>
    Dang chieu: ${p.dangChieu == true ? "Co" : "Khong"}<br>
    The loai: ${p.tl.tenTheLoai}<br>
</body>
</html>
