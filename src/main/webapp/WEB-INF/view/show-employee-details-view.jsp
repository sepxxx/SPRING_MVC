

<%--
  Created by IntelliJ IDEA.
  User: jeraldin
  Date: 6/25/23
  Time: 3:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h2>NICE TO MEET YOU</h2>
    <br>
    <br>
    NAME: ${employee.name}
    <br>
    <br>
    SURNAME: ${employee.surname}
    <br>
    <br>
    SALARY: ${employee.salary}
    <br><br>
    DEPARTMENT: ${employee.department}
    <br><br>
    CAR BRAND: ${employee.carBrand}
    <br><br>
    LANGUAGES:
    <ul>
        <c:forEach var="lang" items="${employee.languages}">
            <li>${lang}</li>
        </c:forEach>
    </ul>
</body>
</html>
