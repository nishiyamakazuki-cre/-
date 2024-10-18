<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.test" import="model.hamster"
	import="model.character" import="model.main"%>
<!DOCTYPE html>
<%
test msg = (test) session.getAttribute("msg");
hamster ham = (hamster) session.getAttribute("ham");
character chr = (character) session.getAttribute("chr");
%>

<html>
<head>
<meta charset="UTF-8">
<title>新規メイン</title>
<link rel="stylesheet" href="http://localhost:8080/ham/css/main.css">
</head>
<body>


	<div class="wrap2" id="fadeElement">
		<audio id="ex" loop>
			<source
				src="http://localhost:8080/ham/bgm/tv_noise2.mp3"
				type="audio/mpeg">
		</audio>
		<div class="container">
			<button id="triggerButton"></button>
			<div id="gifContainer" class="hidden">
				<img src="img/gabigabi.gif" alt="ノイズGIF" id="noiseGif">
			</div>
			<div id="imageContainer" class="hidden">
				<img src="img/貞子.jpg" alt="怖い顔" id="scaryImage">
			</div>
		</div>
		<div class=ie>
			<img src="img/house.jpg">
		</div>
		<div class=hamuchan>
			<img src="img/animal_hamster.png">
		</div>
		<div class=hukidasi>
			<img src="img/吹き出し.png">
		</div>
		<div class=wrap3>
			<ul class="gnav">
				<li><a href="#">おせわ&nbsp&nbsp&nbsp</a>
					<ul>
						<li><a href="#" data-action="eat">えさやり</a></li>
						<li><a href="#" data-action="drink">みずやり</a></li>
						<li><a href="#" data-action="clean">おそうじ</a></li>
						<li><a hrefhref="#" data-action="touch">なでなで</a></li>
					</ul></li>
				<li><a href="#">おでかけ</a>
					<ul>
						<li><a href="#" data-action="partTime">おしごと</a></li>
						<li><a href="#" data-action="bathTime">おんせん</a></li>
					</ul></li>
				<li><a href="#">あいてむ</a>
					<ul>
						<li><a href=Main?action=Item>あいてむ</a></li>
						<li><a href=Main?action=shop>かいもの</a>
					</ul></li>
				<li><a href="#">どすこい</a>
					<ul>
						<li><a href=Main?action=dosukoi>どすこい</a></li>
					</ul></li>
				<li><a href="#">せーぶ&nbsp&nbsp&nbsp</a>
					<ul>
						<li><a href="#" data-action="save">せーぶ</a></li>
					</ul></li>
			</ul>
		</div>
		<div class="komento">
			<p><%=msg.getMs_result()%><br>
			</p>
		</div>
		<div class="parameter">
			<p>
				らぶ&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp :
				<%=ham.getLove()%><br>
				おなか&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp :
				<%=ham.getHungry()%><br> くりーん&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp :
				<%=ham.getClean()%><br>おみず&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
				:
				<%=ham.getWater()%><br> <br>所持金&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:
				<%=chr.getMoney()%><br>体力&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
				:
				<%=chr.getHP()%><br>残り行動回数 :
				<%=ham.getAP()%><br>
			</p>
		</div>
		<div class=hamname>
			<p>ハム次郎</p>
		</div>
		<div class=yourname>
			<p><%=main.C.getName()%></p>
		</div>
	</div>
	<div class=audio>
		<audio id="bgm" autoplay loop>
			<source src="http://localhost:8080/ham/bgm/今日はお散歩日和。.mp3"
				type="audio/mpeg">
			<p>サイトの設定で音楽が流れません。</p>
		</audio>
	</div>

	<script>
	 // すべてのBGMを取得
    const bgm1 = document.getElementById('bgm');
    const bgm2 = document.getElementById('ex');
    const allAudio = [bgm1, bgm2];  // すべての音楽をリストに入れる

    // 他の音楽をすべて停止する関数
    function stopAllAudio() {
        allAudio.forEach(audio => {
            audio.pause();
        });
    }

    // BGM1を再生するボタン
    document.getElementById('triggerButton').addEventListener('click', function() {
    	  if (bgm2.paused) {
    		  stopAllAudio();  // 他の音楽をすべて停止
    		    bgm2.play();  // BGM1を再生
          } else {
              bgm2.pause();  // 一時停止
          }
    });

   </script>


	<script src="js/noise.js"></script>
	<script src="js/bgm.js"></script>
	<script src="js/fadein.js"></script>
	<script src="js/fadeout.js"></script>
</body>
</html>
