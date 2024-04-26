<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
</head>
<body>
    <h1>List Page</h1>
    <hr>
    <c:forEach var="dto" items="${list}">
        ${dto.bno} - ${dto.title}, ${dto.writer}, ${dto.regdate} : ${dto.content} <br>
    </c:forEach>
</body>
</html>
