package lambdasoft.crysport.Dominio;

public class Competicion {
	private String id;
	private String fecha;
	private String organizador;
	private String modalidad;
	private Gestor_de_competiciones gestorCompeticiones;

	public Competicion(String id, String fecha, String organizador, String modalidad) {
		this.id=id;
		this.fecha=fecha;
		this.organizador=organizador;
		this.modalidad=modalidad;
		this.gestorCompeticiones=new Gestor_de_competiciones();
		throw new UnsupportedOperationException();
	}
	
	public Gestor_de_competiciones getCompeticiones(){
		return this.gestorCompeticiones;
	}
	
	public void insert(){
		this.gestorCompeticiones.InsertarCompeticion(this);
	}
	
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
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