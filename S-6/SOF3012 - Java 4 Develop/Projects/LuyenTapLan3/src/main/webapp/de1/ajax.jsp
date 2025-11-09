<%--
  Created by IntelliJ IDEA.
  User: lbee
  Date: 8/14/2025
  Time: 5:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="jquery.js"></script>
    <script>
        function getData() {
            $.ajax({
                url: "/api/mon-hoc/get-all",
                type: "get",
                dataType: "json",
                success: function (response) {
                    console.log(response)
                    let resultHtml = ""
                    // Loop through each item in the response array
                    response.forEach(function(monHoc) {
                        resultHtml += monHoc.maMH + '-' + monHoc.tenMH + '-' + monHoc.soTinChi + '<br>'
                    })
                    document.getElementById("data").innerHTML = resultHtml
                },
                error: function () {
                    console.log("error bro")
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
