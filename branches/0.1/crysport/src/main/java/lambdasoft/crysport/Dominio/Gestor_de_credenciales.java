package lambdasoft.crysport.Dominio;

import java.sql.ResultSet;
import java.sql.SQLException;

import lambdasoft.crysport.Persistencia.Agente;



public class Gestor_de_credenciales {

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}

	public void FormGestCompeticiones() {
		throw new UnsupportedOperationException();
	}
}