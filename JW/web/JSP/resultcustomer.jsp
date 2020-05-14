<%--
  Created by IntelliJ IDEA.
  User: hodua
  Date: 5/11/2020
  Time: 4:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="text-align: center"><c:out value="Danh sách khách hàng"></c:out></h1>
<table width="100%">
    <tr>
        <th style="text-align: center"><c:out value="Tên"></c:out></th>
        <th style="text-align: center"><c:out value="Ngày Sinh"></c:out></th>
        <th style="text-align: center"><c:out value="Địa chỉ"></c:out></th>
        <th style="text-align: center"><c:out value="Ảnh"></c:out></th>
    </tr>
    <c:forEach var="khachhang" items="${danhSachkhachhang}">
        <tr>
            <td style="text-align: center"><c:out value="${khachhang.getHoTen()}"/></td>
            <td style="text-align: center"><c:out value="${khachhang.getNgaySinh()}"/> </td>
            <td style="text-align: center"><c:out value="${khachhang.getDiaChi()}"/></td>
            <td style="text-align: center"><img src="<c:out value="${khachhang.getAnh()}"/>" style="width:50px;height:50px;"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
