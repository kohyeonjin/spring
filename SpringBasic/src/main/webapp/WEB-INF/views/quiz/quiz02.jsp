<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
	이 화면에 진입할 때 List[MemberVO, MemberVO, MemberVO] 형태의 데이터를 출력해주세요.
	데이터는 가짜로 생성하면 됩니다.
	a링크를 하나 만들고 회원정보를 클릭하면 회원정보화면으로 회원아이디를 넘겨주세요
	 --%>
	<h2>목록</h2>
	
	<c:forEach var="i" items="${list }">
				<a href="quiz02_info?id=${i.id }">
				${i}<br/>
				</a>
	</c:forEach>
	

	
	
</body>
</html>