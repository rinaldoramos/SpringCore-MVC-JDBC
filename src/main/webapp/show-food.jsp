<%--
  Created by IntelliJ IDEA.
  User: r.ramos
  Date: 3/21/2022
  Time: 6:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Menu</title>
</head>
<body>

    <h1>Welcome message : <c:out value="${message}"></c:out></h1>

    <c:forEach var="item" items="${foodItems}">
        ${item}
    </c:forEach>
</body>
</html>
