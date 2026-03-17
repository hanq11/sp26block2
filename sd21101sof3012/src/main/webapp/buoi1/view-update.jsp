<%--
  Created by IntelliJ IDEA.
  User: lovep
  Date: 3/17/2026
  Time: 7:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Update
    <form action="/sinh-vien/sua" method="post">
        Id: <input type="text" name="id" value="${sinhVien.id}"> <br>
        Ten: <input type="text" name="ten" value="${sinhVien.ten}"> <br>
        Tuoi: <input type="text" name="tuoi" value="${sinhVien.tuoi}"> <br>
        Gioi tinh: Nam <input type="radio" name="gioiTinh" value="true" ${sinhVien.gioiTinh == true ? "checked" : ""}>
        Nu <input type="radio" name="gioiTinh" value="false" ${sinhVien.gioiTinh == false ? "checked" : ""}>
        <br>
        <button>Submit</button>
    </form>
</body>
</html>
