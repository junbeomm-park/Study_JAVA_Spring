<%@page import="multi.erp.emp.EmpVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
 	  <% 
 			 EmpVO user =  (EmpVO) request.getAttribute("loginOkUser");
				
	 %>
	  
			<h1>mypage</h1>
			<h3><%= user.getName() %></h3>
 	
			<!-- ------------- -->
			<!--  db에서 조회한 로그인 사용자의 성명 -->
	</body>
</html>