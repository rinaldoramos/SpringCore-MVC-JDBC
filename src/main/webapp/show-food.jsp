<%--
  Created by IntelliJ IDEA.
  User: r.ramos
  Date: 3/21/2022
  Time: 6:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Menu</title>
</head>
<body>
    <p>Welcome to <c:out value="${message}"></c:out></p>
    <br>

    <c:forEach var="item" items="${foodItems}">
        ${item.getId()}
        ${item.getItem()}
        ${item.getPrice()}
        <br/>
    </c:forEach>
</body>
</html>
