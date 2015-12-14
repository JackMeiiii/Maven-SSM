<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>显示Game设置</title>
</head>
<body>
	<div>
		<c:forEach items="${list}" var="game" varStatus="statu">
			<p class="child">
				<label class="topic">达到关卡奖励：</label> <span class="word"
					for="norms-value">达到</span> <input type="text" class="text value"
					name="norms-value" value="${game.level}" /> <span class="word">关</span>
				<span class="word" for="norms-value">奖励</span> <input type="text"
					class="text value" name="norms-value" value="${game.prize}" /> <span
					class="word">米粒</span>
			</p>
			</br>
		</c:forEach>
	</div>
</body>
</html>