<title></title>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%

		Connection connection = null;
		try{
		
		
				Class.forName("com.mysql.jdbc.Driver");
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bug_prediction","root","password");
		
		
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
%>
