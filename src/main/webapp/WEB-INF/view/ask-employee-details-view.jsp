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
  <form:errors path="name"/>
  <br><br>
  SURNAME <form:input path="surname"/>
  <form:errors path="surname"/>
  <br><br>
  SALARY <form:input path="salary"/>
  <br><br>
  DEPARTMENT <form:select path="department" >
  <form:options items="${employee.departmentsMap}"/>
  </form:select>
  <br><br>
  CHOOSE CAR:
  <br><br>
  BMW <form:radiobutton path="carBrand" value="BMW"/>
  RENAULT <form:radiobutton path="carBrand" value="RENAULT"/>
  FIAT <form:radiobutton path="carBrand" value="FIAT"/>
  <br><br>
  CHOOSE LANGUAGES
  <br><br>
  EN <form:checkbox path="languages" value="ENGLISH"/>
  DE <form:checkbox path="languages" value="DEUTCH"/>
  FR <form:checkbox path="languages" value="FRENCH"/>
  <br><br>
  EMAIL <form:input path="email"/> <form:errors path="email"/>
  <br><br>

  <input type="submit" value="SEND INFO">

</form:form>

</body>
</html>
