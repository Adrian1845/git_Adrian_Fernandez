package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplodeTestExcepcion {

	@Test(expected=java.lang.ArithmeticException.class)
	//Se comprueba que ning�n n�mero es multiplo de 0 ya que dividir por 0 da infinito
	//Hemos tenido que modificar el c�digo a�adiendo el lanzado de la excepci�n
	//throw new java.lang.ArithmeticException("Divisi�n por 0");
	public void testEsmultiplode() {
		Multiplode m = new Multiplode(10);
		boolean resul=m.esmultiplode(0);
		assertEquals(resul,false);
	}

}
