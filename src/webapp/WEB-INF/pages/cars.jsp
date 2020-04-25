<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
