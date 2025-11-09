<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 8/5/2025
  Time: 9:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail</title>
</head>
<body>
    <h3>Thong tin cua san pham co ID so ${sp.id}</h3>
    Ten: ${sp.tenSP}
    Mo ta: ${sp.moTa}
    Gia ban: ${sp.giaBan}
    So luong: ${sp.soLuong}
    Con hang: ${sp.conHang == true ? "Con" : "Het"}
    Danh muc: ${sp.dm.tenDanhMuc}
</body>
</html>
