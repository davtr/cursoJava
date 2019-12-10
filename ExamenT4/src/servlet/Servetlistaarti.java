package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.ArticulosBean;
import buscaDAO.LoginDAO;
import buscaDAO.StockDAO;

@WebServlet(name = "Servetlistaarti", urlPatterns = "/lisarti")
public class Servetlistaarti extends HttpServlet {
	StockDAO stockDao = new StockDAO();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);

		List<ArticulosBean> artiBd = stockDao.datosArti();
		String nombrecompl = LoginDAO.getNombrecompl();

		session.setAttribute("artiBd", artiBd);
		session.setAttribute("nombrecompl", nombrecompl);
		RequestDispatcher rd = request.getRequestDispatcher("/listaarticulos.jsp");
		rd.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
