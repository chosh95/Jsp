<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
		<%!
			String m_name;
			String m_pass;
		%>
		
		<%
			m_name = request.getParameter("m_name");
			m_pass = request.getParameter("m_pass");
		%>
		
		m_name = <%= m_name %><br>
		m_pass = <%= m_pass %><br>
	</body>
</html>