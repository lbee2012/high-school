<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Updating</title>
</head>
<body>
    <h3>Form update SP</h3>
    <form action="/de1/update" method="post">
        ID: <input type="text" name="id" value="${sp.id}"><br>
        Ten: <input type="text" name="tenSP" value="${sp.tenSP}"><br>
        Mo ta: <input type="text" name="moTa" value="${sp.moTa}"><br>
        Gia ban: <input type="text" name="giaBan" value="${sp.giaBan}"><br>
        So luong: <input type="text" name="soLuong" value="${sp.soLuong}"><br>
        Con hang:
        Con <input type="radio" name="conHang" value="true" ${sp.conHang == "true" ? "checked" : ""}>
        Het <input type="radio" name="conHang" value="false"  ${sp.conHang == "false" ? "checked" : ""}><br>
        Danh muc
        <select name="dm">
            <c:forEach items="${listDM}" var="dm">
                <option value="${dm.id}" label="${dm.tenDanhMuc}" ${dm.id == sp.dm.id ? "selected" : ""}></option>
            </c:forEach>
        </select>
        <button>Submit</button>
    </form>
</body>
</html>
