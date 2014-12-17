package es.uclm.esi.lambdasoft.dominio;

import java.sql.ResultSet;
import java.sql.SQLException;

import junit.framework.TestCase;
import es.uclm.esi.lambdasoft.dominio.Usuario;

public class LoginTest extends TestCase 
{
 
	public void testLoginCorrecto()
	{
 		
		try{
			/* Setup */
			Usuario u = new Usuario("g02.03","g02.03");
			 
			/* Ejecución del esceneario */
			boolean resultado = u.select();
			 
			/* Oráculo */
			assertTrue(resultado);		
		}catch (Exception e){
			fail("Ha surgido un problema: "+e.toString());
		}		
	}
 
 
	public void testLoginIncorrecto()
	{
		try{
			/* Setup */
			Usuario u = new Usuario("No existe tal usuario","Con esta contraseña");
	 
			/* Ejecución del esceneario */
			boolean resultado = u.select();
	 
			/* Oráculo */
			assertFalse(resultado);	
		}catch (Exception e){
			fail("Ha surgido un problema: "+e.toString());
		}	
	}
 
	public void testSQLInjection()
	{
		try{
			/* Setup */
			Usuario u = new Usuario("'g02.03","'g02.03");
	 
			/* Ejecución del esceneario */
			boolean resultado = u.select();
	 
			/* Oráculo */
			assertTrue(resultado);
		}catch (Exception e){
			fail("Ha surgido un problema: "+e.toString());
		}	
	}
}