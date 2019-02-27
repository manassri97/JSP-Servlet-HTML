<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<%! int a,b,c; %>
<%
a = Integer.parseInt(request.getParameter("number1"));
b = Integer.parseInt(request.getParameter("number2"));
c = Integer.parseInt(request.getParameter("operation"));
if(c==1)
{
	c=a+b;
	out.println(c);
}
if(c==2)
{
	c=Math.abs(a-b);
	out.println(c);
}
if(c==3)
{
	c=a*b;
	out.println(c);
}%>
<%@ page errorPage="myerrorpage.jsp" %>
<% 
if(c==4)
{
	c=a/b;
	out.println(c);
} %>
</body>
</html>