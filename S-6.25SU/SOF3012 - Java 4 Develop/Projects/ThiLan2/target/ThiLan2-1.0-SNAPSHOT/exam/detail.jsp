<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 8/8/2025
  Time: 8:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Thong tin Sach</h1>
    ID: ${s.id}<br>
    Tieu de: ${s.tieuDe}<br>
    Nam xuat ban: ${s.namXuatBan}<br>
    Trang thai: ${s.trangThai == true ? "Mo ban" : "Khong mo ban"}<br>
    Tac gia: ${s.tg.tenTacGia}<br>
    Nam sinh tg: ${s.tg.namSinh}
</body>
</html>
