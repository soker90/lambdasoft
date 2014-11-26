package lambdasoft.crysport.Dominio;

public class Usuario {
	private String idUsuario;
	private String clave;
	private String nombre;
	
	public Usuario(String idUsuario,String clave,String nombre){
		this.idUsuario=idUsuario;
		this.clave=clave;
		this.nombre=nombre;
	}
	
	public String getidUsuario(){
		return this.idUsuario;
	}
	
	public void setidUsuario(String id){
		this.idUsuario=id;
	}
	
	public String getClave(){
		return this.clave;
	}
	
	public void setClave(String c){
		this.clave=c;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String n){
		this.nombre=n;
	}
	
}
