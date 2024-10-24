<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.hamster"%>
<%
hamster ham = (hamster) session.getAttribute("ham");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet"
	href="http://localhost:8080/hamujiro/css/fadeout.css">
<script src="fadeLoop.js"></script>
<!-- JavaScriptファイルを読み込み -->
<script>
	// ページ読み込み後にフェードの繰り返しを開始
	startFadeLoop();
</script>

<title>now loading</title>
</head>
<body>
	<div class="fade-loop">now loading...</div>
	<div class="tips">
		<br>ハム知識 :ゾンビ注意報発令中
	</div>


	<script type="text/javascript">
		setTimeout(
				function() {
					// actionパラメータを含んだURLにリダイレクト
					window.location.href = "http://localhost:8080/hamujiro/Main?action=continue2";
				}, 2000);
	</script>
</body>
</html>