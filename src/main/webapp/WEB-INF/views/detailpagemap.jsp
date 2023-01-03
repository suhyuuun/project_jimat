<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="javax.servlet.annotation.WebServlet"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
String lat = request.getParameter("latitude");
String lng = request.getParameter("longitude");
%>
<title>상세페이지</title>
<link href="/css/main.css" type="text/css" rel="stylesheet" />
<script src="https://kit.fontawesome.com/edd4d6d779.js"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/map.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=85e3a2b784700813659ca3ae8da46d29"></script>

</head>
<body>
	<div class="body_wrap">
		<div class="header">
			<div class="logo">
				<a href="javascript: main_page();"><img src="/images/logo1.png"
					id="logo_img" /></a>
			</div>
			<div class="top_search">
				<div id="search_form">
					<span> <input type="text" value="test" />
					</span> <span> <i class="fa-solid fa-magnifying-glass fa-xl"></i>
					</span>
				</div>
			</div>
			<div class="login_button">
				<span>
					<button id="login" value="로그인" onclick="login();">로그인</button>
				</span>
			</div>
			<div class="sign_up_button">
				<span>
					<button id="sign_up" value="회원가입" onclick="sign_up();">
						회원가입</button>
				</span>
			</div>
			<div class="top_menu">
				<ul>
					<li><a href="javascript: team_vita500();">Team Vita500</a></li>
					<li><a href="javascript: curation_page()">큐레이션</a></li>
					<li><a href="javascript: one_km_map();">반경1km </a></li>
					<li><a href="javascript: magazine_page();">매거진</a></li>
					<li><a href="javascript: my_page();">마이페이지</a></li>
				</ul>
			</div>
		</div>
		<!-- 이미지 지도를 표시할 div 입니다 -->
		<div class="detail" id="detail">
			<div class="detailPage">
				<div id="map" style="width: 350px; height: 350px"></div>
			</div>
		</div>
	</div>


</body>
<script>
	var lat = <%=lat%>;
	var lng = <%=lng%>;
</script>
<script src="js/login.js"></script>
<script src="js/one_km_map.js"></script>
<script src="js/main.js"></script>
<script src="js/detail_page_map.js"></script>
</html>