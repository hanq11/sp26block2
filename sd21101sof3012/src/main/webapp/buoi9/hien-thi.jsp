<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lovep
  Date: 3/28/2026
  Time: 7:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Bang thong tin:
    <table>
        <thead>
        <tr>
            <th>Id</th>
            <th>Ten giang vien</th>
            <th>Tuoi</th>
            <th>Gioi tinh</th>
            <th>Ten truong</th>
            <th>Dia chi</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listGiangVien}" var="gv">
            <tr>
                <td>${gv.id}</td>
                <td>${gv.tenGiangVien}</td>
                <td>${gv.tuoi}</td>
                <td>${gv.gioiTinh}</td>
                <td>${gv.truongHoc.tenTruong}</td>
                <td>${gv.truongHoc.diaChi}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
