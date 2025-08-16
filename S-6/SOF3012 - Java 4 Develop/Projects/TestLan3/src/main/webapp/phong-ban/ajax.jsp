<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 8/15/2025
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajax</title>
    <script type="text/javascript" src="jquery.js"></script>
    <script>
        function getData() {
            $.ajax({
                url: '/api/cay-coi/hien-thi',
                type: 'get',
                dataType: 'json',
                success: function (response) {
                    console.log(response);
                    document.getElementById("data").innerText = response.ma + ' - ' + response.ten + ' - ' + response.tuoi + ' - ' + response.gioiTinh + ' - ' + response.canNang
                },
                error: function() {
                    console.log("Khong the lay thong tin cua CayCoi cc")
                }
            })
        }
    </script>
</head>
<body>
    <h1>Ajax</h1>
    <button onclick="getData()">Get data</button>
    <div id="data"></div>
</body>
</html>
