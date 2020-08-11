<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<h1>회원가입</h1>
	<div>
		<form action ="/user/join" method ="post">
			<div><label>아이디:<input type="text" name ="uid"></label></div>
			<div><label>비밀번호:<input type="password" name ="upw"></label></div>
			<div><label>이름:<input type="text" name ="nm"></label></div>
			<div><input type ="submit" value="화원가입"></div>
		</form>
	</div>
</body>
</html>