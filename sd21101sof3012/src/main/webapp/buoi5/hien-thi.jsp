<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lovep
  Date: 3/19/2026
  Time: 7:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Them san pham:
    <form action="/san-pham/them" method="post">
        Name: <input type="text" name="name"> <br>
        Price: <input type="text" name="price"> <br>
        Active:
            Active <input type="radio" name="active" value="true">
            Inactive <input type="radio" name="active" value="false">
        <br>
        <button>Save</button>
    </form>
    <br>
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Price</th>
                <th>Active</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listSanPham}" var="sp">
                <tr>
                    <td>${sp.id}</td>
                    <td>${sp.name}</td>
                    <td>${sp.price}</td>
                    <td>${sp.active == "true" ? "Active" : "Inactive"}</td>
                    <td>
                        <a href="/san-pham/view-update?id=${sp.id}">View update</a>
                        <a href="/san-pham/xoa?id=${sp.id}">Xoa</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
