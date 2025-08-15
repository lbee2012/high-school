<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 8/15/2025
  Time: 7:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="jquery1.js"></script>
    <script>
        function getData() {
            $.ajax({
                url: "/api/giao-dich/get-all",
                type: "get",
                dataType: "json",
                success: function(response) {
                    console.log(response);

                    let result = "";
                    response.forEach(function (gd) {
                        result += gd.ngayGiaoDich + ' - ' + gd.giaTri + ' - ' + gd.nhaID + '<br>';
                    })

                    document.getElementById("data").innerHTML = result;
                },
                error: function() {
                    console.log("yo you've encountered an error, idk brother, cry about it")
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
