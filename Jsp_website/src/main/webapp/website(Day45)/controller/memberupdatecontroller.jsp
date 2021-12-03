<%@page import="dto.Member"%>
<%@page import="dao.MemberDao"%>
<%


//AJX로부터 요청한 변수
String newname = request.getParameter("newname");
String newsex = request.getParameter("newsex");
String newbirth = request.getParameter("newbirth");
String newphone = request.getParameter("newphone");
String newaddress = request.getParameter("newaddress");

// 로그인 아이디 [ 세션 객체를 씀 - 어디서든 변수 호출이 가능하다 ]
String id = (String) session.getAttribute("loginid");

// name db 처리
if (newname != null) {
	if (MemberDao.getmemberDao().update("m_name" , newname, id) ) {
		out.print(1);
	} else {
		out.print(2);
	}
}

// 성별 db 처리
if (newsex != null) {
	if (MemberDao.getmemberDao().update("m_sex" , newsex, id) ) {
		out.print(1);
	} else {
		out.print(2);
	}
}

// 생년월일 db 처리
if (newbirth != null) {
	if (MemberDao.getmemberDao().update("m_birth" , newbirth, id) ) {
		out.print(1);
	} else {
		out.print(2);
	}
}

// 연락처 db 처리
if (newphone != null) {
	if (MemberDao.getmemberDao().update("m_phone" , newphone, id) ) {
		out.print(1);
	} else {
		out.print(2);
	}
}

// 주소 db 처리
if (newname != null) {
	if (MemberDao.getmemberDao().update("m_address" , newaddress, id) ) {
		out.print(1);
	} else {
		out.print(2);
	}
}
%>

