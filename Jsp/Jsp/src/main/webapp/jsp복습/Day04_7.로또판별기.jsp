<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%-- <%
	int[] number = new int[6];
	int[] random = new int[6];

	/* String num = request.getParameter("num1", "num2", "num3", "num4", "num5", "num6"); */
	%>



	<h3>로또 판별하기</h3>

	<!-- 입력하기 -->
	<form action="">




		1번째 수 :
		<input type="text" name="num1" placeholder=" 1 ~ 45 중 선택">
		<br /> 2번째 수 :
		<input type="text" name="num2" placeholder=" 1 ~ 45 중 선택">
		<br /> 3번째 수 :
		<input type="text" name="num3" placeholder=" 1 ~ 45 중 선택">
		<br /> 4번째 수 :
		<input type="text" name="num4" placeholder=" 1 ~ 45 중 선택">
		<br /> 5번째 수 :
		<input type="text" name="num5" placeholder=" 1 ~ 45 중 선택">
		<br /> 6번째 수 :
		<input type="text" name="num6" placeholder=" 1 ~ 45 중 선택">
		<br />
		<button name="입력">입력</button>
		<br />
		<!-- 45 초과숫자입력시 오류 -->
		<%
		/* if (num < 1 || num > 45) { // 1 ~ 45 사이가 아닐경우

			continue;
		} */
		out.println(" [[ 알림 ]] : 0 ~ 45 사이만 입력 가능 합니다 : 다시 입력 ");
		%>
		<!-- out.println(" [[ 알림 ]] : 0 ~ 45 사이만 입력 가능 합니다 : 다시 입력 "); -->
		<%
		Boolean check = true;
		for (int j = 0; j < 6; j++) {
			if (num == number[j]) {
				i--; // 정상적인 입력이 아니기 문에 i 차감
				check = false; // 중복이 있는경우
				break; // 중복을 찾았기 때문에 반복문 종료

			}
		}
		out.println(" [[ 알림 ]] : 선택한 수는 이미 존재 합니다 : 다시입력 ");
		%>


	</form>

	<label for=""> 출력값은 : <%
	request.setCharacterEncoding("utf-8");
	out.print(request.getParameter("num1") + ",");
	out.print(request.getParameter("num2") + ",");
	out.print(request.getParameter("num3") + ",");
	out.print(request.getParameter("num4") + ",");
	out.print(request.getParameter("num5") + ",");
	out.print(request.getParameter("num6") + ",");
	%>
	</label> --%>
	
	
	
	
	<%
	int lottos[] = new int[6];
	int selectNum = 0;
	boolean flag = false;
	for (int i = 0; i < lottos.length; i++) {

		do {

			selectNum = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {

		if (selectNum == lottos[j]) {

			flag = true;

			break;

		}

		flag = false;

			}

		} while (flag);

		lottos[i] = selectNum;

	}

	Arrays.sort(lottos);

	out.println(Arrays.toString(lottos));
	%>





</body>
</html>