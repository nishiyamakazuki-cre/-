/**
*******************************************************************************
\* クラス名　　：Main.servlet
* プログラム名：main
* 処理概要　　：servlet基本処理。情報処理を行う
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

package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import model.decrease;
import model.main;
import model.shop;
import model.test;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		String ms_result = "へけっ";
		String forwardPath = "WEB-INF/jsp/mainsp.jsp";
		shop shop = new shop();
		int item_num = 0;
		int flag = 0;
		String pageParam = request.getParameter("currentPage");
		int page = (pageParam == null) ? 1 : Integer.parseInt(pageParam);

		HttpSession session = request.getSession();

		//		M_ham ham = new M_ham(0,50,30,20,10,10,10,10,0,3);
		//		Character chr =new Character(); 

		//		itemBox item = new itemBox();

		if (action == null) {
			flag = 1;

		} else {

			if (action.contains(",")) {
				String[] a = action.split(",");
				action = a[0];
				item_num = Integer.parseInt(a[1]);
			}

			switch (action) {
			case "eat"://餌やりコマンド。
				ms_result = main.H.hungry();
				break;
			case "drink"://みずやりコマンド
				ms_result = main.H.water();
				break;
			case "clean"://おそうじコマンド
				ms_result = main.H.clean();
				break;
			case "touch"://なでなでコマンド
				ms_result = main.H.touch();
				break;
			case "bathTime"://お風呂コマンド
				ms_result = main.C.bathTime();
				break;
			case "partTime"://お仕事コマンド
				ms_result = main.C.partTime();
				break;
			case "Item"://道具コマンド（だいじなものと統合するかも？）
				forwardPath = "WEB-INF/jsp/eyecatch/item.jsp";
				flag = 1;
				break;
			case "Item2":
				session.setAttribute("shop", shop);
				forwardPath = "WEB-INF/jsp/itemBox.jsp";
				flag = 1;
				break;
			case "useItem"://使う（道具）コマンド（だいじなものと統合するかも？）
				//item_num = Integer.parseInt(request.getParameter("num"));
				ms_result = main.IA.action(item_num);
				forwardPath = "WEB-INF/jsp/itemBox.jsp";
				flag = 1;
				break;
			case "shop"://おみせコマンド
				request.setAttribute("currentPage", page);
				session.setAttribute("shop", shop);
				forwardPath = "WEB-INF/jsp/eyecatch/shop.jsp";
				flag = 1;
				break;
			case "shop2":
				forwardPath = "WEB-INF/jsp/shop.jsp";
				flag = 1;
				break;
			case "buy"://購入コマンド
				request.setAttribute("currentPage", page);
				ms_result = shop.buy_item(item_num);
				forwardPath = "WEB-INF/jsp/shop.jsp";
				flag = 1;
				break;
			case "dosukoi"://どすこいコマンド、相撲部屋へ
				forwardPath = "WEB-INF/jsp/eyecatch/dosukoi.jsp";
				flag = 1;
				break;
			case "dosukoi2":
				forwardPath = "WEB-INF/jsp/dosukoi/dosukoi.jsp";
				ms_result = "どすこいっ";
				flag = 1;
				break;
			case "start":
				forwardPath = "WEB-INF/jsp/eyecatch/start.jsp";
				main.GD.initialized();
				main.CD.initialized();
				main.CD.loadCharData();
				main.MD.initialized();
				main.MD.loadMhamData();
				main.ED.initialized();
				main.ED.loadEhamData();
				main.ID.initialized();
				main.ID.loadItemData();
				main.ESC.setEnemyLevel(1, 2, 3);
				main.ESC.enemyTraining();
				flag = 1;
				break;
			case "start2":
				flag = 1;
				break;
			case "continue":
				forwardPath = "WEB-INF/jsp/eyecatch/continue.jsp";
				main.CD.loadCharData();
				main.MD.loadMhamData();
				main.ED.loadEhamData();
				main.ID.loadItemData();
				flag = 1;
				break;
			case "continue2":
				flag = 1;
				break;
			case "return":
				forwardPath = "WEB-INF/jsp/eyecatch/return.jsp";
				flag = 1;
				break;
			case "return2":
				main.H.setAP(main.H.getAP() - 1);
				request.removeAttribute("shop");
				break;
			case "save":
				main.CD.saveCharData();
				main.MD.saveMhamData();
				main.ED.saveEhamData();
				main.ID.saveItemData();
				ms_result = "セーブしたへけ";
				flag = 1;
				break;
			}

		}

		if (main.H.getAP() <= 0) {
			main.ESC.WinCountLogic();
			main.ESC.enemyTraining();
			main.H.AutoFlag();

			//			night night = new night();
			//			ms_result += " \n" + night.yoru();
			forwardPath = "WEB-INF/jsp/yoru/yu-gata.jsp";
		}

		test test = new test();
		test.setMs_result(ms_result);

		if (flag == 0) {
			decrease.dec();
		}
		session.setAttribute("msg", test);
		session.setAttribute("ham", main.H);
		session.setAttribute("chr", main.C);
		request.setAttribute("itemList", main.IL.itemList);

		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath);
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
