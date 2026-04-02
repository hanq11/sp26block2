<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lovep
  Date: 4/2/2026
  Time: 6:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Sua giang vien:
    <form action="/giang-vien/sua" method="post">
        Id: <input type="text" name="id" value="${giangVien.id}"> <br>
        Ten giang vien: <input type="text" name="tenGiangVien" value="${giangVien.tenGiangVien}"> <br>
        Tuoi: <input type="text" name="tuoi" value="${giangVien.tuoi}"> <br>
        Gioi tinh: Nam <input type="radio" name="gioiTinh" value="true" ${giangVien.gioiTinh == true ? "checked" : ""}>
        Nu <input type="radio" name="gioiTinh" value="false" ${giangVien.gioiTinh == false ? "checked" : ""}> <br>
        Truong hoc:
        <select name="truongId">
            <c:forEach items="${listTruongHoc}" var="th">
                <option value="${th.id}" label="${th.tenTruong}" ${giangVien.truongHoc.id == th.id ? "selected" : ""}></option>
            </c:forEach>
        </select>
        <br>
        <button>Save</button>
    </form>
</body>
</html>
