<%@page import="java.util.Set"%>
<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="dto.Login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String folderpath = request.getSession().getServletContext().getRealPath("website(Day45)/upload");

MultipartRequest multi = new MultipartRequest(request, folderpath, 1024 * 1024 * 10, "UTF-8",
		new DefaultFileRenamePolicy());

request.setCharacterEncoding("utf-8"); // 요청시[request] 한글 인코딩

String title = multi.getParameter("title");

String contents = multi.getParameter("contents");

contents = contents.replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br>");

title = title.replaceAll("<(/)?([a-zA-Z]*)(\\s[a-zA-Z]*=[^>]*)?(\\S)*(/)?", "");

String file1 = multi.getFilesystemName("file1"); // type : file
String file2 = multi.getFilesystemName("file2"); // type : file

if (file1 == null) { // 새로운 첨부가 없을경우 기존 첨부를 DB 저장
	file1 = multi.getFilesystemName("oldfile1"); // type : hidden
}

if (file2 == null) { // 새로운 첨부가 없을경우 기존 첨부를 DB 저장
	file2 = multi.getFilesystemName("oldfile2"); // type : hidden
}

int b_num = Integer.parseInt(multi.getParameter("b_num"));

Board board = new Board(b_num, title, contents, file1, file2);

boolean result = BoardDao.getboarddao().boardupdate(board); // DB처리
if (result) {
	out.print("<script>alert('수정 되었습니다.');</script>");
	out.println("<script>location.href='../view/board/boardview.jsp?b_num=" + b_num + "';</script>");
} else {
}
%>
