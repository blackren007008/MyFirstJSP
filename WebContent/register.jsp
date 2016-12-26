<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>用户注册</title>
</head>
<body>
           填写用户注册信息:<br>
    <form action="RigsterServlet" method="post">
	           用户名:<input type="text" name="username"/><br/>
		密码 :<input type="password" name="password"><br/>
		性别: <td>
	              <input type="radio" name="sex" value="男" checked="checked">男
	              <input type="radio" name="sex" value="女">女
	         </td><br>
		电话:<input type="text" name="tel"/><br/>
		地址:<input type="text" name="address"/><br/>
		邮箱:<input type="text" name="email"/><br/>
	<input type="submit" value="提交"/>  <input type="reset" value = "重置">
	</form>
</body>
</html>