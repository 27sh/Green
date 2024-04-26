<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WriteForm</title>
</head>
<body>
    <h1>Write</h1>
    <hr>
    <div>
        <table width="500" cellpadding="0" cellspacing="0" border="1">
            <form action="write" method="post">
            <tr>
                <td>제목</td>
                <td><input type="text" name="title" size="50"></td>
            </tr>
            <tr>
                <td>내용</td>
                <td><input type="text" name="content" size="50"></td>
            </tr>
            <tr>
                <td>작성자</td>
                <td><input type="text" name="writer" size="50"></td>
            </tr>
            <tr>
                <td>날짜</td>
                <td><input type="date" name="regdate" id="regdate" readonly>
            </tr>
            <tr>
                <td colspan="2"></td>
                    <input type="submit" value="입력">&nbsp;&nbsp;
                    <a href="list">목록보기</a>
                </td>
            </tr>
            </form>
        </table>
    </div>
        
    <script>
        document.getElementById('regdate').value = new Date().toISOString().substring(0, 10);;
    </script>
</body>
</html>
