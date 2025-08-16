<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <script>
        function confirmButton() {
            confirm("Ban chac chan muon cap nhat thong tin chu?", "Chac chan", "Khong");
        };
        function alertButton() {
            alert("Ban co chac chan muon Cap nhat thong tin?");
        };
    </script>
</head>
<body>
    <h3>Form Update Phong ban</h3>
    <form action="/phong-ban/update" method="post">
        ID: <input type="text" name="id" value="${pb.id}"><br>
        Ma PB: <input type="text" name="ma" value="${pb.ma}"><br>
        Ten PB: <input type="text" name="ten" value="${pb.ten}"><br>
        So luong: <input type="text" name="soLuong" value="${pb.soLuong}"><br>
        Ten loai PB:
        <select name="lpb">
            <c:forEach items="${listLPB}" var="lpb">
                <option value="${lpb.id}" label="${lpb.ten}" ${lpb.id == pb.lpb.id ? "selected" : ""}></option>
            </c:forEach>
        </select><br>
        <button onclick="confirmButton()">Update</button>
    </form>
</body>
</html>
