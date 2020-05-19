<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create student</title>
</head>
<body>

<form:form action="/create" method="post" modelAttribute="studentAbc" >
    <form:input path="name" />
    <form:input path="dateOfBirth" />
    <form:button>Create</form:button>
</form:form>

</body>
</html>
