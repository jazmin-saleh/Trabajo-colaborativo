package co.edu.uptc.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import co.edu.uptc.Logic.Logic;

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
		logic = new Logic("Sogamoso ciudad del sol y del acero");
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
		assertEquals(logic.buscarPalabra("del"), 2);
		assertEquals(logic.buscarPalabra("no"), 0);
		assertEquals(logic.buscarPalabra("SogAmoso"), 1);
		
	}
	
	
	/**
	 * se realiza pruba al metodo encriptar
	 */
	@Test
	public void testEncrypt() {
		
		assertEquals(Logic.encriptar("colombia"), "kwtwujqi");
	}
	
	/**
	 * Se realizo la prueba de desencriptar
	 */
	@Test
	public void testDesencriptar() {
		assertEquals(Logic.desencriptar("kwtwujqi"), "colombia");
	}
	
	/**
	 * Se hace una prueba al metodo llenar palabra
	 */
	@Test
	public void testLLenarCaracter() {
		assertEquals(logic.llenarCaracteres("Hola", "e", 4, "Izquierda"), "eeeeHola");
	}

	/**
	 * Se realiza una prueba la metodo Cracter borrado
	 */
	@Test
	public void testCaracterBorrado() {
		assertEquals(logic.caracterBorrado("o"), "Sgams ciudad del sl y del acer");
	}
	/**
	 * Se hace una prueba al metodo interseccion
	 */
	@Test
	public void testinterseccion() {
		assertEquals(logic.intersection("colombia"), "colmia");
	}
	/**
	 * Se hace una prueba al metodo Diferencia
	 */
	@Test
	public void testDiferencia() {
		assertEquals(logic.diferencia("colombia"), "Sgs udd de s y de er");
	}
	
	/**
	 * Se hace una prueba del metodo deleteCharacter
	 */
	@Test
	public void deleteCharacters() {
		assertEquals(logic. borrarCaracteres("curador", "izquierda"), "Sogamoso ciudad del sol y del ace");
	}
	
	/**
	 * Se hace una prueba al metodo convertir fecha
	 */
	@Test
	public void fecha() {
		equals(logic.fecha("2020-12-12"));
	}
	
}
