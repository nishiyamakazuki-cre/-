<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
<link rel="stylesheet" href="http://localhost:8080/ham/css/index.css">
</head>
<body>
	<div class=wrap>
		<div class=start>
			<a href="Main?action=start">はじめから</a> <br>
		</div>
		<div class=continue>
			<a href="Main?action=continue">つづきから</a> <br>
		</div>
	</div>
	<div class=ham>
		<img src="img/animal_hamster.png">
	</div>
	<div class=tyanko>
		<img = src="img/tyanko.jpg">
	</div>
	<div class=title>
		<p>
			どすこい！<br> &nbspハム次郎
		</p>
	</div>
	<div class=audio>
		<audio autoplay loop>
			<source src="http://localhost:8080/ham/bgm/Pussycat.mp3"
				type="audio/mpeg">
			<p>サイトの設定で音楽が流れません。</p>
		</audio>
	</div>
</body>
</html>