package es.uclm.esi.lambdasoft.dominio;

import java.sql.ResultSet;
import java.sql.SQLException;

import junit.framework.TestCase;

public class CompeticionTest extends TestCase 
{
	
	public void testInsert()
	{

		try{
			/* Setup */
			Competicion c=new Competicion("5","foo","foo","foo");
			
			/* Ejecución del esceneario */
			boolean resultado = c.insert();
			c.delete();
			
			/* Oráculo */
			
			assertTrue(resultado);
			
		}catch (Exception e){
			fail("Ha surgido un problema: "+e.toString());
		}
			
	}
	
	public void testInsertDuplicate()
	{
		/* Setup */
		Competicion c=new Competicion("5","foo","foo","foo");
		
		try{
			
			/* Ejecución del esceneario */
			c.insert();
			c.insert();
			
			fail("Espaba excepción");
			
		}catch (Exception e){
			/* Llegar al catch es lo correcto */
			try{
				c.delete();					
			}catch(Exception ex){

			}
			assertTrue(e instanceof Exception);
		}
			
	}
	
	public void testUpdate()
	{
			try{
				/* Setup */
				Competicion c=new Competicion("5","foo","foo","foo");
				
				/* Ejecución del esceneario */
				c.insert();
				c.setFecha("456");
				c.setModalidad("bicis");
				c.setOrganizador("asdaf");
				boolean resultado =c.update();
				
				/* Oráculo */
				
				assertTrue(resultado);
				
			}catch (Exception e){
				fail("Ha surgido un problema: "+e.toString());
			}
	}
	
	public void testDelete()
	{
		try{
			/* Setup */
			Competicion c=new Competicion("5","foo","foo","foo");
			
			/* Ejecución del esceneario */
			c.insert();
			boolean resultado = c.delete();
			
			/* Oráculo */
			
			assertTrue(resultado);
			
		}catch (Exception e){
			fail("Ha surgido un problema: "+e.toString());
		}
		
	}

	public void testSelect()
	{
		try{
			/* Setup */
			Competicion c=new Competicion("5","fecha","organizador","modalidad");
			boolean resultado=false;
			
			/* Ejecución del esceneario */
			c.insert();
			ResultSet r= c.selectAll();
				
				try 
				{
					while(r.next())
					{
						if(c.getId().equalsIgnoreCase(r.getString(1)))
						{						
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
			
			/* Oráculo */
			
			assertTrue(resultado);
			
		}catch (Exception e){
			fail("Ha surgido un problema: "+e.toString());
		}			
	}	
}
