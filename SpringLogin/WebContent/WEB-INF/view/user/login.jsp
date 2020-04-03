<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script type="text/javascript">
	var msg = "${msg}";
	if(msg=="REGISTERED"){
		alert("회원가입이 완료되었습니다~로그인해주세요");
	}else if(msg == "FAILURE"){
		alert("아이디와 비밀번호를 확인해주세요.");
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	var msg = "${msg}";
	if(msg=="REGISTERED"){
		alert("회원가입이 완료되었습니다~로그인해주세요");
	}else if(msg == "FAILURE"){
		alert("아이디와 비밀번호를 확인해주세요.");
	}
</script>
<form action="loginPost" method="post">
아이디 : <input type="text" name="userid"><br>
비밀번호 : <input type="password" name="userpw"><br>
<button type="submit">로그인</button>
<!-- <a href="redirect:jsp/register">회원가입</a> -->
</form>
</body>
</html>