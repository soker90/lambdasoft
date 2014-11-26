package lambdasoft.crysport.Dominio;

public class Competicion {
	private int id;
	private String fecha;
	private String organizador;
	private String modalidad;
	public Gestor_de_competiciones unnamed_Gestor_de_competiciones_;

	public Competicion(int id, String fecha, String organizador, String modalidad) {
		this.id=id;
		this.fecha=fecha;
		this.organizador=organizador;
		this.modalidad=modalidad;
		throw new UnsupportedOperationException();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getOrganizador() {
		return this.organizador;
	}

	public void setOrganizador(String organizador) {
		this.organizador = organizador;
	}

	public String getModalidad() {
		return this.modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}
}