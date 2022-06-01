package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplodeTestExcepcion {

	@Test(expected=java.lang.ArithmeticException.class)
	//Se comprueba que ningún número es multiplo de 0 ya que dividir por 0 da infinito
	//Hemos tenido que modificar el código añadiendo el lanzado de la excepción
	//throw new java.lang.ArithmeticException("División por 0");
	public void testEsmultiplode() {
		Multiplode m = new Multiplode(10);
		boolean resul=m.esmultiplode(0);
		assertEquals(resul,false);
	}

}
