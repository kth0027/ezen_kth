<%@page import="dao.ProductDao"%>
<%@page import="dto.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="../header.jsp"%>

	<%
	
	//검색처리
	String key = request.getParameter("key");
	String keyword = request.getParameter("keyword");
	
	   ArrayList<Product> products = ProductDao.getProductDao().getproductlist( key, keyword);
	%>

	<div class="container">

		<form action="dashboard.jsp" method="get" class="col-md-5 offset-3 input-group my-3">
			<!-- 검색 -->
			<select class="custom-select col-md-3" name="key">
				<option value="p_num">제품번호</option>
				<option value="p_name">제품명</option>
				<option value="p_category">카테고리</option>
				<option value="p_active">제품상태</option>
			</select>
			<input type="text" class="form-control" name="keyword">
			<input type="submit" class="btn btn-outline-info" value="검색">
		</form>

		<a class="d-flex justify-content-center" href="productwrite.jsp">
			<button class="btn btn-dark" style="cursor: pointer;">제품등록</button>
		</a>

		<h3>제품목록</h3>

		<table class="col-md-12 table table-bordered">
			<tr class="text-center bg-info plist">
				<td>이미지</td>
				<td>제품번호</td>
				<td>제품명</td>
				<td>제품가격</td>
				<td>카테고리</td>
				<td>상태</td>
				<td>사이즈</td>
				<td>재고</td>
				<td>제품등록일</td>
				<td>비고</td>
			</tr>

			<%
			for (Product product : products) {
			%>
			<tr class="text-center">
				<td>
					<img src="../../upload/<%=product.getP_img()%>" alt="" / style="width: 10rem; height: 5rem;">
				</td>
				<td><%=product.getP_num()%></td>
				<td><%=product.getP_name()%></td>
				<td><%=product.getP_price()%></td>
				<td><%=product.getP_category()%></td>
				<td><%=product.getactive()%></td>
				<td><%=product.getP_size()%></td>
				<td><%=product.getP_stock()%></td>
				<td><%=product.getP_date()%></td>
				<td>
					<a href="#" >
						<button class="btn-outline-info" style="cursor: pointer;">수정</button>
					</a>
					<a href="../../controller/productdeletecontroller.jsp?p_num=<%=product.getP_num() %>" style="cursor: pointer;">
						<button class="btn-outline-danger" style="cursor: pointer;">삭제</button>
					</a>
					<a href="#" style="cursor: pointer;">
						<button class="btn-outline-success" style="cursor: pointer;" onclick="activeupdate(<%=product.getP_num()%>)">상태변경</button>
					</a>
				</td>
			</tr>
			<%
			}
			%>
		</table>

	</div>

	<%@include file="../footer.jsp"%>
	


</body>
</html>
