package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Logic.Logic;

/**
 * @author jasmin saleh Se realizan las pruebas unitarias de la clase Logic
 */
public class LogicTest {

	/**
	 * Atributo de clase
	 */
	private Logic logic;

	/**
	 *Constructor de clase
	 */
	public LogicTest() {
		logic = new Logic();
	}

	/**
	 * Se hace una prueba al metodo Buscar palabra
	 */
	@Test
	public void testBuscarPalabra() {
		assertEquals(logic.BuscarPalabra("del"), 2);
	}

	/**
	 * Se realiza una prueba la metodo Cracter borrado
	 */
	@Test
	public void testCaracterBorrado() {
		assertEquals(logic.CaracterBorrado("sogamoso ciudad del sol y del acero"), "SGAMS CIUDAD DEL SL Y DEL ACER");
	}
}
