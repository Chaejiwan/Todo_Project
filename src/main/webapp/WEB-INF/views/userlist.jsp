<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC TEMPLATE</title>
</head>
<body>
	<c:forEach var ="n" items="${users}">
		${n.id}
		${n.name}<br>
	</c:forEach>
</body>
</html>