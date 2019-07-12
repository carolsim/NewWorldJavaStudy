<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="f" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">success ${msg}</div>
	<c:if test = "${ testSession ne null }">
    	${ testSession["id"] } <br/>
    	<c:out value='<h2>${ testSession.id }</h2>' escapeXml="true" />
	</c:if>
	<hr/>
	<c:if test="${f:length(list) > 0}">
		<c:forEach var="obj" items="${list}">
			${obj.id} <br/>
		</c:forEach>
	</c:if>
</body>
</html>