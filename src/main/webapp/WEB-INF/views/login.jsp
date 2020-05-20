<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>로그인페이지</title>
</head>
<body>

<h1>JAP + Spring 연동</h1>


<form action = "logincheck">

ID : <br>
<input type = "text" name = "id"><br>
PASSWORD : <br>
<input type = "password" name = "password"><br>
<input type = "submit" value = "로그인"><br>

</form>

<a href = "movereguser">회원가입</a><br>
<a href = "movefindpassword">패스워드 찾기</a><br>


<hr>
<form action="wbstest">
<input type = "text" name = "u_no" placeholder="사원번호를 입력해주세요"><br>
<input type = "submit" value = "근무시간 확인">
</form>

</body>
</html>
