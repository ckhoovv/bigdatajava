<%@page import="java.sql.*"%>
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
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String name = request.getParameter("name");
			String tel = request.getParameter("tel");
			
			Class.forName("com.mysql.jdbc.Driver");
			out.print("드라이버 설정 ok..");
			String url = "jdbc:mysql://localhost:3306/bigdata";
			String user = "root";
			String password = "1234";
			try{
			Connection con = DriverManager.getConnection(url, user, password);
			String sql = "insert into member values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);
			ps.executeUpdate();
			
			ps.close();
			con.close();
			}
			catch(SQLException e){
				out.print(e);
			}
		%>
	</body>
</html>