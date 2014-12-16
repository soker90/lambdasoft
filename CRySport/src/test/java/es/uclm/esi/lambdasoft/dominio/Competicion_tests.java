package es.uclm.esi.lambdasoft.dominio;

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
	
}

/*
public class ConverterTest extends TestCase {
	
	public void test100CaK(){
	
		Converter c = new Converter();
			
		try{
			double result = c.convert("C", "K", 100);
			assertTrue(result==373);
		}catch (Exception e){
			fail("Excepción no esperada");
		}
		
	}
	
	public void test100CaKM(){
		
		Converter c = new Converter();
			
		try{
			double result = c.convert("C", "KM", 100);
			fail("Espaba excepción");
		}catch (Exception e){

		}
		
	}
*/