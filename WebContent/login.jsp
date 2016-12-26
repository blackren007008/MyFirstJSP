<!-- %@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%-->
    
 <%@ page language="java" contentType="text/html; charset=utf-8"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LogIn</title>
</head>
<body>
    <% 
       String errorMsg = (String)request.getAttribute("errorMsg");
       if (errorMsg != null) {
    	   out.println(errorMsg);
       }else {
    	   out.println();
       }
    %>
	<form action="LoginServlet" method="post">
		用户名: <input type="text" name="username"/>
		<br/>
		密码:      <input type="password" name="password">
		<br/>
		<input type="submit" value="提交"/> 
		
		<input type="button" value = "立即注册" onclick="location.href='register.jsp'">
	</form>
	

</body>
</html>