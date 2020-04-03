<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.1.0.min.js"></script>
<script type="text/javascript">
var i = 0;
function check(){
	if(i == 0){
		alert("비밀번호 일치확인을 해주세요")
		return false}
}
function pwCheck(){
	i = 1;
	if($("#pw1").val() == $("#pw2").val()){
		alert("비밀번호가 일치합니다.")
		}else{
			alert("동일하게 입력하세요.")
			i = 0}
}
</script>
</head>

<body>
<form method="post" onsubmit="return check()">
	이름 : 
	<input id="name" name="name"><span id="nch"></span><br>
	아이디 : 
	<input id="id" name="id"><br>

비밀번호
<input id="pw1" type="password" name="passwd" placeholder="비밀번호" /><br>
비밀번호 확인
<input id="pw2" type="password" placeholder="비밀번호 확인" />
<input type="button" id="btn" value="확인" onclick="pwCheck()"><br>
	
	생년월일 : 
	<input id="birth" name="birth" type="text"><br>
	이메일 : 
	<input id="email" name="email" type="email"><br>
	전화번호 : 
	<input id="phonenum" type="text" name="phonenum" pattern="[0-9]{11}" placeholder="숫자만 입력하세요"><br>
	
	<label for="approval">권한</label>
	<input name="approval" type="radio" value="0">관리자
	<input name="approval" type="radio" value="1">사용자
	<br>
	
	직급 : 
	<input id="level" name="level"><br>
	
	<input type="submit" value="가입">
</form>
</body>
</html>