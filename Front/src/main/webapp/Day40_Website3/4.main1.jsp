<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
/* ����1 */
.banners {
	width: 62.5rem;
	height : auto;
	margin: 0 auto;
	border: 1px solid #000000;
}

.box2 {
	display: flex;
	flex-direction: row;
	flex-wrap: wrap; justify-content : center;
	margin-top: 10px;
	margin-bottom: 10px;
	justify-content: center;
}

.box2_left, .box2_right {
	width: 50%;
}

.box2 li:nth-of-type(1) {
	float: left;
	width: 24%;
	/* background: red; */
	list-style: none;
}

.box2 li img {
	display: block;
	margin: 0 auto;
	height: 100px;
}

.box2 li:nth-of-type(2) {
	width: 74%;
	margin-left: 25%;
	padding: 5px;
	line-height: 30px;
	list-style: none;
	/* background: blue; */
}
</style>

</head>
<body>
	<section class="banners">
		<div class="box box2">
			<div class="box2_left">
				<ul>
					<li><img src="img/icon1.png" alt="" /></li>
					<li>
						<h4>����ȳ�</h4>
						<p>��Ʃ��� �뿩�� ������ ���ͳ� ������ �ϼž� �մϴ�. ������ 1���������� �����մϴ�.</p>
					</li>

				</ul>
			</div>
			<div class="box2_right">
				<ul>
					<li><img src="img/icon2.png" alt="" /></li>
					<li>
						<h4>���� ������</h4>
						<p>��� ����, ���� ����, �����ʻ���, �������� �� ���� �Ǵ� ��ü�� �̿��� �� �ֽ��ϴ�.</p>
					</li>
				</ul>
			</div>
		</div>
	</section>
</body>
</html>