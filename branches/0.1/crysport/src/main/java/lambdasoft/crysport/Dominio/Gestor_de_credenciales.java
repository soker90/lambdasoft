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
				System.out.println("Comparacion");
				System.out.println(rs.getString(1) + rs.getString(2));
				System.out.println(usuario + pass);
				if(rs.getString(1).equals(usuario)  && rs.getString(2).equals(pass)){
					System.out.println("Comparacion usuario pass");
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