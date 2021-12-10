<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 헤더 로드 -->
	<%@include file="../header.jsp"%>

	<div class="container boardlistpage d-flex">
		<div class="row side col-md-8 d-flex border">
			<label class="col-8 " style="padding: 20px">문의 게시판</label>
			<div class="buttonbox d-flex col-3">
				<button class="btn btn-outline-primary">목록</button>
				<span>|</span>
				<button class="btn btn-outline-primary">수정</button>
				<span>|</span>
				<button class="btn btn-outline-primary">삭제</button>
			</div>

			<br />

			<div class="table align-items-top">
				<form action="">
					<button class="mb-3" type="button"><a href="./boardwrite.jsp">글쓰기</a></button>
					<table class="table table-border">
						<thead>
							<tr>
								<th>번호</th>
								<th>제목</th>
								<th>내용</th>
								<th>작성자</th>
								<th>조회수</th>
							</tr>

						</thead>
						<tbody>

							<tr>
								<td>1</td>
								<td>
									<a href="./boardview.jsp">내용</a>
								</td>
								<td>
									<a href="./boardview.jsp">내용</a>
								</td>
								<td>
									<a href="./boardview.jsp">내용</a>
								</td>
								<td>
									<a href="./boardview.jsp">내용</a>
								</td>
							</tr>

							<tr>
								<td>2</td>
								<td>
									<a href="./boardview.jsp">내용</a>
								</td>
								<td>
									<a href="./boardview.jsp">내용</a>
								</td>
								<td>
									<a href="./boardview.jsp">내용</a>
								</td>
								<td>
									<a href="./boardview.jsp">내용</a>
								</td>
							</tr>

							<tr>
								<td>3</td>
								<td>
									<a href="./boardview.jsp">내용</a>
								</td>
								<td>
								<a href="./boardview.jsp">내용</a>
								</td>
								<td>
								<a href="./boardview.jsp">내용</a>
								</td>
								<td>
									<a href="./boardview.jsp">내용</a>
								</td>
							</tr>

							<tr>
								<td>4</td>
								<td>
								<a href="./boardview.jsp">내용</a>
								</td>
								<td>
								<a href="./boardview.jsp">내용</a>
								</td>
								<td>
									<a href="./boardview.jsp">내용</a>
								</td>
								<td>
									<a href="./boardview.jsp">내용</a>
								</td>
							</tr>

							<tr>
								<td>5</td>
								<td>
									<a href="./boardview.jsp">내용</a>
								</td>
								<td>
								<a href="./boardview.jsp">내용</a>
								</td>
								<td>
								<a href="./boardview.jsp">내용</a>
								</td>
								<td>
									<a href="./boardview.jsp">내용</a>
								</td>
							</tr>
						</tbody>
					</table>
				</form>
				<div class="search">
					<!--  검색  -->
					<form action="" method="get"
						class="col-md-5 offset-3 input-group my-3">

						<select class="custom-select col-md-3" name="key">
							<!-- key : 필드명 -->
							<option value="b_title">제목</option>
							<option value="b_num">번호</option>
							<option value="b_contents">내용</option>
							<option value="b_writer">작성자</option>

						</select> <input type="text" class="form-control" name="keyword">
						<!-- keyword : 검색대상 -->
						<input type="submit" class="btn btn-outline-info ml-3" value="검색">
					</form>
				</div>

			</div>
		</div>

		<div
			class="row baordlist col-md-4 border d-flex flex-column justify-content-center">
			<div class="p-5">
				<h6>자주하는 질문 리스트</h6>
				<table class="table table-border">

					<tr>
						<th>Q</th>
						<td></td>
						<td>아이디를 분실했어요.</td>
					</tr>
					<tr>
						<th>Q</th>
						<td></td>
						<td>아이디를 분실했어요.</td>
					</tr>
					<tr>
						<th>Q</th>
						<td></td>
						<td>아이디를 분실했어요.</td>
					</tr>

				</table>
			</div>
			<div class="text-center">
				<h6>고객센터</h6>
				<p>1577-7777</p>
				<p>365일 연중무휴</p>
			</div>

		</div>
	</div>

	<!-- 푸터 로드 -->
	<%@include file="../footer.jsp"%>
</body>
</html>