<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.parser.JSONParser"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="com.mysql.cj.xdevapi.JsonParser"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.URL"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- "https://api.odcloud.kr/api/15077586/v1/centers?page=1&perPage=10&serviceKey=juS3Pm2CxPvLETD1kN5hrThRunzg1fLGtOx0uOe2VpkbzV%2BRZ8UMfC2gb2Bx03%2FJMJQhIOeI4TuhTv8jyR9NCQ%3D%3D" -->
	<%@include file="../header.jsp"%>
	<%
	//api 가져오기 [json 형식]

	// 1. 요청 url 가져오기
	URL url = new URL(
			"https://api.odcloud.kr/api/15077586/v1/centers?page=1&perPage=10&serviceKey=juS3Pm2CxPvLETD1kN5hrThRunzg1fLGtOx0uOe2VpkbzV%2BRZ8UMfC2gb2Bx03%2FJMJQhIOeI4TuhTv8jyR9NCQ%3D%3D");
	
	// 호출개수 : page="시작번호"&peppage="마지막번호"
	// 2. 스트림 버퍼를 통한 URL 내 HTML 가져오기
	BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

	// BufferReader : 외부 [이클립스의] 입출력 버퍼 [ 통신 데이터 저장소 ]
	// InputStreamReader (스트림,  " 인코딩 타입 ") : 입출력 스트림
	// url.openStream() : 바이트 단위로 url 내용 읽기

	// 3. 읽어온 내용 문자열 담기
	String result = bf.readLine(); // .readLine();
	//System.out.print("url내 문서 스트림 이용한 읽어오기 [String] " + result );
	// 3. 읽어온 내용을 json으로 파싱하기
	JSONParser jsonParser = new JSONParser();
	JSONObject jsonObject = (JSONObject) jsonParser.parse(result);

	// 1. JSONparser json 데이터 넣어 파싱
	//System.out.print("rul내용을 json 변한 [json] : " + jsonObject) ;
	JSONArray jsonArray = (JSONArray) jsonObject.get("data");
	// "Data" 라는 키 요청해서 리스트 담기
	// System.out.println("data키를 호출해서리스트 담기 : " +  jsonArray);

	for (int i = 0; i < jsonArray.size(); i++) {
		JSONObject content = (JSONObject) jsonArray.get(i);
		// 반목문 통한 리스트 내 i번째 호출
		// System.out.print("content");
	%>
	<tr>
		<td class="col-4"><%=content.get("facilityName")%></td>
		<!-- json명.get("키") -->
	</tr>
	<%
	}
	%>
</body>
</html>