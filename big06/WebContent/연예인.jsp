<%@page import="bean.FamousDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
		<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>
		</head>
	<body>
		<jsp:useBean id="dto" class="bean.FamousDTO"></jsp:useBean>
		<jsp:setProperty property="*" name="dto"/>
		<%
		FamousDAO dao = new FamousDAO();
		dao.insert(dto);
		
		%>
	</body>
</html>