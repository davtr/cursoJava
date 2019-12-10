package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
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

@WebServlet(name = "ServEleccion", urlPatterns = "/elec")
public class ServEleccion extends HttpServlet {

	StockDAO stockDao = new StockDAO();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);

		
		// extraemos del formulario los datos
		String eleccion = request.getParameter("eleccion");
		int i = Integer.parseInt(eleccion);

		List<ArticulosBean> artiBd = stockDao.datosArti();
		String nombrecompl = LoginDAO.getNombrecompl();

		int longelec = artiBd.size();
		if (i > longelec) {
			RequestDispatcher rd = request.getRequestDispatcher("lisarti");
			rd.forward(request, response);
		}

		session.setAttribute("artielec", artiBd.get(i - 1));
		session.setAttribute("nombrecompl", nombrecompl);

		RequestDispatcher rd = request.getRequestDispatcher("/verdetalles.jsp");
		rd.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
