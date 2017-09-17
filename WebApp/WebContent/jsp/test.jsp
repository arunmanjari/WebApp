<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Page</title>
</head>
<body>
<h3>This is a dynamic jsp page</h3>
<%
String msg = "Message fron Java - Hello";
String msg2 = "expression Language";
out.print("<h1><font color='green'>");
out.print(msg);
out.print("</font></h1>");
%>

<h2>
<%=msg2 %>
</h2>
</body>
</html>