<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>KIMSCHOOL 사원관리 시스템</title>
</head>
<body>

<h1>사원 로그인</h1>


<!-- <form action = "logincheck">

	ID : <br>
	<input type = "text" name = "id"><br>
	PASSWORD : <br>
	<input type = "password" name = "password"><br>
	<input type = "submit" value = "로그인"><br>

</form> -->

<form action="wbslogincheck">
	사원번호 : <br>
	<input type = "text" name = "u_no"><br>
	패스워드 : <br>
	<input type = "password" name = "u_password"><br>
	<input type = "submit" value = "로그인">
</form>


<a href = "movereguser">회원가입</a><br>
<a href = "movefindpassword">패스워드 찾기</a><br>


<!-- <hr>
<form action="wbstest">
<input type = "text" name = "u_no" placeholder="사원번호를 입력해주세요"><br>
<input type = "submit" value = "근무시간 확인">
</form> -->

</body>
</html>
