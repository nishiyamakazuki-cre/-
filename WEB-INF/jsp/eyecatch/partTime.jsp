<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet"
	href="http://localhost:8080/hamujiro/css/fadeout.css">


<title>now loading</title>
</head>
<body>
	<div class="fade-out">now loading...</div>
	<div class="tips">
		<br>ハム知識 :実はダッシュが好き
	</div>
	<script type="text/javascript">
		setTimeout(
				function() {
					// actionパラメータを含んだURLにリダイレクト
					window.location.href = "http://localhost:8080/hamujiro/Main?action=partTime2";
				}, 2000);
	</script>
</body>
</html>