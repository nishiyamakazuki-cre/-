/**
*******************************************************************************
* クラス名　　：dosukoi
* プログラム名：相撲サーブレット
* 処理概要　　：dosukoi.javaから変数winの値をもらい、その値によってjspに遷移する
* パラメタ　　：void
* 戻り値　　　：void
*******************************************************************************
* 新規作成
*------------------------------------------------------------------------------
* バージョン　：1.0
* 作成日　　　：2024/09/27
* 作成者　　　：旭　海人
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
import model.test;

/**
 * Servlet implementation class dosukoi
 */
@WebServlet("/dosukoi")
public class dosukoi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		String forwardpath = "WEB-INF/jsp/mainsp.jsp";
		String ds_msg = "";
		String win = "";

		switch (action) {
		case "battle_EZ":
			forwardpath = "WEB-INF/jsp/eyecatch/dosukoi3.jsp";
			break;
		case "battle_EZ1":
			main.D.setM_status(main.H.getStamina(), main.H.getPower(), main.H.getGuts(), main.H.getSkill());
			main.D.setE_status(main.EH1.getStamina(), main.EH1.getPower(), main.EH1.getGuts(), main.EH1.getSkill());
			main.D.statusLogic();
			win = main.D.getWinLose();
			switch (win) {
			case "0" -> {
				main.D.winStatus(0);
				forwardpath = "WEB-INF/jsp/dosukoi/dosukoiLose.jsp";
			}
			case "1" -> {
				main.ESC.setWC_EZ(1);
				main.D.winStatus(10);
				main.C.setMoney(main.C.getMoney() + 1000);
				forwardpath = "WEB-INF/jsp/dosukoi/dosukoiWin.jsp";
			}
			case "2" -> {
				main.D.winStatus(5);
				forwardpath = "WEB-INF/jsp/dosukoi/dosukoiDraw.jsp";
			}
			}
			break;
		case "battle_NL":
			forwardpath = "WEB-INF/jsp/eyecatch/dosukoi2.jsp";
			break;
		case "battle_NL1":
			main.D.setM_status(main.H.getStamina(), main.H.getPower(), main.H.getGuts(), main.H.getSkill());
			main.D.setE_status(main.EH2.getStamina(), main.EH2.getPower(), main.EH2.getGuts(), main.EH2.getSkill());
			main.D.statusLogic();
			win = main.D.getWinLose();
			switch (win) {
			case "0" -> {
				main.D.winStatus(0);
				forwardpath = "WEB-INF/jsp/dosukoi/dosukoiLose.jsp";
			}
			case "1" -> {
				main.ESC.setWC_EZ(1);
				main.ESC.setWC_NL(1);
				main.D.winStatus(15);
				main.C.setMoney(main.C.getMoney() + 3000);
				forwardpath = "WEB-INF/jsp/dosukoi/dosukoiWin.jsp";
			}
			case "2" -> {
				main.D.winStatus(5);
				forwardpath = "WEB-INF/jsp/dosukoi/dosukoiDraw.jsp";
			}
			}
			break;
		case "battle_HD":
			forwardpath = "WEB-INF/jsp/eyecatch/dosukoi1.jsp";
			break;
		case "battle_HD1":
			main.D.setM_status(main.H.getStamina(), main.H.getPower(), main.H.getGuts(), main.H.getSkill());
			main.D.setE_status(main.EH3.getStamina(), main.EH3.getPower(), main.EH3.getGuts(), main.EH3.getSkill());
			main.D.statusLogic();
			win = main.D.getWinLose();
			switch (win) {
			case "0" -> {
				main.D.winStatus(0);
				forwardpath = "WEB-INF/jsp/dosukoi/dosukoiLose.jsp";
			}
			case "1" -> {
				main.ESC.setWC_EZ(2);
				main.ESC.setWC_NL(1);
				main.ESC.setWC_HD(1);
				main.D.winStatus(20);
				main.C.setMoney(main.C.getMoney() + 5000);
				forwardpath = "WEB-INF/jsp/dosukoi/dosukoiWin.jsp";
			}
			case "2" -> {
				main.D.winStatus(5);
				forwardpath = "WEB-INF/jsp/dosukoi/dosukoiDraw.jsp";
			}
			}
			break;
		case "tyanko":
			ds_msg = main.D.training(1);
			break;
		case "massle":
			ds_msg = main.D.training(2);
			break;
		case "run":
			ds_msg = main.D.training(3);
			break;
		case "zen":
			ds_msg = main.D.training(4);
			break;
		}

		if (main.H.getAP() <= 0) {
			main.ESC.WinCountLogic();
			main.ESC.enemyTraining();
			main.H.AutoFlag();

			//			night night = new night();
			//			ms_result += " \n" + night.yoru();
			forwardpath = "WEB-INF/jsp/yoru/yu-gata.jsp";
		}

		test test = new test();
		test.setMs_result(ds_msg);

		decrease.dec();

		HttpSession session = request.getSession();
		session.setAttribute("msg", test);
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardpath);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
