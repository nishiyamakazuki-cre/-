<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.test"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>zombie</title>
<link rel="stylesheet"
	href="http://localhost:8080/hamujiro/css/zombie.css">
</head>
<body>
	<div class=wrap4>
		<div class=niku>
			<img src="img/niku2.png">
		</div>
		<div class=ham>
			<img
				src="https://1.bp.blogspot.com/-hunVODuHQFM/YLrPqtfnUmI/AAAAAAABd1Q/Jq88rlxxG28urM0ddy9_rLt4E2-_fT2BACNcBGAsYHQ/s644/animal_hamster.png">
		</div>
		<div class=zzz>
			<img src="img/zombie.jpg">
		</div>
		<div class=yoru>
			<p>ゾンビになりました[¬º-°]¬</p>
		</div>
		<div class=a>
			<a href="Main?action=zombie">次へ</a>
		</div>
	</div>
	<div class=audio>
		<audio id="bgm" autoplay>
			<source src="http://localhost:8080/hamujiro/bgm/zombie.mp3"
				type="audio/mpeg">
			<p>サイトの設定で音楽が流れません。</p>
		</audio>
	</div>
	<script src="js/bgm.js"></script>
</body>
</html>