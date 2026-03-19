<%--
  Created by IntelliJ IDEA.
  User: lovep
  Date: 3/19/2026
  Time: 8:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Sua san pham:
    <form action="/san-pham/sua" method="post">
        Id: <input type="text" name="id" value="${sanPham.id}"> <br>
        Name: <input type="text" name="name" value="${sanPham.name}"> <br>
        Price: <input type="text" name="price" value="${sanPham.price}"> <br>
        Active:
        Active <input type="radio" name="active" value="true" ${sanPham.active == true ? "checked" : ""}>
        Inactive <input type="radio" name="active" value="false" ${sanPham.active == false ? "checked" : ""}>
        <br>
        <button>Save</button>
    </form>
</body>
</html>
