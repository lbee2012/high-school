<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 8/7/2025
  Time: 9:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Thong tin</h1>
    <h3>Lop hoc</h3>
    ID: ${lh.id}<br>
    Ten lop: ${lh.tenLop}<br>
    So luong SV: ${lh.soLuongSV}<br>
    Thoi luong: ${lh.thoiLuong}<br>
    <h3>Giao vien</h3>
    Giao vien: ${lh.gv.tenGV}<br>
    Email: ${lh.gv.email}<br>
    SDT: ${lh.gv.sdt}<br>
    Chuyen mon: ${lh.gv.chuyenMon}<br>
</body>
</html>
