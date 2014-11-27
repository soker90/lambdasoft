package lambdasoft.crysport.Dominio;

public class Usuario {
	private String clave;
	private String nombre;
	private Gestor_de_credenciales gestorCredenciales ;
	public Usuario(String clave,String nombre){
		this.nombre=nombre;
		this.clave=clave;
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
	
	/*public Gestor_de_credenciales getGestor(){
		return this.gestorCredenciales;
	}
	*/
	
	public boolean select(){
		return Gestor_de_credenciales.ComprobarLogin(this.nombre,this.clave);
	}
	
}
