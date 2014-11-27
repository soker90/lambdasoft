package lambdasoft.crysport.Persistencia;

import java.sql.*;

public class Agente {
	
	//Instancia del agente
    protected static Agente mInstancia=null;
    //Conexion con la base de datos
    protected static Connection mBD;
	//Identificador  de la base de datos
    private static String url="sql4.freemysqlhosting.net";
    private static String nombre="sql459526";
    private static String userName="sql459526";
    private static String password="fF5*rU6!";
    @SuppressWarnings("unused")
	private static Connection conexion;
    

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
        // Class.forName(driver);
         //mBD=DriverManager.getConnection(url);
    	try
    	 {
    		Class.forName("com.mysql.jdbc.Driver");
    		conexion = DriverManager.getConnection ("jdbc:mysql://"+url+"/"+nombre,userName, password);
    	 } catch (Exception e)
    	 {
    		 e.printStackTrace();
    	 }
    	
         
         /*MysqlDataSource dataSource = new MysqlDataSource();
         dataSource.setUser(userName);
         dataSource.setPassword("password");
         dataSource.setDatabaseName(nombre);
         dataSource.setServerName(url);

         Connection conexion = dataSource.getConnection();*/
    }

    
    //Metodo para desconectar de la base de datos
    public void desconectar() throws Exception{
    	mBD.close();
    }
    
  //Metodo para realizar una consulta en la base de datos
    public ResultSet select(String SQL) throws SQLException, Exception{ 
    	conectar();
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	ResultSet rs = stmt.executeQuery(SQL); 
    	//rs.next();
    	//String user = rs.getString(2);
    	stmt.close();
    	desconectar();
    	return rs;
    }

    //Metodo para realizar una insercion en la base de datos
    public int insert(String SQL) throws SQLException, Exception{ 
     	conectar();
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	int res=stmt.executeUpdate();
    	stmt.close();
    	desconectar();
    	return res;
    }
    
    //Metodo para realizar una eliminacion en la base de datos
    public int delete(String SQL) throws SQLException,Exception{
    	conectar();
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	int res=stmt.executeUpdate();
    	stmt.close();
    	desconectar();
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
    
    
	/*public Vector<Object> select(String SQL) throws SQLException,Exception{
            PreparedStatement stmt=mBD.prepareStatement(SQL);
            ResultSet rs=stmt.executeQuery();
            Vector<Object> vo=new Vector();
            while(rs.next()){
                Vector<Object> vu=new Vector();
                vu.add(rs.getString("login"));
                vu.add(rs.getString("password"));
                vo.add(vu);
            }
            return vo;
		/*Metodo para realizar una busqueda o seleccion de informacion enla base de datos
	    *El m�todo select develve un vector de vectores, donde cada uno de los vectores
	    *que contiene el vector principal representa los registros que se recuperan de la base de datos.
	    /	
	}*/
}