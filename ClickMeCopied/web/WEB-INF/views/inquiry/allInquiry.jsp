<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">1:1문의 전체 조회해보기</h1>
	<table align="center" border="1">
		<tr>
			<th>1:1문의코드</th>
			<th>문의유형코드</th>
			<th>사용자코드</th>
			<th>문의제목</th>
			<th>문의내용</th>
			<th>문의날짜</th>
			<th>답변내용</th>
			<th>답변일자</th>
			<th>답변여부</th>
		</tr>
		<c:forEach var="inq" items="${ requestScope.inqList }">
			<tr>
				<td>${ inq.code }</td>
				<td>${ inq.inqTypeCode }</td>
				<td>${ inq.userCode }</td>
				<td>${ inq.inqTitle }</td>
				<td>${ inq.inqContent }</td>
				<td>${ inq.inqTime }</td>
				<td>${ inq.ansContent }</td>
				<td>${ inq.ansTime }</td>
				<td>${ inq.ansYn }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>