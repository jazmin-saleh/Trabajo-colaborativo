package Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

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
	 * Se hace una prueba al metodo convertir la frase en nombre propio
	 */
	
	@Test
	public void testNombrePropio() {
		assertEquals(logic.nombrePropio(), "Sogamoso Ciudad Del Sol Y Del Acero");
	}

	/**
	 * Se hace una prueba al metodo Buscar palabra
	 */
	@Test
	public void testBuscarPalabra() {
		assertEquals(logic.BuscarPalabra("del"), 2);
		assertEquals(logic.BuscarPalabra("no"), 0);
	}
	
	/**
	 * Se hace una prueba al metodo llenar palabra
	 */
	@Test
	public void testLLenarCaracter() {
		assertEquals(logic.llenarCaracteres("Hola", "e", 4, 1), "eeeeHola");
	}

	/**
	 * Se realiza una prueba la metodo Cracter borrado
	 */
	@Test
	public void testCaracterBorrado() {
		assertEquals(logic.CaracterBorrado("sogamoso ciudad del sol y del acero"), "SGAMS CIUDAD DEL SL Y DEL ACER");
	}
	
	/**
	 * Se hace una prueba al metodo convertir fecha
	 */
	@Test
	public void fecha() {
		equals(logic.fecha("2020-12-12"));
	}
}
