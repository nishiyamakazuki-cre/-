<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet"
	href="http://localhost:8080/hamujiro/css/taisenn.css">

<title>now loading tuyoi</title>
</head>
<body>
	<div class=wrap>
		<div class=back>
			<img src=img/参戦.jpg>
		</div>
		<div class=aite>
			<img src=img/どすこい強い.jpeg>
		</div>
		<div class=name>
			<p>ハム道山</p>
		</div>
	</div>
	<script type="text/javascript">
		setTimeout(
				function() {
					// actionパラメータを含んだURLにリダイレクト
					window.location.href = "http://localhost:8080/hamujiro/dosukoi?action=battle_HD1";
				}, 5000);
	</script>
	<audio id="bgm" autoplay loop>
		<source
			src="http://localhost:8080/hamujiro/bgm/nc246081_【スマブラSP】_参戦効果音.wav"
			type="audio/mpeg">
		<p>サイトの設定で音楽が流れません。</p>
	</audio>
</body>
</html>