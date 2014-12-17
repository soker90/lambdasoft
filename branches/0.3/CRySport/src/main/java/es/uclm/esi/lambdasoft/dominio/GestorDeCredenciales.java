package es.uclm.esi.lambdasoft.dominio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import es.uclm.esi.lambdasoft.persistencia.Agente;

public class GestorDeCredenciales {
	private static String user = null;

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
		String conexion = null;
		try {
			ResultSet rs = Agente.getAgente().select("SELECT fecha FROM conexion WHERE username=\"" + user+"\"");

			rs.next();
			conexion = rs.getString(1);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conexion;
	}

	public void FormGestCompeticiones() {
		throw new UnsupportedOperationException();
	}
}