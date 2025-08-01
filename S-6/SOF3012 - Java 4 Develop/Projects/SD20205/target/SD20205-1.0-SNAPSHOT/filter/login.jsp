<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 8/1/2025
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h1>Login</h1>
    <form action="/filter/login" method="post">
        username: <input type="text" name="username"> <br>
        password: <input type="text" name="password"> <br>
        <button>Submit</button>
    </form>
</body>
</html>
