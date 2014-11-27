package lambdasoft.crysport.Dominio;

import java.sql.SQLException;
//import java.util.LinkedList;

import lambdasoft.crysport.Persistencia.Agente;

public class Gestor_de_competiciones {
	//private lista_Competiciones LinkedList<Competeticiones>=new LinkedList<Competicion>();
//	private LinkedList<Competicion> lista_Competiciones;
	
	public Gestor_de_competiciones(){
//		this.lista_Competiciones=new LinkedList<Competicion>();;
	}
	
	public void listarCompeticiones() {
		//agente=Agente.
		throw new UnsupportedOperationException();
	}

	public boolean modificarCompeticion(String fecha, String organizador, String modalidad) {
		throw new UnsupportedOperationException();
	}

	public boolean BorrarCompeticion(int id) {
		throw new UnsupportedOperationException();
	}

	public boolean InsertarCompeticion(Competicion c){
		Agente agente;
		try {
			agente = Agente.getAgente();
			agente.insert("INSERT INTO competiciones VALUES("+c.getId()+c.getFecha()+c.getOrganizador()+c.getModalidad()+")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}