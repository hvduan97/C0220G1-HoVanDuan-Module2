<%--
  Created by IntelliJ IDEA.
  User: hodua
  Date: 5/15/2020
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
    <script>
      function calculate(operator) {
        document.getElementById("operatorCharacter").value = operator;
        document.getElementById("formCal").submit();
      }
      function calculate1(operator) {
        document.getElementById("operatorCharacter").value = operator;
        document.getElementById("formCal").submit();
      }
      function calculate2(operator) {
        document.getElementById("operatorCharacter").value = operator;
        document.getElementById("formCal").submit();
      }
      function calculate3(operator) {
        document.getElementById("operatorCharacter").value = operator;
        document.getElementById("formCal").submit();
      }
    </script>
  </head>
  <body>
  <h1>Calculator</h1>

  <form id="formCal" action="/calculator">
    <input type="text" name="number1" placeholder="First Number">
    <input type="text" name="number2" placeholder="Second Number"></br></br>
    <input id="operatorCharacter" type="hidden" name="operator">
    <input type="button" value="Addtion(+)" onclick="calculate('+')">
    <input type="button" value="Subtraction(-)" onclick="calculate1('-')">
    <input type="button" value="Multiplication(*)" onclick="calculate2('*')">
    <input type="button" value="Division(/)" onclick="calculate3('/')">
  </form>
  </body>
</html>
