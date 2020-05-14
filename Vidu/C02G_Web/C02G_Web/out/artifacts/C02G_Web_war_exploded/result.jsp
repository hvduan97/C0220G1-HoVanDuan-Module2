<%--
  Created by IntelliJ IDEA.
  User: pato2
  Date: 05/08/20
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
    <%
        String name = request.getParameter("tenHocVien");
    %>
</head>
<body>
    <h1>Tên học viên: </h1>
    <h2><%=name%></h2>
    <%

        if (name.equals("Toan")) {
    %>
     <h3>Xin chào</h3>
    <%
        } else {
    %>
    <h3>Chào mừng bạn đến với CodeGym</h3>
    <%
        }
    %>
</body>
</html>
