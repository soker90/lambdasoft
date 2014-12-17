package es.uclm.esi.lambdasoft.dominio;

import java.sql.ResultSet;

public class Competicion {
	private String id;
	private String fecha;
	private String organizador;
	private String modalidad;
	private GestorDeCompeticiones gestorCompeticiones;

	public Competicion(String id, String fecha, String organizador, String modalidad) {
		this.id=id.replace("\'", "");
		this.fecha=fecha.replace("\'", "");
		this.organizador=organizador.replace("\'", "");
		this.modalidad=modalidad.replace("\'", "");
	}
	
	public Competicion(String id){
		this.id=id;
	}
	
	public GestorDeCompeticiones getCompeticiones(){
		return this.gestorCompeticiones;
	}
	
	public boolean delete() throws Exception{
		return GestorDeCompeticiones.BorrarCompeticion(Integer.parseInt(this.id));
	}
	
	public boolean insert() throws Exception{
		return GestorDeCompeticiones.InsertarCompeticion(this.id,this.fecha,this.organizador,this.modalidad);
	}
	
	public boolean update() throws Exception{
		return GestorDeCompeticiones.ModificarCompeticion(this.id,this.fecha,this.organizador,this.modalidad);
	}
	
	public ResultSet selectAll() throws Exception{
		return GestorDeCompeticiones.SeleccionarTodo();
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