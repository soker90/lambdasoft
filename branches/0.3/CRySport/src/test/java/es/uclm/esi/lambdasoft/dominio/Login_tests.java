package es.uclm.esi.lambdasoft.dominio;

import junit.framework.TestCase;
import es.uclm.esi.lambdasoft.dominio.Usuario;

public class Login_tests extends TestCase {
	
	public void testLoginCorrecto(){
		
		/* Setup */
		Usuario u = new Usuario("g02.03","g02.03");
		
		/* Ejecución del esceneario */
		boolean resultado = u.select();
		
		/* Oráculo */
		assertTrue(resultado);
		
	}
	
	
	public void testLoginIncorrecto(){
		
		/* Setup */
		Usuario u = new Usuario("No existe tal usuario","Con esta contraseña");
		
		/* Ejecución del esceneario */
		boolean resultado = u.select();
		
		/* Oráculo */
		assertFalse(resultado);
		
	}
	
}
