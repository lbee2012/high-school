<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 22-Jul-25
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Updating</title>
</head>
<body>
    <h3>Form Update MT:</h3>
    <form action="/buoi4/update" method="post">
        ID: <input type="text" name="id" value="${mt.id}"><br>
        Hang: <input type="text" name="hang" value="${mt.hang}"><br>
        Ton kho: <input type="text" name="tonKho" value="${mt.tonKho}"><br>
        Bo nho: <input type="text" name="boNho" value="${mt.boNho}"><br>
        <br>
        <button>Update</button>
    </form>
</body>
</html>
