package lambdasoft.crysport.Dominio;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import lambdasoft.crysport.Persistencia.Agente;


public class Gestor_de_competiciones {
	public Competicion competicion;
	@SuppressWarnings("unused")
	private LinkedList<Competicion> lista=new LinkedList<Competicion>();

	public static boolean BorrarCompeticion(int id) {
            boolean resultado=false;
            try {
                    int rs = Agente.getAgente().delete("DELETE FROM competiciones WHERE id="+id);

                    if(rs!=0){
                            resultado=true;
                    }

            } catch (SQLException e) {
                    e.printStackTrace();
            } catch (Exception e) {
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
                    e.printStackTrace();
            } catch (Exception e) {
                    e.printStackTrace();
            }

            return resultado;
}
	
	public static boolean ModificarCompeticion(String id,String fecha,String organizador,String modalidad) {
            boolean resultado=false;
            try {
                    System.out.println("UPDATE competiciones  SET  fecha='"+fecha+"', organizador='"+organizador+"', modalidad='"+modalidad+"' WHERE id="+id+"");
                    int rs = Agente.getAgente().insert("UPDATE competiciones  SET  fecha='"+fecha+"', organizador='"+organizador+"', modalidad='"+modalidad+"' WHERE id='"+id+"'");

                    if(rs!=0){
                            resultado=true;
                    }

            } catch (SQLException e) {
                    e.printStackTrace();
            } catch (Exception e) {
                    e.printStackTrace();
            }

            return resultado;
    }
	
	public static ResultSet SeleccionarTodo() {
            ResultSet res=null;
            try {
                    res = Agente.getAgente().select("SELECT * FROM competiciones");


            } catch (SQLException e) {
                    e.printStackTrace();
            } catch (Exception e) {
                    e.printStackTrace();
            }

            return res;
    }
	
}