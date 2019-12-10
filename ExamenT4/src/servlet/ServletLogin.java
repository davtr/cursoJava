package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import buscaDAO.LoginDAO;

@WebServlet(name = "ServletLogin", urlPatterns = "/login")
public class ServletLogin extends HttpServlet {

	LoginDAO loginDAO = new LoginDAO();
	boolean login = false;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);

		// extraemos del formulario el nombre y la contraseña introducida
		String nomuser = request.getParameter("nomuser");
		String pass = request.getParameter("pass");

		// Verificamos que tanto el nombre como la contraseña tienen datos
		if (nomuser == null & pass == null) {
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			rd.include(request, response);
		}

		// Ejecutamos el método de búsqueda en la BBDD de LoginDAO
		login = loginDAO.complog(nomuser, pass);

		if (login) {
			session.setAttribute("user", request.getParameter("user"));

			RequestDispatcher rd = request.getRequestDispatcher("bienvenida.jsp");
			rd.forward(request, response);

			// Si el resultado de UserDAO es false redirige errorlog para que vuelva
			// a introducir credenciales
		} else {

			RequestDispatcher rd = request.getRequestDispatcher("/errorlog.jsp");
			rd.forward(request, response);
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
