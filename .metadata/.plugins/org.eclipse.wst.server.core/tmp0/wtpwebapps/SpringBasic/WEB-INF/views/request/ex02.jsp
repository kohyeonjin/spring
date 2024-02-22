<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>ex02화면</h3>

<form action="param" method="post">
	아이디:<input type="text" name="id"><br/>
	이름:<input type="text" name="name"><br/>
	나이:<input type="text" name="age"><br/>
	관심분야:
	<input type="checkbox" name="inter" value="자바">자바
	<input type="checkbox" name="inter" value="스프링">스프링
	<input type="checkbox" name="inter" value="데이터베이스">데이터베이스
	
	<input type="submit" value="확인">
</form>

</body>
</html>