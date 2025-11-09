<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 8/5/2025
  Time: 10:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Updating</title>
</head>
<body>
    <h3>Form update HS</h3>
    <form action="/buoi13/update" method="post">
        ID: <input type="text" name="id" value="${hs.id}"><br>
        Ten: <input type="text" name="tenHocSinh" value="${hs.tenHocSinh}"><br>
        Tuoi: <input type="text" name="tuoi" value="${hs.tuoi}"><br>
        Trang thai:
        Dang hoc <input type="radio" name="dangHoc" value="true" ${hs.dangHoc == "true" ? "checked" : ""}>
        Khong hoc <input type="radio" name="dangHoc" value="false" ${hs.dangHoc == "false" ? "checked" : ""}><br>
        Truong:
        <select name="truongHoc">
            <c:forEach items="${listTH}" var="th">
                <option value="${th.id}" label="${th.tenTruong}" ${hs.truongHoc.id == th.id ? "selected" : ""}></option>
            </c:forEach>
        </select>
        <br>
        <button>Submit</button>
    </form>
</body>
</html>
