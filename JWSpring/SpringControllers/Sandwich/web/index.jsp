<%--
  Created by IntelliJ IDEA.
  User: hodua
  Date: 5/15/2020
  Time: 8:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Sandwich Condiments</h1>

  <form action="/save">
    <input type="checkbox" id="vehicle1" name="condiment" value="Lettuce" size="100px">
    <label for="vehicle1" size="100px"> Lettuce</label><br>
    <input type="checkbox" id="vehicle2" name="condiment" value="Tomato" size="100px">
    <label for="vehicle2" size="100px"> Tomato</label><br>
    <input type="checkbox" id="vehicle3" name="condiment" value="Mustard" size="100px">
    <label for="vehicle3" size="100px"> Mustard</label><br>
    <input type="checkbox" id="vehicle4" name="condiment" value="Sprouts" size="100px">
    <label for="vehicle4" size="100px"> Sprouts</label><br><br>
    <input type="submit" value="Save">
  </form>
  </body>
</html>
