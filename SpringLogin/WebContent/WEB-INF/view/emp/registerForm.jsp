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
		alert("��й�ȣ ��ġȮ���� ���ּ���")
		return false}
}
function pwCheck(){
	i = 1;
	if($("#pw1").val() == $("#pw2").val()){
		alert("��й�ȣ�� ��ġ�մϴ�.")
		}else{
			alert("�����ϰ� �Է��ϼ���.")
			i = 0}
}
</script>
</head>

<body>
<form method="post" onsubmit="return check()">
	�̸� : 
	<input id="name" name="name"><span id="nch"></span><br>
	���̵� : 
	<input id="id" name="id"><br>

��й�ȣ
<input id="pw1" type="password" name="passwd" placeholder="��й�ȣ" /><br>
��й�ȣ Ȯ��
<input id="pw2" type="password" placeholder="��й�ȣ Ȯ��" />
<input type="button" id="btn" value="Ȯ��" onclick="pwCheck()"><br>
	
	������� : 
	<input id="birth" name="birth" type="text"><br>
	�̸��� : 
	<input id="email" name="email" type="email"><br>
	��ȭ��ȣ : 
	<input id="phonenum" type="text" name="phonenum" pattern="[0-9]{11}" placeholder="���ڸ� �Է��ϼ���"><br>
	
	<label for="approval">����</label>
	<input name="approval" type="radio" value="0">������
	<input name="approval" type="radio" value="1">�����
	<br>
	
	���� : 
	<input id="level" name="level"><br>
	
	<input type="submit" value="����">
</form>
</body>
</html>