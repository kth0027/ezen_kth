<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
//1. 경로에서 파일명 가져오기 [ 조건 : ../../controller/filedowncontroller.jsp?file=파일명 ]
request.setCharacterEncoding("utf-8");
String filename1 = request.getParameter("file1");
String filename2 = request.getParameter("file2");

// 2. 서버내 업로드폴더에서 파일 찾기 *작업폴더 경로에서 파일 찾기 
//String folderpath1 = request.getSession().getServletContext().getRealPath("website(Day45)/upload/" + filename1);
//String folderpath2 = request.getSession().getServletContext().getRealPath("website(Day45)/upload/" + filename2);

// 2. 서버내 업로드폴더에서 파일 찾기 *서버내 업로드폴더에서 파일 찾기
String folderpath1 = request.getSession().getServletContext().getRealPath("website(Day45)/upload/" + filename1);
String folderpath2 = request.getSession().getServletContext().getRealPath("website(Day45)/upload/" + filename2);
// request.getSession().getServletContext().getRealPath() : 서버내 경로찾기

// 3. 파일 객체화
File file1 = new File(folderpath1);
File file2 = new File(folderpath2);

// 4. 다운로드 형식변경
response.setHeader("Content-Disposition", "attachment;filename=" + filename1 + ";");
response.setHeader("Content-Disposition", "attachment;filename=" + filename2 + ";");
// setHeader("다운로드형식html" , 다운로드형식에 표시할 파일명 )
// 내보내기 [ 스트림(바이트) ]
// 2. 만약에 파일이 존재하며

if (file1.isFile()) { //file.isFile() : 파일이 있는지 없는지 유무 확인
	// 3.입력스트림 [ 파일을 바이트형으로 읽어오기 ]
	BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file1));
	byte[] bytes = new byte[(int) file1.length()]; // file.legnth : 파일내 바이트 길이 메소드
	inputStream.read(bytes);

	// 3.출력스트림 [ 읽어온 바이트형 파일을 내보내기 ] // response.getOutputStream() : 클라이언트에게 바이트 전송
	BufferedOutputStream outputStream = new BufferedOutputStream(response.getOutputStream());
	outputStream.write(bytes);

	inputStream.close(); // 입력 스트림 닫기
	outputStream.close(); // 출력 스트림 닫기
}

if (file2.isFile()) { //file.isFile() : 파일이 있는지 없는지 유무 확인
	// 3.입력스트림 [ 파일을 바이트형으로 읽어오기 ]
	BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file2));
	byte[] bytes = new byte[(int) file2.length()]; // file.legnth : 파일내 바이트 길이 메소드
	inputStream.read(bytes);

	// 3.출력스트림 [ 읽어온 바이트형 파일을 내보내기 ] // response.getOutputStream() : 클라이언트에게 바이트 전송
	BufferedOutputStream outputStream = new BufferedOutputStream(response.getOutputStream());
	outputStream.write(bytes);

	inputStream.close(); // 입력 스트림 닫기
	outputStream.close(); // 출력 스트림 닫기
}
%>
