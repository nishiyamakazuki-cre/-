<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<br>ハム知識 :実は前歯は一生伸び続ける
	</div>

	<script type="text/javascript">
		setTimeout(
				function() {
					// actionパラメータを含んだURLにリダイレクト
					window.location.href = "http://localhost:8080/hamujiro/Main?action=return2";
				}, 2000);
	</script>
</body>
</html>