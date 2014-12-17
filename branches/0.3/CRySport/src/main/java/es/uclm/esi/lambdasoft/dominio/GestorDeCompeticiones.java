package es.uclm.esi.lambdasoft.dominio;


import java.sql.ResultSet;

import es.uclm.esi.lambdasoft.persistencia.Agente;


public class GestorDeCompeticiones 
{
	public Competicion competicion;

	public static boolean BorrarCompeticion(int id) throws Exception {
            boolean resultado=false;
            try {
                    int rs = Agente.getAgente().delete("DELETE FROM competiciones WHERE id="+id);

                    if(rs!=0){
                            resultado=true;
                    }

            } catch (Exception e) {
                throw(e);
         }

            return resultado;
	}
	
	public static boolean InsertarCompeticion(String id,String fecha,String organizador,String modalidad) throws Exception {
            boolean resultado=false;
            try {
                    int rs = Agente.getAgente().insert("INSERT INTO competiciones  VALUES ('"+id+"', '"+fecha+"', '"+organizador+"', '"+modalidad+"')");

                    if(rs!=0){
                            resultado=true;
                    }
            } catch (Exception e) {
                   throw(e);
            }

            return resultado;
}
	
	public static boolean ModificarCompeticion(String id,String fecha,String organizador,String modalidad) throws Exception {
            boolean resultado=false;
            try {
                    int rs = Agente.getAgente().insert("UPDATE competiciones  SET  fecha='"+fecha+"', organizador='"+organizador+"', modalidad='"+modalidad+"' WHERE id='"+id+"'");

                    if(rs!=0){
                            resultado=true;
                    }

            } catch (Exception e) {
                throw(e);
         }

            return resultado;
    }
	
	public static ResultSet SeleccionarTodo() throws Exception {
            ResultSet res=null;
            try {
                    res = Agente.getAgente().select("SELECT * FROM competiciones");


            } catch (Exception e) {
                throw(e);
         }

            return res;
    }
	
}