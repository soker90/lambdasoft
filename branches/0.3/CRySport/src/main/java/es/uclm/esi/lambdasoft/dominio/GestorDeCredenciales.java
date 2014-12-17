package es.uclm.esi.lambdasoft.dominio;

import java.sql.ResultSet;
import java.sql.SQLException;

import es.uclm.esi.lambdasoft.persistencia.Agente;

public class GestorDeCredenciales {

	public static boolean ComprobarLogin(String usuario, String pass) {
		boolean resultado=false;
		try {
			ResultSet rs = Agente.getAgente().select("SELECT * FROM usuarios");

			while (rs.next())
			{
				if(rs.getString(1).equals(usuario)  && rs.getString(2).equals(pass)){
                                    resultado= true;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}

	public void FormGestCompeticiones() {
		throw new UnsupportedOperationException();
	}
}