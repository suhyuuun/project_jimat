<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jimat - Food choice for you</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous" />
<script src="https://kit.fontawesome.com/edd4d6d779.js"
	crossorigin="anonymous"></script>
<link href="/css/main.css" type="text/css" rel="stylesheet" />

</head>
<body>
	<div class="header container col-12 colmun-row mt-4">
		<div class="row">
			<div class="logo col-3">
				<a href="javascript: main_page();"><img
					src="/images/logo2.png" id="logo_img" /></a>
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
										href="javascript: main_page();">Home <span
											class="visually-hidden">(current)</span>
									</a></li>
									<li class="nav-item"><a class="nav-link"
										href="javascript: team_vita500();">Team Vita500</a></li>
									<li class="nav-item"><a class="nav-link"
										href="javascript: curation_page()">Curation</a></li>
									<li class="nav-item"><a class="nav-link"
										href="javascript: one_km_map()">반경1km</a></li>
									<li class="nav-item"><a class="nav-link"
										href="javascript: magazine_page();">Magazine</a></li>
									<li class="nav-item"><a class="nav-link"
										href="javascript: my_page();">My Page</a></li>
									<li class="nav-item"><a class="nav-link"
										href="javascript: review();">임시_리뷰</a></li>
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
	<div class="nav" id="nav">
		<div class="main_image">
			<img src="images\main_img1.png" />
		</div>
	</div>
</body>
<script src="js/one_km_map.js"></script>
<script src="js/main.js"></script>
</html>