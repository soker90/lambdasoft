package es.uclm.esi.lambdasoft.dominio;

import java.sql.ResultSet;
import java.sql.SQLException;

import junit.framework.TestCase;

public class Competicion_tests extends TestCase 
{
	
	public void test_insert()
	{
		/* setup */
		Competicion c=new Competicion("5","456456","46546465","654654646546");
		
		/* ejecucion del escenario */
		
		boolean resultado = c.insert();
		
		c.delete();
		
		/*Oraculo*/
		
		assertTrue(resultado);
		
	}
	
	public void test_update()
	{
		/* setup */
		Competicion c=new Competicion("5","456456","46546465","654654646546");
		
		/* ejecucion del escenario */
		
		c.insert();
		c.setFecha("456");
		c.setModalidad("bicis");
		c.setOrganizador("asdaf");
		
		boolean resultado =c.update();

		/*Oraculo*/
		
			assertTrue(resultado);
	}
	
	public void test_delete()
	{
		/* setup */
		Competicion c=new Competicion("5","456456","46546465","654654646546");
		
		/* ejecucion del escenario */
		
		c.insert();
		
		boolean resultado = c.delete();
		
		/*Oraculo*/
		
		assertTrue(resultado);
		
	}
	
	
	public void test_select()
	{
		/* setup */
		/*(String id, String fecha, String organizador, String modalidad)*/
		Competicion c=new Competicion("5","fecha","organizador","modalidad");
		boolean resultado=false;
		
		/* ejecucion del escenario */
		
		c.insert();
		ResultSet r= c.selectAll();
		
		boolean fin = false;
		
			
			try 
			{
				while(r.next())
				{
					if(c.getId().equalsIgnoreCase(r.getString(1)))
					{
						System.out.println("Fecha: "+r.getString(2));
						System.out.println("Modalidad: "+r.getString(4));
						System.out.println("Organizador: "+r.getString(3));
						
						if(c.getFecha().equalsIgnoreCase(r.getString(2)) &&
								c.getModalidad().equalsIgnoreCase(r.getString(4)) && 
								c.getOrganizador().equalsIgnoreCase(r.getString(3)))
									resultado=true;
					}
				}
			} 
			catch (SQLException e1) 
			{
                e1.printStackTrace();
        }
		
		c.delete();
		
		/*Oraculo*/
		
		assertTrue(resultado);
		
	}	
}
