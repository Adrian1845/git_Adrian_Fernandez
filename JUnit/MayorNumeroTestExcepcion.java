package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MayorNumeroTestExcepcion {

	@Test(expected=java.lang.NullPointerException.class)
	//comprobar que la excepci�n por si le pasamos un array que no tenga memoria (null)
	public void testObt_mayorNumero() {
		int array[] = null;
		int res = MayorNumero.obt_mayorNumero(array);
		System.out.println(res);
	}

}
