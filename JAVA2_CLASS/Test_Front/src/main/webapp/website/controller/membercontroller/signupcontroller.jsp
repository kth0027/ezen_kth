<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8"); // 한글 인코딩
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String passwordconfirm = request.getParameter("passwordconfirm");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String address = request.getParameter("address1") + "," + request.getParameter("address2") + ","
			+ request.getParameter("address3") + "," + request.getParameter("address4");
	String phone = request.getParameter("phone");

	// 객체화
	Member member = new Member(id, password, name, email, address, phone);
	// DB처리
	boolean result = MemberDao.getmemberDao().membersignup(member);
	if (result) { // 회원가입 성공
		out.print("회원가입 성공");
		response.sendRedirect("../../view/member/login.jsp");
	} else { // 회원가입 실패
		out.print("회원가입 실패");
		response.sendRedirect("../../view/member/signup.jsp?result=fail");
	}
	%>
</body>
</html>