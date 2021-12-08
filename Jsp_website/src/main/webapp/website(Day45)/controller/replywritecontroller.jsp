<%@page import="dao.BoardDao"%>
<%@page import="dto.Login"%>
<%@page import="javax.imageio.event.IIOReadProgressListener"%>
<%@page import="dao.ReplyDao"%>
<%@page import="dto.Reply"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<%-- <%
request.setCharacterEncoding("utf-8"); // 한글 인코딩
String b_num = request.getParameter("b_num");

//로그인 정보
Login login = (Login) session.getAttribute("login");
int m_num = login.getM_num();

//String contents = request.getParameter("replycontents");
//String rdate = request.getParameter("rdate");

// 태그방지
//contents = contents.replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br>");


/* // 객채화
Reply reply = new Reply( contents, m_num, b_num );

// DB처리
//ReplyDao.getreplydao().replywrite(reply);
//ReplyDao.getreplydao().replywrite(reply);

boolean result = BoardDao.getbo
%> --%>

<%
request.setCharacterEncoding("utf-8"); // 한글 인코딩
String contents = request.getParameter("r_contents");

int b_bum = Integer.parseInt(request.getParameter("b_num"));
// 로그인된 회원의 번호
Login login = (Login) session.getAttribute("login");
int m_num = login.getM_num();

// 객체화 
Reply reply = new Reply(contents, m_num, b_bum);

// db처리
boolean result = BoardDao.getboarddao().replywrite(reply);
if (result) {// 결과
	out.print("<script>alert('댓글 등록 되었습니다.');</script>");
	out.println("<script>location.href='../view/board/boardview.jsp?b_num=" + b_bum + "';</script>");
} else {
	out.print("<script>alert('댓글 등록 오류[관리자에게문의].');</script>");
	out.println("<script>location.href='../view/board/boardview.jsp?b_num=" + b_bum + "';</script>");
}
%>