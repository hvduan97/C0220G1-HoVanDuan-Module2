<%--
  Created by IntelliJ IDEA.
  User: hodua
  Date: 5/15/2020
  Time: 9:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h1><c:forEach items="${abc}" var="result">${result}</br></c:forEach></h1>
</body>
</html>
