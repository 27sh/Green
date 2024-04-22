<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
<h1>Regist_Form</h1>
<hr>
<form action="regist.do" method="post">
	<input type="text" name="title" placeholder="Input title..."><br>
	<input type="text" name="context" placeholder="Input context..."><br>
	<input type="text" name="writer" value="${id }"><br>
	<input type="submit" value="regist"><br>
</form>
</body>
</html>