<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 17/07/2019
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
    <style>
      .myForm input {
        padding: 5px;
        margin: 5px;
      }
    </style>
  </head>
  <body>
  <form action="display-discount" method="post">
    <div class="myForm">
      <label>Product Description: </label><br/>
      <input type="text" name="txtDescription" placeholder="Description" /><br/>
      <label>List Price: </label><br/>
      <input type="text" name="txtPrice" placeholder="Price" /><br/>
      <label>Discount Percent: </label><br/>
      <input type="text" name="txtDiscountPercent" placeholder="(%)" /><br/>
      <input type="submit" value="Calculator Discount">
    </div>
  </form>
  </body>
</html>
