<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 8/15/2025
  Time: 1:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="jquery3.js"></script>
    <script>
        function getData() {
            $.ajax({
                url: "/api/nha-san-xuat/get-all",
                type: "get",
                dataType: "json",
                success: function(response) {
                    console.log(response);
                    let html = '';
                    response.forEach(function (nsx) {
                       html += nsx.maNSX + ' - ' + nsx.tenNSX + ' - ' + nsx.diaChi;
                    });
                    document.getElementById("data").innerHTML = html;
                },
                error: function() {
                    console.log("error brother")
                }
            })
        }
    </script>
</head>
<body>

</body>
</html>
