<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.test"%>
<%
test msg = (test) session.getAttribute("msg");
String a = msg.getMs_result();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>夜</title>
<link rel="stylesheet"
	href="http://localhost:8080/hamujiro/css/night.css">
<meta http-equiv="refresh"
	content="5;url=http://localhost:8080/hamujiro/night">
</head>
<body>

	<div class=wrap>
		<div class=nightBack>
			<img src="img/夜画面背景wow.jpg">
		</div>
		<!--		<div class=night>-->
		<!--			<img-->
		<!--				src="https://www.illust-box.jp/db_img/sozai/00010/105289/watermark.jpg">-->
		<!--		</div>-->
		<div class=ham>
			<img
				src="https://1.bp.blogspot.com/-hunVODuHQFM/YLrPqtfnUmI/AAAAAAABd1Q/Jq88rlxxG28urM0ddy9_rLt4E2-_fT2BACNcBGAsYHQ/s644/animal_hamster.png">
		</div>
		<div class=zzz>
			<img
				src="https://thumb.ac-illust.com/ac/ac3534e74c4addc40df07a7146c8990e_w.jpeg">
		</div>
		<div class=yoru>
			<p>夜になりました🌙</p>
		</div>
		<div class="moji">
			<p>Night</p>
		</div>
		<div class=moon>
			<img src="img/月.jpg">
		</div>
		<div class="toudai">
			<img src="img/灯台.jpeg">
		</div>
		<div class="butterfly">
			<img src="img/蝶々.webp">
		</div>
	</div>
	<div class=audio>
		<audio id="bgm" autoplay loop>
			<source src="http://localhost:8080/hamujiro/bgm/宿屋-ドラクエ.mp3"
				type="audio/mpeg">
			<p>サイトの設定で音楽が流れません。</p>
		</audio>
	</div>
	<script src="js/fadein.js"></script>
</body>
</html>