<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>gameover</title>
<link rel="stylesheet"
	href="http://localhost:8080/hamujiro/css/gameover.css">
<script type="text/javascript">
	// 5秒後に別のページにリダイレクト
	setTimeout(function() {
		window.location.href = "http://localhost:8080/hamujiro/title.jsp"; // リダイレクト先のURL
	}, 5000); // 5000ミリ秒 = 5秒
</script>
</head>
<body>
	<div class=wrap3>
		<div class=gameover>
			<img src="img/gameover.jpeg">
		</div>
		<div class=ham>
			<img
				src="https://1.bp.blogspot.com/-hunVODuHQFM/YLrPqtfnUmI/AAAAAAABd1Q/Jq88rlxxG28urM0ddy9_rLt4E2-_fT2BACNcBGAsYHQ/s644/animal_hamster.png">
		</div>
		<div class=zzz>
			<img src="img/ぴ円.jpg">
		</div>
		<div class=yoru>
			<p>猫につかまっちゃいました．．．</p>
		</div>
	</div>
</body>
</html>
