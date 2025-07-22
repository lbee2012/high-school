<%--
  Created by IntelliJ IDEA.
  User: lovep
  Date: 7/14/2025
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Sua thong tin: <br>
    <form action="/sinh-vien/update" method="post">
        Id: <input type="text" name="id" value="${sinhVien.id}"> <br>
        Ten: <input type="text" name="ten" value="${sinhVien.ten}"> <br>
        Dia chi: <input type="text" name="diaChi" value="${sinhVien.diaChi}"> <br>
        Nam sinh: <input type="text" name="namSinh" value="${sinhVien.namSinh}"> <br>
        <button>Save</button>
    </form>
</body>
</html>
