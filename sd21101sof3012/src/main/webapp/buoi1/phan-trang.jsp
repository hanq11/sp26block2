<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lovep
  Date: 3/21/2026
  Time: 7:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <thead>
        <tr>
            <th>Id</th>
            <th>Ten</th>
            <th>Tuoi</th>
            <th>Gioi tinh</th>
            <th>Hanh dong</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listSinhVien}" var="sv">
            <tr>
                <td>${sv.id}</td>
                <td>${sv.ten}</td>
                <td>${sv.tuoi}</td>
                <td>${sv.gioiTinh == true ? "Nam" : "Nu"}</td>
                <td>
                    <a href="/sinh-vien/xoa?id=${sv.id}">Xoa</a>
                    <a href="/sinh-vien/view-update?id=${sv.id}">View update</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="/sinh-vien/phan-trang?page=${page - 1}">Prev</a>
    <a href="/sinh-vien/phan-trang?page=${page + 1}">Next</a>
</body>
</html>
