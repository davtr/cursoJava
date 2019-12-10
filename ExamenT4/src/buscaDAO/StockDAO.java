package buscaDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.ArticulosBean;

public class StockDAO {

	public List<ArticulosBean> datosArti() {
		ArticulosBean articulosBean = new ArticulosBean();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/examt4?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Madrid",
					"root", "");
			PreparedStatement ps = c.prepareStatement("Select * from articulos");
			ResultSet rs = ps.executeQuery();
			List<ArticulosBean> artiBd = new ArrayList<ArticulosBean>();
			while (rs.next()) {
				artiBd.add(new ArticulosBean(rs.getInt("numarti"), rs.getString("resumen"), rs.getString("descripcion"),
						rs.getString("PVP"), rs.getInt("stock")));
			}
			// cerramos las listas utilizadas
			rs.close();
			c.close();
			return artiBd;
			// controlamos posibles excepciones
		} catch (Exception e) {
			System.out.print("Error en BBDD");
			e.printStackTrace();
		}
		return null;

	}

}
