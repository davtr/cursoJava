package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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

@WebServlet(name = "ServetCesta", urlPatterns = "/cesta")
public class ServetCesta extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		session.getAttribute("articulo");
		session.getAttribute("precio");
		String elec2 = "";
		// extraemos del formulario los datos
		request.getSession().setAttribute(elec2, "articulo");

		String eleccion = request.getParameter("articulo");
		String precio = request.getParameter("precio");
		String nombre = request.getParameter("nombrecompl");
		session.setAttribute("cesta", eleccion);
		session.setAttribute("nombrecompl", nombre);

		RequestDispatcher rd = request.getRequestDispatcher("lisarti");
		rd.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
