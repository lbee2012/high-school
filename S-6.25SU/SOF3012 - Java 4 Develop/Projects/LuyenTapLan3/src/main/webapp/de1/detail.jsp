<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 8/14/2025
  Time: 5:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>Detailed Information of: ${nv.id}</h3>
    ID: ${nv.id}<br>
    Ma: ${nv.ma}<br>
    Ten: ${nv.ten}<br>
    Dem: ${nv.tenDem}<br>
    Ho: ${nv.ho}<br>
    Gioi tinh: ${nv.gioiTinh}<br>
    Dia chi: ${nv.diaChi}<br>
    SDT: ${nv.sdt}<br>
    Mat khau: ${nv.matKhau}<br>
    Chuc vu: ${nv.cv.ten}<br>
    Trang thai: ${nv.trangThai == 1 ? "Dang lam viec" : "Da nghi lam"}<br>
</body>
</html>
