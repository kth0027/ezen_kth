<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

</head>
<body>
	<%@include file="0.��Ʈ��Ʈ����ũ��Ʈ.jsp"%>
	<div class="container">
		<div class="card signcard">
			<div class="row justify-content-center mt-1">
				<h1>
					<span><a href="2.main.jsp"><i class="fas fa-tshirt mr-2"></i></a></span>�Ȼ곲�ڼ��θ�
				</h1>
				<div class="col-md-12 text-center mb-2">
					<p class="mt-3">�����ϰ� �α����ϱ�</p>
					<br /> <span>������ �Է¾���</span><br /> <span>īī���� ���� ������ ȸ�������ϼ���.</span>
				</div>

				<div class="row mb-3">
					<div class="col-md-3 justify-content-between">
						<button class="btn btn-warning">īī�� 3�� �α���/ȸ������</button>
					</div>
				</div>

				<div class="container">
					<div class="row ">
						<form class="col-md-12 text-center" action="">
							<button class="btn m-1" type="button">�Ϲ�ȸ�� �α���</button>
							<button class="btn m-1" type="button">��ȸ�� �����ȸ</button>
							<div class="col-md-12 my-3">
								<span>���̵� : </span> <input type="text" placeholder="���̵�">
							</div>

							<div class="col-md-12 my-3">
								<span>��й�ȣ : </span> <input type="password" placeholder=��й�ȣ">
							</div>

							<div class="col-md-12 mb-1">
								<a href=""><button class="btn btn-warning" type="button">�α���</button></a>
							</div>

							<div class="row">
								<div class="col-md-1"></div>
								<div class="col-md-4 offset-1">
									<a href=""><button class="btn btn-warning mx-1" type="button">���̵�/��й�ȣã��</button></a>
								</div>
								<div class="col-md-3">
									<a href="5.sign.jsp"><button class="btn btn-warning mx-1" type="button">ȸ������</button></a>
								</div>
								<div class="col-md-1"></div>
							</div>



						</form>
					</div>
				</div>

				<div class="container mt-1 text-center mb-2 card-body">
					<div class="row my-2 mb-3">
						<div class="col-md-2"></div>
						<div class="col-md-4">
							<a href="#"> <i class="fab fa-facebook fa-2x"></i>
							</a> ���̽������� �α���
						</div>
						<div class="col-md-4">
							<a href="#"> <i class="fab fa-apple fa-2x"></i>
							</a> ���÷� �α���
						</div>
						<div class="col-md-2"></div>
					</div>

					<div class="row my-2">
						<div class="col-md-2"></div>
						<div class="col-md-4">
							<a href="#" class="btn"> <i class="fab fa-instagram fa-2x"></i>
							</a> �ν�Ÿ�׷����� �α���
						</div>
						<div class="col-md-4"></div>
						<div class="col-md-2"></div>
					</div>
				</div>






			</div>
		</div>



	</div>

	<canvas>
	</canvas>

</body>
</html>