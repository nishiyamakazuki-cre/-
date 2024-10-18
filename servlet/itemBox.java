package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.main;

/**
 * Servlet implementation class itemBox
 */

@WebServlet("/itemBox")
public class itemBox extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// ページ番号を取得
		String pageParam = request.getParameter("currentPage");
		int page = (pageParam == null) ? 1 : Integer.parseInt(pageParam);

		// 必要なロジックやデータを設定
		request.setAttribute("currentPage", page);
		request.setAttribute("itemList", main.IL.itemList);

		// WEB-INF内のshop.jspにフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/itemBox.jsp");
		dispatcher.forward(request, response);
	}
}
