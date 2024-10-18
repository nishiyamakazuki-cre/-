<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="model.test"%>
<%@ page import="model.itemBox"%>
<%@ page import="model.itemList"%>
<%
test msg = (test) session.getAttribute("msg");
int itemsPerPage = 5; // 1ページに表示するアイテム数
int currentPage = 1; // デフォルトで1ページ目を表示
if (request.getParameter("currentPage") != null) {
	currentPage = Integer.parseInt(request.getParameter("currentPage"));
}

// 全アイテムのリスト（仮想データ）
List<itemBox> list = (List<itemBox>) request.getAttribute("itemList");

// 表示するアイテムの範囲を計算
int start = (currentPage - 1) * itemsPerPage;
int end = Math.min(start + itemsPerPage, list.size());

int totalPages = (int) Math.ceil(list.size() / (double) itemsPerPage);

// 表示するアイテムをサブリストで抽出
List<itemBox> pageItems = list.subList(start, end);
%>
<html>
<head>
<meta charset="UTF-8">
<title>itemShop</title>
<link rel="stylesheet" href="http://localhost:8080/ham/css/shop.css">
</head>
<body>


	<div class="wrapShop">
		<div class="backshop">
			<img src="img/ショップ画面.jpg">
		</div>
		<div class="item">
			<%
			if (currentPage == 1) {
			%>
			<a>トレーニングアイテム</a> <br>
			<%
			}
			if(currentPage == 3){
			%>
			<a>消費アイテム</a><br>
			<%
			}
			for (int i = 0; i < pageItems.size(); i++) {
			%>
			<p>
				<a
					href="Main?action=buy,<%=(currentPage - 1) * 5 + i%>&currentPage=<%=currentPage%>">
					<%=pageItems.get(i).getName()%></a> &nbsp:&nbsp<%=pageItems.get(i).getItem_val()%>
				円
			</p>
			<%
			}
			%>
		</div>
		<div class="modoru">
			<a href="Main?action=return">戻る</a>
		</div>
		<div class="zengo">
			<%
			if (currentPage > 1) {
			%>
			<a href="shop
				?currentPage=<%=currentPage - 1%>">前へ</a>
			<%
			}
			%>

			<%
			if (currentPage < totalPages) {
			%>
			<a href="shop?currentPage=<%=currentPage + 1%>">次へ</a>
			<%
			}
			%>
		</div>

		<div class="hamcomment">
			<p>
				<%=msg.getMs_result()%><br>
			</p>
			<div></div>
		</div>
		<div class=hukidasi>
			<img src="img/吹き出し.png">
		</div>
		<div class="hamname">
			<p>ハム次郎</p>
		</div>
	</div>

	<div class=audio>
		<audio id="bgm" autoplay loop>
			<source src="http://localhost:8080/ham/bgm/ねこワークショップ.mp3"
				type="audio/mpeg">
			<p>サイトの設定で音楽が流れません。</p>
		</audio>
	</div>
	<script src="js/bgm.js"></script>
</body>
</html>