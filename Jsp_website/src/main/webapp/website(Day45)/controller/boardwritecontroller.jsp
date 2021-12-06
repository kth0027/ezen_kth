<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.mysql.cj.protocol.a.MultiPacketReader"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="dto.Login"%>
<%@page import="org.apache.catalina.ant.jmx.JMXAccessorQueryTask"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
// 서버로 파일 업로드
// 1. form [ enctype = "multipart/form-data"]
// 2. cos.jar 추가
// 3. MultipartRequest 객체명 = new MultipartRequest(); 
// 1. "요청방식: request
// 2. 업로드파일 폴더경로
// 3. 용량[바이트]
// 4. "인코딩타입"
// 5. DefaultFileRenamePolicy() : "보안(파일명 동일 시 .1~ 임의숫자 부여)"


// 현재 작업폴더 업로드
/* String folderpath = "C:/Users/505/git/ezen_kth/Jsp_website/src/main/webapp/website(Day45)/upload"; */

// 서버 폴더 업로드
String folderpath = request.getSession().getServletContext().getRealPath("website(Day45)/upload");

//System.out.print( folderpath );

MultipartRequest multi = new MultipartRequest(request, folderpath, 1024 * 1024, "UTF-8", new DefaultFileRenamePolicy());

/* 요청 */
request.setCharacterEncoding("utf-8"); // 요청시 [ request ] 한글 인코딩

// request > multi 전환
String title = multi.getParameter("title");
String contents = multi.getParameter("contents");
String file = multi.getFilesystemName("file");
// getFilesystemName 로 사용 시 파일명 표기가능

/* String title = request.getParameter("title");
String contents = request.getParameter("contents");
String file = request.getParameter("file"); */

/* 작성자의 회원번호 */
Login login = (Login) session.getAttribute("login");
int m_num = login.getM_num();

// 객체화
Board board = new Board(title, contents, m_num, file);

// DB처리
BoardDao.gemboarddao().boardwrite( board);

// 페이지전환
response.sendRedirect("../view/board/boardlist.jsp");

%>
