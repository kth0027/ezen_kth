<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
#menuul {
	text-align: center;		/*  �ؽ�Ʈ�������	*/
	background: skyblue;	/*  ����	*/
	color: white;			/*  �ۻ�	*/
	padding: 15px;			/*  ���� ����	*/
}

.menuli {
	display: inline;		/*  inline(������) block(����)	*/
	margin-left: 20px;		/*  ���� �ٱ����� */
}

a {
	color: white;			/* ��ũ ���� */
	text-decoration: none;	/* ��ũ(�⺻ ���� ����) */
}

a:hover {
	color: orange;			/* ���콺 ������ ���ڻ� ���� */
}

</style>
</head>

<body>
	<!-- ul(unorder list) : �������� ��� -->
	<ul id="menuul">
		<li class="menuli"><a href="12-3.�Ұ�.jsp">�Ұ�</a> </li>
		<li class="menuli"><a href="12-2.�Խ���.jsp">�� ����</a> </li>
		<li class="menuli"><a href="12-1.�α���.jsp">�α���</a> </li>
		<li class="menuli"><a href="#">ȸ������</a> </li>
		<li class="menuli"><a href="12-4.����.jsp">ã�� ���ô� ��</a> </li>

	</ul>
</body>
</html>