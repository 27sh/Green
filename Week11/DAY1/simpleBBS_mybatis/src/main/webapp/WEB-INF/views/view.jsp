<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
    <h1>내용 보기</h1>
    <hr>
    작성자 : ${dto.writer}<br>
    제목 : ${dto.title}<br>
    내용 : ${dto.content}<br>
    <hr>
    <p>
        <a href="list">목록보기</a>
    <p>
    
</body>
</html>
