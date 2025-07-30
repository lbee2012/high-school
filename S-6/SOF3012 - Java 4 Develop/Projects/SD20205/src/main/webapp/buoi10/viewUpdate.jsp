<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 7/28/2025
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
    <h3>Form update BH</h3>
    <form action="/buoi10/update" method="post">
        ID: <input type="text" name="id" value="${bh.id}"><br>
        Ten bai hat: <input type="text" name="tenBaiHat" value="${bh.tenBaiHat}"><br>
        Thoi luong: <input type="text" name="thoiLuong" value="${bh.thoiLuong}"><br>
        Phat hanh:
        Roi <input type="radio" name="phatHanhChua" value="true" ${bh.phatHanhChua == "true" ? "checked" : ""}>
        Chua <input type="radio" name="phatHanhChua" value="false" ${bh.phatHanhChua == "true" ? "checked" : ""}><br>
        Ten ca si:
        <select name="caSi">
            <c:forEach items="${listCS}" var="cs">
                <option value="${cs.id}" label="${cs.tenCaSi}" ${bh.caSi.id == cs.id ? "selected" : ""}></option>
            </c:forEach>
        </select>
        <br>
        <button>Submit</button>
    </form>
    <br>

</body>
</html>
