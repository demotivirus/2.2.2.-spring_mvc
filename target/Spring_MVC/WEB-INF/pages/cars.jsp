<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html;charset=cp1251"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${cars_table_name}</h1>
<c:forEach var="car" items="${cars}">
    <h2>${car}</h2>
</c:forEach>

</body>
</html>
