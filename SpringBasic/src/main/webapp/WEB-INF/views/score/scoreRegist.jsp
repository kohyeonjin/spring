<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>점수 등록</h3>
	<form action="scoreForm" method="post" >
	이름:<input type="text" name="name"><br/>
	국어:<input type="number" name="kor"><br/>
	수학:<input type="number" name="eng"><br/>
	영어:<input type="number" name="math"><br/>
	<input type="submit" value="등록">
	</form>

</body>
</html>