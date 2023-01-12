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
						<c:param name="foodstore_id" value="${dto.foodstore_id}" />
						<c:param name="address" value="${dto.address}" />
					</c:url> <a href="${path}">${dto.foodstore_id}</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>