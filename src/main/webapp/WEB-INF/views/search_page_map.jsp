<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jimat - Food choice for you</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=903a4aeed7d052f1bba36783e3f8632e"></script>
<link rel="stylesheet" href="css/search_page_map.css">
</head>
<body>
	<div class="header container col-12 colmun-row mt-4">
		<div class="row">
			<div class="logo col-3">
				<a href="index.do"><img src="images/logo2.png" id="logo_img" /></a>
			</div>
			<div class="header-menu column-row col-9">
				<div class="row">
					<div class="login mt-3">
						<div class="row">
							<div class="black col-8"></div>
							<div class="login-button col-4">
								<span>
									<button type="button" class="btn btn-secondary" id="login"
										value="로그인" onclick="login();">로그인</button>
									<button type="button" class="btn btn-secondary" id="sign_up"
										value="회원가입" onclick="sign_up();">회원가입</button>
								</span>
							</div>
						</div>
					</div>
					<nav
						class="navbar navbar-expand-lg navbar-mainmanu bg-warning mt-3">
						<div class="container-fluid">
							<div class="collapse navbar-collapse" id="navbarColor03">
								<ul class="navbar-nav me-auto">
									<li class="nav-item"><a class="nav-link active"
										href="main_page.do">Home <span class="visually-hidden">(current)</span>
									</a></li>
									<li class="nav-item"><a class="nav-link"
										href="team_vita500.do">TeamVita500</a></li>
									<li class="nav-item"><a class="nav-link"
										href="curation_page.do">Curation</a></li>
									<li class="nav-item"><a class="nav-link"
										href="one_km_map.do">반경1km</a></li>
									<li class="nav-item"><a class="nav-link"
										href="magazine_page.do">Magazine</a></li>
									<li class="nav-item"><a class="nav-link" href="my_page.do">My
											Page</a></li>
								</ul>
								<form class="d-flex">
									<input class="form-control me-sm-4" type="search"
										placeholder="검색어를 입력하세요">
									<button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
								</form>
							</div>
						</div>
					</nav>
				</div>
			</div>
		</div>
	</div>
	<div id="map"
		style="display: block; margin: 0 auto; width: 60%; height: 99%; position: relative; overflow: hidden;"></div>

	<!-- 지도타입 컨트롤 div 입니다 -->
	<div class="custom_typecontrol radius_border">
		<span id="btnRoadmap" class="selected_btn"
			onclick="setMapType('roadmap')">지도</span> <span id="btnSkyview"
			class="btn" onclick="setMapType('skyview')"> 스카이뷰</span>
	</div>

	<!-- 지도 확대, 축소 컨트롤 div 입니다 -->
	<div class="custom_zoomcontrol radius_border">
		<span onclick="zoomIn()"><img
			src="http://i1.daumcdn.net/localimg/localimages/07/mapapidoc/ico_plus.png"
			alt="확대"></span> <span onclick="zoomOut()"><img
			src="http://i1.daumcdn.net/localimg/localimages/07/mapapidoc/ico_minus.png"
			alt="축소"></span>
	</div>

	<div id="menu_wrap" class="bg_white">
		<div class="option">
			<form onsubmit="searchPlaces(); return false">
				<span>지역명:</span> <input type="text" value=" ex) 서울" id="keyword"
					size="15" />
				<button type="submit">검색하기</button>
			</form>
		</div>
		<hr />
		<ul id="placesList"></ul>
		<div id="pagination"></div>
	</div>
	<script src="js/main.js"></script>
	<script src="js/search_page_map.js"></script>
</body>
</html>