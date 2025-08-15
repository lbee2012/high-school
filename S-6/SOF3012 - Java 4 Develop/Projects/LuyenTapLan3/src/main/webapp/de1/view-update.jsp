<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <h3>Form update NV</h3>
    <form action="/de1/update" method="post">
        ID: <input type="text" name="id" value="${nv.id}"><br>
        Ma: <input type="text" name="ma" value="${nv.ma}"><br>
        Ten: <input type="text" name="ten" value="${nv.ten}"><br>
        Dem: <input type="text" name="tenDem" value="${nv.tenDem}"><br>
        Ho: <input type="text" name="ho" value="${nv.ho}"><br>
        Gioi tinh: <input type="text" name="gioiTinh" value="${nv.gioiTinh}"><br>
        Dia chi: <input type="text" name="diaChi" value="${nv.diaChi}"><br>
        SDT: <input type="text" name="sdt" value="${nv.sdt}"><br>
        Mat khau: <input type="text" name="matKhau" value="${nv.matKhau}"><br>
        Chuc vu
        <select name="cv">
            <c:forEach items="${listCV}" var="cv">
                <option value="${cv.id}" label="${cv.ten}" ${cv.id == nv.cv.id ? "selected" : ""}></option>
            </c:forEach>
        </select><br>
        Trang thai:
        Dang lam viec <input type="radio" name="trangThai" value=1 ${nv.trangThai == 1 ? "checked" : ""}>
        Da nghi lam<input type="radio" name="trangThai" value=0 ${nv.trangThai == 0 ? "checked" : ""}><br>

        <button>Submit</button>
    </form>
</body>
</html>
