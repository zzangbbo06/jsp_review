<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메세지 확인</title>
</head>
<body>
	<%
    	String message = (String)request.getAttribute("msg");
    %>
	<h1>메시지</h1>
	<p><%= message %></p>
</body>
</html>