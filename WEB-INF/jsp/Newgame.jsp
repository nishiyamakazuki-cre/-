<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="http://localhost:8080/hamujiro/css/Newgame.css">
<meta charset="UTF-8">
<title>Lovesong wo sagashite</title>
</head>
<body>
	<div class=wrap>
		<form method="POST" action="Main" class="a">
			<div>
				あなたのなまえをいれてね! <input type="text" name="name" class="name" maxlength="15"
					required>
			</div>
			<input type="submit" value="けってい！" class="command"> <input
				type="reset" value="とりけし" class="command">
		</form>
		<div class=back>
			<img src=img/nyuryoku.jpg>
		</div>
		<div class=msg>
			<p>どすこい！ハム次郎の世界へようこそ！
		</div>
	</div>
</body>
</html>