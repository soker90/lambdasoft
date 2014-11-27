package lambdasoft.crysport.Dominio;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import lambdasoft.crysport.Persistencia.Agente;


public class Gestor_de_competiciones {
	public Competicion competicion;
	private LinkedList<Competicion> lista=new LinkedList<Competicion>();
	
	public void listarCompeticiones() {

		//SQL = "SELECT * FROM `competiciones` WHERE 1;";
	}

	public boolean modificarCompeticion(String fecha, String organizador, String modalidad) {



		//SQL = "UPDATE `competiciones` SET `id`="+"Alguno"+",`fecha`="+fecha.toString()+
				//",`organizador`="+organizador+",`modalidad`="+modalidad+" WHERE 1;";

		/*String SQL = "UPDATE `competiciones` SET `id`="+"Alguno"+",`fecha`="+fecha.toString()+
				",`organizador`="+organizador+",`modalidad`="+modalidad+" WHERE 1;";*/
		/*try {
			int resul = Agente.getAgente().update(SQL);
			if(resul >= 0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return false;

	}

	public static boolean BorrarCompeticion(int id) {
			boolean resultado=false;
			try {
				int rs = Agente.getAgente().delete("DELETE FROM competiciones WHERE id="+id);

				if(rs!=0){
					resultado=true;
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
	
	public static boolean InsertarCompeticion(String id,String fecha,String organizador,String modalidad) {
		boolean resultado=false;
		try {
			int rs = Agente.getAgente().insert("INSERT INTO competiciones  VALUES ('"+id+"', '"+fecha+"', '"+organizador+"', '"+modalidad+"')");

			if(rs!=0){
				resultado=true;
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
	
	public static boolean ModificarCompeticion(String id,String fecha,String organizador,String modalidad) {
		boolean resultado=false;
		try {
			//UPDATE `competiciones` SET `id`=[value-1],`fecha`=[value-2],`organizador`=[value-3],`modalidad`=[value-4] WHERE 1
			System.out.println("UPDATE competiciones  SET  fecha='"+fecha+"', organizador='"+organizador+"', modalidad='"+modalidad+"' WHERE id="+id+"");
			int rs = Agente.getAgente().insert("UPDATE competiciones  SET  fecha='"+fecha+"', organizador='"+organizador+"', modalidad='"+modalidad+"' WHERE id='"+id+"'");

			if(rs!=0){
				resultado=true;
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
	
	public static ResultSet SeleccionarTodo() {
		ResultSet res=null;
		try {
			res = Agente.getAgente().select("SELECT * FROM competiciones");

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
    }
	
}