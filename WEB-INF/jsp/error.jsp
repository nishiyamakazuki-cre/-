<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="http://localhost:8080/hamujiro/css/error.css">
<title>error</title>
</head>
<body>
	<div class=wrap>
		<div class=msg>
			<p>データがありません！</p>
			<br>
			<p>タイトルに戻ります。</p>
			<br>
		</div>
	</div>

	<script type="text/javascript">
		// 5秒後に別のページにリダイレクト
		setTimeout(function() {
			window.location.href = "http://localhost:8080/hamujiro/title.jsp"; // リダイレクト先のURL
		}, 5000); // 5000ミリ秒 = 5秒
	</script>
</body>
</html>