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

List<itemBox> list = (List<itemBox>) request.getAttribute("itemList");
List<itemBox> Items = new ArrayList<itemBox>();

for (int i = 0; i < list.size(); i++) {
	if (list.get(i).getAmount() > 0) {
		itemBox IB = list.get(i);
		Items.add(IB);
	}
}
//表示するアイテムの範囲を計算
int start = (currentPage - 1) * itemsPerPage;
int end = Math.min(start + itemsPerPage, Items.size());

int totalPages = (int) Math.ceil(Items.size() / (double) itemsPerPage);

List<itemBox> pageItems = Items.subList(start, end);
%>
<html>
<head>
<meta charset="UTF-8">
<title>itemBox</title>
<link rel="stylesheet" href="http://localhost:8080/ham/css/itemBox.css">
</head>
<body>

	<div class="wrapBox">
		<div class="backBox">
			<img src="img/アイテムボックス画面.jpg">
		</div>
		<div class="itemBox">
			<%
			int j = 0;
			for (int i = 0; i < pageItems.size(); i++) {
			%>
			<p>
				<a
					href="Main?action=useItem,<%=pageItems.get(i).getItem_num()%>&currentPage=<%=currentPage%>">
					<%=pageItems.get(i).getName()%>
				</a> <br>

			</p>
			<%
			j++;
			}
			if (j == 0) {
			%>
			<a>アイテムがありません！！</a>
			<%
			}
			%>
		</div>
		<div class="modoru2">
			<a href="Main?action=return">戻る</a>
		</div>
		<div class="zengo">
			<%
			if (currentPage > 1) {
			%>
			<a href="itemBox
				?currentPage=<%=currentPage - 1%>">前へ</a>
			<%
			}
			%>

			<%
			if (currentPage < totalPages) {
			%>
			<a href="itemBox?currentPage=<%=currentPage + 1%>">次へ</a>
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