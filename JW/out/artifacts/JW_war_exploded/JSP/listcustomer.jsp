<%--
  Created by IntelliJ IDEA.
  User: hodua
  Date: 5/11/2020
  Time: 3:22 PM
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
        <th><c:out value="Tên"></c:out></th>
        <th><c:out value="Ngày Sinh"></c:out></th>
        <th><c:out value="Địa chỉ"></c:out></th>
        <th><c:out value="Ảnh"></c:out></th>
    </tr>
    <tr>
        <th><c:out value="Mai Văn Hoàn"></c:out></th>
        <th><c:out value="1983-08-20"></c:out></th>
        <th><c:out value="Hà Nội"></c:out></th>
        <th><img src="image/a.jpg" style="width:50px;height:50px;"></th>
    </tr>
    <tr>
        <th><c:out value="Nguyễn Văn A"></c:out></th>
        <th><c:out value="1997-08-30"></c:out></th>
        <th><c:out value="Đà Nẵng"></c:out></th>
        <th><img src="image/0.jpg" style="width:50px;height:50px;"></th>
    </tr>
</table>
</body>
</html>
