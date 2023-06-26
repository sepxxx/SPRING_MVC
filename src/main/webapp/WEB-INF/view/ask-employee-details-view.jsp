<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: jeraldin
  Date: 6/25/23
  Time: 3:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h2>DEAR EMPLOYEE PLEASE ENTER YOUR DETAILS</h2>
  <br>
  <br>
<form:form action="showEmployeeDetails" modelAttribute="employee" >
  NAME <form:input path="name"/>
  SURNAME <form:input path="surname"/>
  SALARY <form:input path="salary"/>
  <input type="submit" value="SEND INFO">
</form:form>

</body>
</html>
