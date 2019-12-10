package buscaDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.PersonaBean;

public class LoginDAO {

	public LoginDAO() {
	}

	static String nombrecompl = "";

	public boolean complog(String nomuser, String pass) {
		boolean login = false;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/examt4?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Madrid",
					"root", "");
			PersonaBean personaBean = new PersonaBean();
			// busqueda del password en logagenda
			PreparedStatement ps = c.prepareStatement("Select * from loguser where nombre = (?)");
			ps.setString(1, nomuser);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				if (pass.contentEquals(rs.getString("pin"))) {
					// Si el password es correcto, devolvemos true
					login = true;
					nombrecompl = (rs.getString("nomapell"));
				}

			}
			// cerramos las listas utilizadas

			ps.close();
			c.close();
			rs.close();

			// controlamos posibles excepciones
		} catch (Exception e) {
			System.out.print("Error en BBDD");
			e.printStackTrace();
		}
		return login;

	}

	public String cogerDatos() {
		return nombrecompl;

	}

	public static String getNombrecompl() {
		return nombrecompl;
	}

	public void setNombrecompl(String nombrecompl) {
		this.nombrecompl = nombrecompl;
	}

}