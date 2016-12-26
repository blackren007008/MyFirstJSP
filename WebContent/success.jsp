<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	hello, <%= request.getParameter("username")%>, 
	Congratulations! You are the <%=((Map)application.getAttribute("allUsers")).size() %>  user..
	[<a href="login.jsp">LogOut<a/>]
	
	<%
// 	    out.println("<br>");
// 	    out.println("================================================");
// 	    out.println("<br>");
// 	    out.println("Online users: ");
// 		List onlineUserList = (List)application.getAttribute("onlineUserList");
// 		for(int i=0; i<onlineUserList.size(); i++) {
// 			String onlineUserName = (String)onlineUserList.get(i);
// 			out.println("<br>");
// 			out.println(onlineUserName);;
// 		}
	%>
	
	
</body>
</html>