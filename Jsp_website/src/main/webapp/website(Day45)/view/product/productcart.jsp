<%@page import="dto.Cart"%>
<%@page import="dto.Login"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file ="../header.jsp" %>
	<%
	String sname = "cart"+ login.getM_id();
	ArrayList<Cart> carts = (ArrayList<Cart>)session.getAttribute(sname);
	
/* 	out.print( carts.get(0).getP_num() );
	out.print( carts.get(0).getP_size() );
	out.print( carts.get(0).getP_count() ); */
	
	%>
	
	<div class="container">
		<table class="table">
			<%for( Cart cart : carts){ %>
			<tr>
				<td><%=cart.getP_num() %></td>
				<td><%=cart.getP_size() %></td>
				<td><%=cart.getP_count() %></td>
			</tr>
			<%} %>
		</table>
	</div>
</body>
</html>