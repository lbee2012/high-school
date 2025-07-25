<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 7/24/2025
  Time: 10:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Updating</title>
</head>
<body>
    <h3>Form update SP</h3>
    <form action="/task1/sua" method="post">
        ID: <input type="text" name="id" value="${sp.id}"><br>
        Ten san pham: <input type="text" name="tenSanPham" value="${sp.tenSanPham}"><br>
        Mo ta: <input type="text" name="moTa" value="${sp.moTa}"><br>
        Gia ban: <input type="text" name="giaBan" value="${sp.giaBan}"><br>
        So luong ton: <input type="text" name="soLuongTon" value="${sp.soLuongTon}"><br>
        Trang thai:
        Con hang: <input type="radio" name="conHang"  value=true ${sp.conHang == "true" ? "checked" : ""}>
        Het hang: <input type="radio" name="conHang" value=false ${sp.conHang == "false" ? "checked" : ""}><br>
        <select name="phanLoai">
            <c:forEach items="${listPL}" var="phanLoai">
                <option value="${phanLoai.id}" label="${phanLoai.tenPhanLoai}" ${sp.phanLoai.id == phanLoai.id ? "selected" : ""}></option>
            </c:forEach>
        </select>
        <br>
        <button>Submit</button>
    </form>
    <br>
</body>
</html>
