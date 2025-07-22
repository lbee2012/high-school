<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Chuột Béo</title>
</head>
<body>
    Them thong tin:
    <br>
    <form action="/chuot-gaming/them" method="post">
        Ten: <input type="text" name="ten"> <br>
        Mat doc: <input type="text" name="matDoc"> <br>
        Gia: <input type="text" name="gia"> <br>
        <button>Save</button>
    </form>
    <br>
    <form action="/chuot-gaming/tim-kiem">
        Ten: <input type="text" name="ten">
        <button>Tim kiem</button>
    </form>
    <br>
    <button><a href="/chuot-gaming/sap-xep">Sap xep theo Nam sinh</a></button>
    <br>
    Bang thong tin
    <table>
        <thead>
        <tr>
            <th>Id</th>
            <th>Ten</th>
            <th>Mat doc</th>
            <th>Gia</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${danhSach}" var="sv">
            <tr>
                <td>${sv.id}</td>
                <td>${sv.ten}</td>
                <td>${sv.matDoc}</td>
                <td>${sv.gia}</td>
                <td>
                    <a href="/chuot-gaming/xem-chinh-sua?id=${sv.id}">Chinh sua</a>
                    <a href="/chuot-gaming/xoa?id=${sv.id}">Xoa</a>
                    <a href="/chuot-gaming/xem-chi-tiet?id=${sv.id}">Chi tiet</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="/chuot-gaming/phan-trang?page=${page - 1}">Prev</a>
    <a href="/chuot-gaming/phan-trang?page=${page + 1}">Next</a>
<body/>
</html>