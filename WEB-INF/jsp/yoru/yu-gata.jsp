<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.test"%>
<%
test msg = (test) session.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ゆうがた</title>
<link rel="stylesheet"
	href="http://localhost:8080/hamujiro/css/yu-gata.css">
</head>
<body>
	<div class=wrap2>
		<div class=yu-gataBack>
			<img src="img/夕焼け背景.jpg">
		</div>
		<!--		<div class=yu-gata>-->
		<!--			<img src="img/yu-gata.png">-->
		<!--		</div>-->
		<div class=ham>
			<img
				src="https://1.bp.blogspot.com/-hunVODuHQFM/YLrPqtfnUmI/AAAAAAABd1Q/Jq88rlxxG28urM0ddy9_rLt4E2-_fT2BACNcBGAsYHQ/s644/animal_hamster.png">
		</div>
		<div class=zzz>
			<img src="img/utouto.jfif">
		</div>
		<div class=yoru>
			<p>
				<%=msg.getMs_result()%><br>
			</p>
		</div>
		<div class=a>
			<a href="night?action=yoru">次へ</a>
		</div>
		<div class=yu-gata-child>
			<img src="img/夕焼けの子.jpg">
		</div>
		<div class="Evening">
			<p>Evening</p>
		</div>
	</div>
	<script src="js/fadein.js"></script>
</body>
</html>