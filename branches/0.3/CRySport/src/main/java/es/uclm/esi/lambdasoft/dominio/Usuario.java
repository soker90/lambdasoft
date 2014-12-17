package es.uclm.esi.lambdasoft.dominio;

public class Usuario 
{
	private String clave;
	private String nombre;
 
	public Usuario(String clave,String nombre)
	{
		this.nombre=nombre.replace("\'", "");
		this.clave=clave.replace("\'", "");
	}
 
	public String getClave()
	{
		return this.clave;
	}
 
	public void setClave(String c)
	{
		this.clave=c;
	}
 
	public String getNombre()
	{
		return this.nombre;
	}
	public void setNombre(String n)
	{
		this.nombre=n;
	}
		 
	public boolean select()
	{
		return GestorDeCredenciales.ComprobarLogin(this.nombre,this.clave);
	}
}
