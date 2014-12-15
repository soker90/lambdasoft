package es.uclm.esi.lambdasoft.persistencia;

import java.sql.*;

public class Agente {
	
	//Instancia del agente
    protected static Agente mInstancia=null;
    //Conexion con la base de datos
    protected static Connection mBD;
	//Identificador  de la base de datos
    private static String url="mysql.nixiweb.com";
    private static String nombre="u247820005_g0203";
    private static String userName="u247820005_g0203";
    private static String password="passwordg0203";


    //Constructor
    public Agente()throws Exception {
    	conectar();
    }
    
    //Implementacion del patron singleton
    //Este patron de disenio permite implementar clases de las cuales
    //solo existir una instancia
    
     public static Agente getAgente() throws Exception{
          if (mInstancia==null){
          mInstancia=new Agente();
        }
        return mInstancia;
     }
 
    //Metodo para realizar la conexion a la base de datos 
    public void conectar(){
    	try
    	 {
    		Class.forName("com.mysql.jdbc.Driver");
    		mBD = DriverManager.getConnection ("jdbc:mysql://"+url+"/"+nombre,userName, password);
    	 } catch (Exception e)
    	 {
    		 e.printStackTrace();
    	 }  
    }

    
    //Metodo para desconectar de la base de datos
    public void desconectar() throws Exception{
    	mBD.close();
    }
    
  //Metodo para realizar una consulta en la base de datos
    public ResultSet select(String SQL) throws SQLException, Exception{ 
    	conectar();
    	Statement stmt = mBD.createStatement();
    	ResultSet res = stmt.executeQuery(SQL); 
    	return res;
    }

    //Metodo para realizar una insercion en la base de datos
    public int insert(String SQL) throws SQLException, Exception{ 
     	conectar();
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	int res=stmt.executeUpdate();
    	return res;
    }
    
    //Metodo para realizar una eliminacion en la base de datos
    public int delete(String SQL) throws SQLException,Exception{
    	conectar();
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	int res=stmt.executeUpdate();
    	return res;
    }
    
    //Metodo para realizar una eliminacion en la base de datos
    public int update(String SQL) throws SQLException,Exception{
    	conectar();
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	int res=stmt.executeUpdate();
    	stmt.close();
    	desconectar();
    	return res;
    }

}