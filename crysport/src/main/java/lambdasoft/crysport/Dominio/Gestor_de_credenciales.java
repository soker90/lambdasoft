package lambdasoft.crysport.Dominio;

import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.sql.SQLException;

import lambdasoft.crysport.Persistencia.Agente;

public class Gestor_de_credenciales {

	public static void ComprobarLogin(String usuario, String pass) {
		System.out.print(usuario+" "+pass);
		/*try {
			ResultSet resultado = Agente.getAgente().select("SELECT * FROM `usuarios`");
			Array usuarios = resultado.getArray(0).;
			//if(resultado.getArray(0) == usuario)
	    	//String user = rs.getString(2);
			//}while(resultado.next());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	public void FormGestCompeticiones() {
		throw new UnsupportedOperationException();
	}
}