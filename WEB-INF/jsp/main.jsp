<%--
/**
*******************************************************************************
* クラス名　　：main.jsp
* プログラム名：main
* 処理概要　　：リンク先に指示を渡し、結果を表示する。
* 　　　　　　：
* パラメタ　　：void
* 戻り値　　　：void
*******************************************************************************
* 新規作成
*------------------------------------------------------------------------------
* バージョン　：1.0
* 作成日　　　：2024/09/26
* 作成者　　　：西山　和希
*******************************************************************************
* 変更履歴
*------------------------------------------------------------------------------
* 変更内容　　：
* 　　　　　　：
* バージョン　：
* 変更日　　　：YYYY/MM/DD
* 変更者　　　：
*******************************************************************************
*/
 --%>



<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="model.test" import="model.hamster"
	import="model.character"%>
<%
test msg = (test) session.getAttribute("msg");
hamster ham = (hamster) session.getAttribute("ham");
character chr = (character) session.getAttribute("chr");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メイン画面</title>
</head>
<body>
	<a href="Main?action=eat">えさやり</a>:
	<br>
	<a href="Main?action=drink">みずやり</a>:
	<br>
	<a href="Main?action=clean">おそうじ</a>:
	<br>
	<a href="Main?action=touch">なでなで</a>:
	<br>
	<a href="Main?action=partTime">おしごと</a>:
	<br>
	<a href="Main?action=bathTime">せんとう</a>:
	<br>
	<a href="Main?action=dosukoi">どすこい</a>:
	<br>
	<a href="Main?action=Item">どうぐ</a>:
	<br>
	<a href="Main?action=shop">かいもの</a>:
	<br>
	<a href="Main?action=save">セーブ</a>:
	<br>
	<a href="Main?action=test">テスト</a>:
	<br>


	<p>
		ハム次郎 :
		<%=msg.getMs_result()%><br>
	<p>
		なつき度 :
		<%=ham.getLove()%><br>
	<p>
		空腹度 :
		<%=ham.getHungry()%><br>
	<p>
		清潔度 :
		<%=ham.getClean()%><br>
	<p>
		渇き度 :
		<%=ham.getWater()%><br>
	<p>
		スタミナ :
		<%=ham.getStamina()%><br>
	<p>
		ガッツ :
		<%=ham.getGuts()%><br>
	<p>
		パワー :
		<%=ham.getPower()%><br>
	<p>
		スキル :
		<%=ham.getSkill()%><br>
	<p>
		見た目 :
		<%=ham.getVisual()%><br>
	<p>
		おかね :
		<%=chr.getMoney()%><br>
	<p>
		体力 :
		<%=chr.getHP()%><br>
	<p>
		AP :
		<%=ham.getAP()%><br>
</body>
</html>