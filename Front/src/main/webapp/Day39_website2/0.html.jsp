<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style>
* {
	margin: 0;
	padding: 0;
}

#wrap {
	display: flex;
	height: auto;
	flex-direction: column;
	justify-content: center;
	align-content: center;
	border: solid 1px #000000;
	flex-direction: column;
	border: solid 1px #000000;
}

header {
	width: 100%;
	height: 100px;
	border: solid 1px #000000;
}

nav {
	width: 100%;
	border: solid 1px #000000;

}

main {
	width: 100%;
	height: auto;
	border: solid 1px #000000;
}

footer {
	width: 100%;
	height: auto;
	border: solid 1px #000000;

}
</style>

</head>

<body>
	<div id="wrap">
		<%@include file="1.header.jsp"%>
		<%@include file="2.nav.jsp"%>
		<%@include file="3.main.jsp"%>
		<%@include file="4.footer.jsp"%>
	</div>


</body>
</html>