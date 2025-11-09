<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 7/24/2025
  Time: 1:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Updating</title>
</head>
<body>
    <h3>Form add NV</h3>
    <form action="/task3/sua" method="post">
        ID: <input type="text" name="id" value="${nv.id}"><br>
        Ten: <input type="text" name="tenNhanVien" value="${nv.id}"><br>
        Ngay sinh: <input type="text" name="ngaySinh" value="${nv.id}"><br>
        Gioi tinh:
        Nam <input type="radio" name="gioiTinh" value="true" ${nv.gioiTinh == "true" ? "checked" : ""}>
        Nu <input type="radio" name="gioiTinh" value="false" ${nv.gioiTinh == "true" ? "checked" : ""}><br>
        Luong: <input type="text" name="luong" value="${nv.id}"><br>
        Phong ban:
        <select name="phongBan">
            <c:forEach items="${listPB}" var="pb">
                <option value="${pb.id}" label="${pb.tenPhongBan}"></option>
            </c:forEach>
        </select>
    </form>
    <br>
</body>
</html>
