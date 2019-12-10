package beans;

public class CestaBean {
	private String articulo;
	private String PVP;

	public CestaBean() {

	}

	public CestaBean(String articulo, String PVP) {
		this.articulo = articulo;
		this.PVP = PVP;
	}

	public String getArticulo() {
		return articulo;
	}

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	public String getPVP() {
		return PVP;
	}

	public void setPVP(String pVP) {
		PVP = pVP;
	}

}