<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
		<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>
		</head>
	<body>
		<jsp:useBean id="dto" class="bean.BbsDTO"></jsp:useBean>
		<jsp:setProperty property="*" name="dto"/>
		<hr color="red">
		id: <%= dto.getId() %>
		title: <%= dto.getTitle() %>
		content: <%= dto.getContent() %>
		writer: <%= dto.getWriter() %>
	</body>
</html>