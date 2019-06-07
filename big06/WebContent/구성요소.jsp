<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
		<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>
		</head>
	<body>
		<!-- 선언문 -->
		<%! 
			String name; //전역변수
			public String test(){
				return 1000 + "원";
			}
		%>
		<!-- 스크립트릿 -->
		<%
			/* PrintWriter out = new PrintWriter(); */
			String test = ""; //지역변수 
			out.print(100 + 200 + "<br>");
		%>
		<!-- 표현식(Expression -->
		<%= 100 + 200 %><br>
		<%= name %>, <%= test %><br>
		<%= test() %>
	</body>
</html>