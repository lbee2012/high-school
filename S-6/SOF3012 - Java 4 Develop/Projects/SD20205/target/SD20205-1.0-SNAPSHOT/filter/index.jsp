<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 8/1/2025
  Time: 2:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HelloWorld</title>
</head>
<body>
    Xin chao: ${sessionScope.username} <br>
    Ban dang truy cap voi quyen la: ${sessionScope.role}
    <button><a href="/filter/logout">Logout</a></button>
</body>
</html>
