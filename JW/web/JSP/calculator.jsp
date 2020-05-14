<%--
  Created by IntelliJ IDEA.
  User: hodua
  Date: 5/11/2020
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/calculate" method="post">
    <h1>Calculator</h1>
    <label for="fo">First Operand</label>
    <input type="text" name="fo" size="30" id="fo" placeholder="First Operand" />
    <label for="duanid">Operator</label>
    <select name="duan" id="duanid">
        <option value="add">Add</option>
        <option value="sub">Sub</option>
        <option value="multi">Multi</option>
        <option value="divive">Divive</option>
    </select>
    <label for="so">Second Operand</label>
    <input type="text" name="so" size="30" id="so" placeholder="Second Operand" />
    <input type="submit" id="submit" value="Calculate" />

</form>
</body>
</html>
