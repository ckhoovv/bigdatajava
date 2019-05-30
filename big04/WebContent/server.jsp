<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
		<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>
			<link rel="stylesheet" type="text/css" href="style1.css">
		</head>
	<body>
		<table border="1" bordercolor="green">
			<tr>
				<td class="t1" colspan="2">회원가입 입력정보</td>
			</tr>
			<tr>
				<td class="t1">아이디</td>
				<td class="t2">${param.id}</td>			
			</tr>
			<tr>
				<td class="t1">패스워드</td>
				<td class="t2">${param.pw}</td>			
			</tr>
			<tr>
				<td class="t1">이름</td>
				<td class="t2">${param.name}</td>			
			</tr>
			<tr>
				<td class="t1">전화번호</td>
				<td class="t2">${param.tel}</td>			
			</tr>
		</table>
		<div id="d1">
			<ul>
				<li>${param.id}</li>
				<li>${param.pw}</li>
				<li>${param.name}</li>
				<li>${param.tel}</li>
			</ul>
		</div>
	</body>
</html>