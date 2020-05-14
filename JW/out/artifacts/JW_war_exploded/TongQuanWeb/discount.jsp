<%--
  Created by IntelliJ IDEA.
  User: hodua
  Date: 5/10/2020
  Time: 10:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Discount</title>
</head>
<body>
<form action="/display-discount" method="post">
    <div>
        <h2>Product Description:</h2>
        <input type="text" name="des" size="30" placeholder="Product Description" />
        <h2>List Price:</h2>
        <input type="text" name="price" size="30" placeholder="List Price" />
        <h2>Discount Percent:</h2>
        <input type="text" name="discount" size="30" placeholder="Discount Percent" />
        <input type="submit" value="Calculate Discount"/>
    </div>
</form>
</body>
</html>
