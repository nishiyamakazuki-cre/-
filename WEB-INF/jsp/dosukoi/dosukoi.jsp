<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.test" import="model.hamster" import="model.main"%>
<!DOCTYPE html>
<%
test msg = (test) session.getAttribute("msg");
hamster ham = (hamster) session.getAttribute("ham");

String[] w_rank = main.EH1.getStatusRank();
String[] n_rank = main.EH2.getStatusRank();
String[] s_rank = main.EH3.getStatusRank();
%>
<html>
<head>
<meta charset="UTF-8">
<title>dosukoi</title>
<link rel="stylesheet" href="http://localhost:8080/ham/css/dosukoi.css">
</head>
<body>
	<div class=wrap2>
		<div class=back>
			<img src="img/相撲部屋背景.jpeg">
		</div>
		<div class=hamuchan>
			<img src="img/animal_hamster.png">
		</div>
		<div class=hukidasi>
			<img src="img/吹き出し.png">
		</div>
		<div class=wrap3>
			<ul class="gnav">
				<li><a href="#">大一番！</a>
					<ul>
						<li><a href=dosukoi?action=battle_EZ>やさしい</a>
							<ul>
								<li><a href="#">すたみな&nbsp :<%=w_rank[0]%></a></li>
								<li><a href="#">ぱわ～&nbsp&nbsp :<%=w_rank[1]%></a></li>
								<li><a href="#">こんじょう :<%=w_rank[2]%></a></li>
								<li><a href="#">ぎじゅつ&nbsp :<%=w_rank[3]%></a></li>
							</ul></li>
						<li><a href=dosukoi?action=battle_NL>ふつう</a>
							<ul>
								<li><a href="#">すたみな&nbsp :<%=n_rank[0]%></a></li>
								<li><a href="#">ぱわ～&nbsp&nbsp :<%=n_rank[1]%></a></li>
								<li><a href="#">こんじょう :<%=n_rank[2]%></a></li>
								<li><a href="#">ぎじゅつ&nbsp :<%=n_rank[3]%></a></li>
							</ul></li>
						<li><a href=dosukoi?action=battle_HD>つよい</a>
							<ul>
								<li><a href="#">すたみな&nbsp :<%=s_rank[0]%></a></li>
								<li><a href="#">ぱわ～&nbsp&nbsp :<%=s_rank[1]%></a></li>
								<li><a href="#">こんじょう :<%=s_rank[2]%></a></li>
								<li><a href="#">ぎじゅつ&nbsp :<%=s_rank[3]%></a></li>
							</ul></li>
					</ul></li>
				<li><a href="#">きたえる</a>
					<ul>
						<li><a href=dosukoi?action=tyanko>ちゃんこ</a></li>
						<li><a href=dosukoi?action=massle>きんとれ</a></li>
						<li><a href=dosukoi?action=run>だっしゅ</a></li>
						<li><a href=dosukoi?action=zen>めいそう</a></li>
					</ul></li>
			</ul>
		</div>
		<div class="komento">
			<p><%=msg.getMs_result()%><br>
			</p>
		</div>
		<div class=tyanko>
			<img = src="img/tyanko.jpg">
		</div>
		<div class="parameter">
			<p>
				スタミナ :
				<%=ham.getStamina()%><br> パワー :
				<%=ham.getPower()%><br> ガッツ :
				<%=ham.getGuts()%><br>スキル :
				<%=ham.getSkill()%><br> <br>残り行動回数 :
				<%=ham.getAP()%><br>
			</p>
		</div>
		<div class="hamname">
			<p>ハム次郎</p>
		</div>
	</div>
	<div class=audio>
		<audio id="bgm" autoplay loop>
			<source src="http://localhost:8080/ham/bgm/ゆる散歩マーチ.mp3"
				type="audio/mpeg">
			<p>サイトの設定で音楽が流れません。</p>
		</audio>
	</div>
</body>
</html>