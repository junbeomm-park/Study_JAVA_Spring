<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>스프링에서 공유해준데이터(jsp코드로 출력하기)<%= request.getAttribute("result") %> </h2>
		<h2>EL(expression language):${result }</h2>
	</body>
</html>