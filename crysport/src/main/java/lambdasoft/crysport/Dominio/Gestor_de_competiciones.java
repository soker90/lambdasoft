package lambdasoft.crysport.Dominio;

import java.sql.SQLException;

import lambdasoft.crysport.Persistencia.Agente;

public class Gestor_de_competiciones {
	public Competicion unnamed_Competicion_;

	public void listarCompeticiones() {
		throw new UnsupportedOperationException();
		//SQL = "SELECT * FROM `competiciones` WHERE 1;";
	}

	public boolean modificarCompeticion(String fecha, String organizador, String modalidad) {
		String SQL = "UPDATE `competiciones` SET `id`="+"Alguno"+",`fecha`="+fecha.toString()+
				",`organizador`="+organizador+",`modalidad`="+modalidad+" WHERE 1;";
		try {
			int resul = Agente.getAgente().update(SQL);
			if(resul >= 0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean BorrarCompeticion(int id) {
		throw new UnsupportedOperationException();
		//SQL = "DELETE FROM `competiciones` WHERE id="+"Alguno"+";";
	}

	public boolean InsertarCompeticion(int id, String fecha, String organizador, String modalidad) {
		throw new UnsupportedOperationException();
		//SQL = "INSERT INTO `competiciones`(`id`, `fecha`, `organizador`, `modalidad`) "
				//+ "VALUES ("+id.toString()+","+fecha.toString+","+organizador+","+modalidad+");";
	}
	
}