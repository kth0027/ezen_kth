<%@page import="dto.Reply"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file="../header.jsp"%>
	<!-- 헤더 페이지 -->

	<%
	int b_num = Integer.parseInt(request.getParameter("b_num")); // 전 페이지에서 클릭한 게시물번호	

	String boardviews = loginid + ":" + b_num; // 1. 현재로그인id + 게시물번호; => 세션이름 사용예정

	if (session.getAttribute(boardviews) == null) { // 2. 현재로그인id+게시물 의 세션명이 존재하지 않으면
		BoardDao.getboarddao().boardcount(b_num); // 3. DB 호출 [ // 조회수 증가	 ]
		String boardview = loginid + ":" + b_num; // 4. 세션명 = 현재로그인id + 게시물번호
		session.setAttribute(boardview, true); // 5. 조회수 증가 방지 [ 세션 생성 : 세션아이디 , 세션값 ]
		session.setMaxInactiveInterval(60 * 60 * 24); // *세션 유효시간 : 초당 [ 하루 ]
	}
	// 해당 게시물번호의 게시물 가져오기
	Board board = BoardDao.getboarddao().getboard(b_num);
	%>

	<!-- 게시물 상세 페이지 -->
	<div class="container border">

		<div class="row">
			<div class="m-2">
				<a href="boardlist.jsp">
					<button class="form-control">목록보기</button>
				</a>
			</div>
			<%
			if (loginid != null && loginid.equals(board.getB_writer())) {
			%>
			<!-- 로그인된 아이디와 작성자와 동일할경우에만 -->
			<div class="m-2">
				<a href="boardupdate.jsp?b_num=<%=board.getB_num()%>">
					<button class="form-control">수정하기</button>
				</a>
			</div>
			<div class="m-2">
				<a href="../../controller/boarddeletecontroller.jsp?b_num=<%=board.getB_num()%>">
					<button class="form-control">삭제하기</button>
				</a>
			</div>
			<%
			}
			%>
		</div>

		<div class="row col-md12 mt-2 border">

			<table class="table offset-1 col-md-10 table-striped">

				<tr>
					<td style="width: 20%">작성자 <%=board.getB_writer()%>
					</td>
					<td>작성일 <%=board.getB_date()%>
					</td>
					<td>조회수 <%=board.getB_view()%>
					</td>
				</tr>
				<tr>
					<td>제목</td>
					<td colspan="2"><%=board.getB_title()%></td>
				</tr>
				<tr>
					<td style="height: 300px;">내용</td>
					<td colspan="2"><%=board.getB_contents()%></td>
				</tr>
				<tr>
					<td>첨부파일1 <br> 다운로드 <br> <% if (board.getB_file() == null) { %> <% } else { %> <a href="../../controller/filedowncontroller.jsp?file=<%=board.getB_file()%>"> <%=board.getB_file()%></a> <% } %>
					</td>
					<%
					if (board.getB_file() == null) {
					%>
					<td colspan="2" height="300px;"></td>
					<%
					} else {
					%>
					<td colspan="2" height="300px;">
						<!-- 박스권 안에 사진 사이징 : max-width , max-height --> 미리보기 <br> <img src="../../upload/<%=board.getB_file()%>" style="max-width: 20rem; max-height: 20rem">
					</td>
					<%
					}
					%>

				</tr>

				<tr>
					<td>첨부파일2 <br> 다운로드 <br> <% if (board.getB_file2() == null) { %> <% } else { %> <a href="../../controller/filedowncontroller.jsp?file=<%=board.getB_file2()%>"> <%=board.getB_file2()%></a> <% } %>
					</td>
					<%
                    if (board.getB_file2() == null) {
                    %>
					<td colspan="2" height="300px;"></td>
					<%
                    } else {
                    %>
					<td colspan="2" height="300px;">
						<!-- 박스권 안에 사진 사이징 : max-width , max-height --> 미리보기 <br> <img src="../../upload/<%=board.getB_file2()%>" style="max-width: 20rem; max-height: 20rem">
					</td>
					<%
                    }
                    %>

				</tr>
			</table>

			<br> <br>
			<hr>


			<form class="row col-md-12 d-flex justify-content-center align-items-center text-center" action="../../controller/replywritecontroller.jsp" method="post">

				<!-- 댓글 저장시 : 1.댓글내용 2.댓글작성자[세션] 3.게시물번호 -->
				<input type="hidden" name="b_num" value="<%=b_num%>">

				<div class="col-md-2">
					<h6>댓글작성</h6>
				</div>
				<div class="col-md-8">
					<textarea rows="" cols="" class="form-control" name="r_contents"></textarea>
				</div>
				<div class="col-md-2">
					<input type="submit" value="등록" class="form-control">
				</div>
			</form>

			<div class="row col-md-12 d-flex justify-content-center">
				<table class="table">
					<tr>
						<th>작성자</th>
						<th>내용</th>
						<th>작성일</th>
					</tr>

					<% 
                    ArrayList<Reply> replies = BoardDao.getboarddao().replylist(b_num);
                    for( Reply reply : replies ){
                %>

					<tr>
						<th class="col-2"><%=reply.getR_writer() %></th>
						<th class="col-6"><%=reply.getR_contents() %></th>
						<th class="col-2"><%=reply.getR_date() %></th>
						<th class="col-2">
							<!-- 삭제버튼 눌렀을때 댓글번호 이동 --> <a href="../../controller/replydeletecontroller.jsp?r_num=<%=reply.getR_num()%>&b_num=<%=b_num%>">
								<button class="form-control">삭제</button>

						</a>
					</tr>
					<%} %>
				</table>
			</div>



			<%-- <form class="row col-md-12" action="../../controller/replywritecontroller.jsp" method="post">
				<table class="table text-center border">

					<tr class="">
						<th class="" name="r_num">구분</th>
						<th class="" name="m_id">작성자</th>
						<th class="" name="replycontents">내용</th>
						<th class="" name="rdate">작성일</th>
						<th>기타</th>
					</tr>
					<tr>
					<td><%=Reply.getR_num() %></td>
						<td class="" name="r_num">1</td>
						<td class="" name="m_id">qweqwe</td>
						<td class="" name="replycontents">안녕하세요~~~~~~</td>
						<td class="" name="rdate">2021-12-07</td>
						<td>
							<button class="form-control" name="replydelete">삭제</button>
						</td>
						<td>
					</tr>
					<tr>
						<td class="" name="r_num">1</td>
						<td class="" name="m_id">qweqwe</td>
						<td class="" name="replycontents">안녕하세요~~~~~~</td>
						<td class="" name="rdate">2021-12-07</td>
						<td>
							<button class="form-control" name="replydelete">삭제</button>
						</td>
						<td>
					</tr>

				</table>
			</form> --%>



		</div>

	</div>
</body>
</html>