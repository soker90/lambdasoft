package es.uclm.esi.lambdasoft.dominio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import es.uclm.esi.lambdasoft.persistencia.Agente;

public class GestorDeCredenciales {
	private static String user = null;
	private static Date fecha = null;

	public static boolean ComprobarLogin(String usuario, String pass) {
		boolean resultado=false;
		try {
			ResultSet rs = Agente.getAgente().select("SELECT * FROM usuarios");

			while (rs.next())
			{
				if(rs.getString(1).equals(usuario)  && rs.getString(2).equals(pass)){
                                    resultado= true;
                                    user = usuario;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public static String ultimaConexion() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String conexion = null;
		if(fecha == null){
			try {
				ResultSet rs = Agente.getAgente().select("SELECT fecha FROM conexion WHERE username=\"" + user+"\"");
	
				rs.next();
				conexion = rs.getString(1);
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			Date fecha = new Date();
			String fechaConFormato = sdf.format(fecha);  
			
	        try {
	            Agente.getAgente().insert("UPDATE conexion SET  fecha=" + "\"" + fechaConFormato + "\"" + " WHERE username=\""+user+"\"");
	        } catch (SQLException e) {
	                e.printStackTrace();
	        } catch (Exception e) {
	                e.printStackTrace();
	        }
		}else{
			conexion = sdf.format(fecha);
		}
		return conexion;
	}

	public void FormGestCompeticiones() {
		throw new UnsupportedOperationException();
	}
}