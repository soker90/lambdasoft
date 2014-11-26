package lambdasoft.crysport;

import lambdasoft.crysport.Persistencia.Agente;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
        try {
			new Agente();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
