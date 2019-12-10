package beans;

import javax.servlet.annotation.WebServlet;

public class PersonaBean {

	private String nombrecompleto;

	public PersonaBean() {
	}

	public PersonaBean(String nombrecompleto) {
		super();
		this.nombrecompleto = nombrecompleto;
	}

	public String getNombrecompleto() {
		return nombrecompleto;
	}

	public void setNombrecompleto(String nombrecompleto) {
		this.nombrecompleto = nombrecompleto;
	}

}
