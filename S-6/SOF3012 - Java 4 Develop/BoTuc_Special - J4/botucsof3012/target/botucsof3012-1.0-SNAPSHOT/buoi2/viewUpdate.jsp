<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 22-Jul-25
  Time: 9:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Update</title>
</head>
<body>
    <h3>Cap nhat Thong tin Nuoc hoa</h3>
    <form action="/buoi2/sua" method="post">
        Id: <input type="text" name="id" value="${nuocHoa.id}"> <br>
        Ten: <input type="text" name="ten" value="${nuocHoa.ten}"> <br>
        So luong: <input type="text" name="soLuong" value="${nuocHoa.soLuong}"> <br>
        Gia: <input type="text" name="gia" value="${nuocHoa.gia}"> <br>
        <br>
        <button>Cap nhat Thong tin</button>
    </form>
</body>
</html>
