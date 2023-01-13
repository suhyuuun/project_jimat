<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>맛집리스트 페이지</title>
</head>
<body>
	<table>
		<tr>
			<th>맛집이름</th>
		</tr>
		<c:forEach items="${aList}" var="dto">
			<tr>
				<td><c:url var="path" value="detailpage.do">
						<c:param name="latitude" value="${dto.latitude}" />
						<c:param name="longitude" value="${dto.longitude}" />
						<c:param name="foodtype" value="${dto.foodstore_id}" />
						<c:param name="img_url" value="${dto.img_url}" />
						<c:param name="foodstore_id" value="${dto.foodstore_id}" />
						<c:param name="foodstroe_num" value="${dto.foodstroe_num}" />
						<c:param name="road_name" value="${dto.road_name}" />
						<c:param name="rate" value="${dto.rate}" />
						<c:param name="openinghours" value="${dto.openinghours}" />
					</c:url> <a href="${path}">${dto.foodstore_id}</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>