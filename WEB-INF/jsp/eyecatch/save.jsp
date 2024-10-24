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


<title>now loading</title>
</head>
<body>
	<div class="fade-out">now loading...</div>

	<div class="tips">
		<br>ハム知識 :ストレスがたまると餌もたまる。
	</div>
	<script>
		// ページ読み込み後にフェードの繰り返しを開始
		startFadeLoop();
	</script>
	<script type="text/javascript">
		setTimeout(
				function() {
					// actionパラメータを含んだURLにリダイレクト
					window.location.href = "http://localhost:8080/hamujiro/Main?action=save2";
				}, 2000);
	</script>
</body>
</html>