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
    <div>
        <table width="500" cellpadiing="0" cellspacing="0" border="1">
            <tr>
                <td>번호</td><td>작성자</td><td>제목</td><td>삭제</td>
            </tr>
            <c:forEach var="dto" items="${list}">
                <tr>
                    <td>${dto.id}</td>
                    <td>${dto.writer}</td>
                    <td>${dto.title}</td>
                    <td><a href="delete?id=${dto.id}</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <p><a href="writerForm">글 작성</a><p>
</body>
</html>
