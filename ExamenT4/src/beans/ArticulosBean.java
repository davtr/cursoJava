package beans;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;

public class ArticulosBean {

	private int numarti;
	private String resumen;
	private String descripcion;
	private String PVP;
	private int stock;
	private static List<ArticulosBean> datosArti = new ArrayList<ArticulosBean>();

	public ArticulosBean() {

	}

	public ArticulosBean(int numarti, String resumen, String descripcion, String PVP, int stock) {
		super();
		this.numarti = numarti;
		this.resumen = resumen;
		this.descripcion = descripcion;
		this.PVP = PVP;
		this.stock = stock;

	}

	public int getNumarti() {
		return numarti;
	}

	public void setNumarti(int numarti) {
		this.numarti = numarti;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPVP() {
		return PVP;
	}

	public void setPVP(String pVP) {
		PVP = pVP;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public static List<ArticulosBean> getDatosArti() {
		return datosArti;
	}

	public static void setDatosArti(List<ArticulosBean> datosArti) {
		ArticulosBean.datosArti = datosArti;
	}

}
