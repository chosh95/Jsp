<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<!-- 주석태그 -->
	<%-- JSP 주석태그 --%>

	<%@ include file = "header.jsp" %>

	<!-- 선언 태그 -->
	<%!
		int num = 10;
		String str= "jsP";
		public void method(){
			System.out.println(num);
		}
	%>
	
	
	<!-- 스크립트릿 태그 -->
	<%
	if(num>0) {
	%>
	<p> num > 0 </p>
	<%
	} else{
	%>
	<p> num <= 0 </p>
	<%
	}
	%>
	
	<!-- 표현식 태그 -->
	num is <%= num %>
	
	<%@ include file = "footer.jsp" %>
</body>
</html>