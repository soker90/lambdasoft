package lambdasoft.crysport.Dominio;



public class Gestor_de_credenciales {

	public static boolean ComprobarLogin(String usuario, String pass) {
		/*try {
			ResultSet rs = Agente.getAgente().select("SELECT * FROM `usuarios`");
			while (rs.next())
			{
				if(rs.getString(1) == usuario)
					if(rs.getString(2) == pass)
						return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return false;
	}

	public void FormGestCompeticiones() {
		throw new UnsupportedOperationException();
	}
}