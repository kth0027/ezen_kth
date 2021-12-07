<%@page import="javax.imageio.event.IIOReadProgressListener"%>
<%@page import="dao.ReplyDao"%>
<%@page import="dto.Reply"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%

request.setCharacterEncoding("utf-8"); // 한글 인코딩
String m_id = request.getParameter("m_id");
String contents = request.getParameter("replycontents");
String rdate = request.getParameter("rdate");

// 태그방지
contents = contents.replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br>");


/* // 객채화
Reply reply = new Reply( r_num, r_contents, r_date, m_num, b_num);

// DB처리
//ReplyDao.getreplydao().replywrite(reply);
ReplyDao.getreplydao().replywrite(reply); */






%>