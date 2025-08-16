<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 8/15/2025
  Time: 2:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>Thong tin Chi tiet Phong ban</h3>
    ID: ${pb.id}<br><br>
    Ma PB: ${pb.ma}<br><br>
    Ten PB: ${pb.ten}<br><br>
    So luong: ${pb.soLuong}<br><br>
    Ma loai PB: ${pb.lpb.ma}<br><br>
    Ten loai PB: ${pb.lpb.ten}<br><br>
</body>
</html>
