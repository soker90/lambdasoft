package es.uclm.esi.lambdasoft.dominio;

import java.sql.ResultSet;

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
	}
	
	public Competicion(String id){
		this.id=id;
	}
	
	public Gestor_de_competiciones getCompeticiones(){
		return this.gestorCompeticiones;
	}
	
	public boolean delete(){
		return Gestor_de_competiciones.BorrarCompeticion(Integer.parseInt(this.id));
	}
	
	public boolean insert(){
		return Gestor_de_competiciones.InsertarCompeticion(this.id,this.fecha,this.organizador,this.modalidad);
	}
	
	public boolean update(){
		return Gestor_de_competiciones.ModificarCompeticion(this.id,this.fecha,this.organizador,this.modalidad);
	}
	
	public ResultSet selectAll(){
		return Gestor_de_competiciones.SeleccionarTodo();
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