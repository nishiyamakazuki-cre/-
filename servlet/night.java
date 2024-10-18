package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Night;

/**
 * Servlet implementation class night
 */

@WebServlet("/night")
public class night extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		String forwardPath = "";

		if (action == null) {
			Night night = new Night();
			String ms_result = night.yoru();
			switch (ms_result) {
			case "朝になりました":
				forwardPath = "WEB-INF/jsp/yoru/asa.jsp";
				break;
			case "ゾンビになりました":
				forwardPath = "WEB-INF/jsp/yoru/zombie.jsp";
				break;
			case "猫に連れ去られました":
				forwardPath = "WEB-INF/jsp/yoru/gameover.jsp";
				break;
			}
		} else {
			forwardPath = "WEB-INF/jsp/yoru/night.jsp";
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath);
		dispatcher.forward(request, response);

	}

}
