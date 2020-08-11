<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<h1>로그인</h1>
	<div>${msg}</div>
	<div>
		<form action="/user/login" method="post">
			<div><label>아이디:<input type="text" name="uid"></label></div>
			<div><label>비밀번호:<input type="password" name="upw"></label></div>
			<div><input type="submit" value="로그인"></div>
		</form>
	</div>
</body>
</html>