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
			String travel = request.getParameter("travel");
			String count = request.getParameter("count");
			int n1 = Integer.parseInt(count);
			if(n1 < 3){
				out.print(travel + "을 더 갈수도 있군요");
			}else{
				out.print(travel + "을 더 갈수없습니다.");
				
			}
		%>
	</body>
</html>