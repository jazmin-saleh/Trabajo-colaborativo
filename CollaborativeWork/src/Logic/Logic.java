package Logic;

import java.time.LocalDate;

import javax.swing.JOptionPane;

/**
 * @author jasmin saleh Clase de la logica donde se realiza la funcionaliodad de
 *         cada uno de los métdos
 *
 */
public class Logic {

	/**
	 * Atributo
	 */
	final String SENTENCE = "sogamoso ciudad del sol y del acero";

	/**
	 * Constructor de la clase
	 */
	public Logic() {

	}

	/**
	 * Método el cual la oracion final cambia a tener todas las primeras letras en
	 * mayuscula (nombre propio)
	 * 
	 * @param sentence
	 * @return characteres
	 */

	public String nombrePropio() {
		char[] characteres = SENTENCE.toCharArray();
		characteres[0] = Character.toUpperCase(characteres[0]);
		for (int i = 0; i < characteres.length - 2; i++) {
			if (characteres[i] == ' ' || characteres[i] == '.' || characteres[i] == ',' || characteres[i] == 'y') {
				characteres[i + 1] = Character.toUpperCase(characteres[i + 1]);
			}
		}
		return new String(characteres);
	}

	/**
	 * @return En este método se busca una plabra en este caso es (del) Se pone un
	 *         espacio antes y depues de la plabra a buscar Ignorando las
	 *         mayuscuylas y minusculas retorna un entero con el numero de veces que
	 *         existe la cadena
	 * 
	 */
	public int BuscarPalabra(String word) {
		int cont = 0;
		if (SENTENCE.length() == word.length()) {
			if (SENTENCE.equalsIgnoreCase(word)) {
				cont++;
			}
		} else if (SENTENCE.length() < word.length()) {
			cont = 0;
		} else {
			for (int i = 0; i <= SENTENCE.length() - word.length(); i++) {

				if (i == 0) {
					if (SENTENCE.substring(i + word.length(), (i + word.length() + 1)).equalsIgnoreCase(" ")) {
						if (SENTENCE.substring(i, i + word.length()).equalsIgnoreCase(word)) {
							cont++;
						}
					}
				} else if (i < SENTENCE.length() - word.length()) {
					if (SENTENCE.substring(i - 1, i).equalsIgnoreCase(" ")
							&& SENTENCE.substring(i + word.length(), (i + word.length() + 1)).equalsIgnoreCase(" ")) {
						if (SENTENCE.substring(i, i + word.length()).equalsIgnoreCase(word)) {
							cont++;
						}
					}
				} else {
					if (SENTENCE.substring(i - 1, i).equalsIgnoreCase(" ")) {
						if (SENTENCE.substring(i, i + word.length()).equalsIgnoreCase(word)) {
							cont++;
						}
					}
				}
			}
		}
		return cont;
	}

	/**
	 * Metodo en cual recibe una cadena y este encripta o cifra dicha cadena.
	 * 
	 * @param cadena
	 * @return retorna un resultado de tipo string.
	 */
	public static String Encrypt(String sentenc) {

		char array[] = sentenc.toCharArray();

		for (int i = 0; i < array.length; i++) {

			array[i] = (char) (array[i] + (char) 8);

		}

		String encrypted = String.valueOf(array);

		return encrypted;

	}

	/**
	 * @param sentenc
	 * @return Método en el cual desencripta lo que fue encriptado en el método
	 *         anterior
	 */
	public static String Desencriptar(String sentenc) {
		char array[] = sentenc.toCharArray();

		for (int i = 0; i < array.length; i++) {

			array[i] = (char) (array[i] - (char) 8);

		}

		String encrypted = String.valueOf(array);

		return encrypted;
	}

	/**
	 * Metodo llenar caracteres de un frase
	 * 
	 * @param wordString, letters, cant,side
	 * @return finalSentence
	 */

	public String llenarCaracteres(String wordString, String letters, int cant, int side) {
		String z = "", b = "";
		String finalSentence = "";
		for (int i = 0; i < cant; i++) {
			b = letters;
			z += b;
		}
		if (side == 1) {
			finalSentence = z + wordString;
		} else if (side == 2) {
			finalSentence = wordString + z;
		}
		return finalSentence;
	}

	/**
	 * @return Se defino cual es el caracter a borrar Se ignora mayusculas y
	 *         minusculas Retorna cadena sin los caracteres
	 * 
	 */
	public String CaracterBorrado(String sentencee) {
		char replace = 'O';
		String cpaitalPhrase = sentencee.toUpperCase();
		String capitalCharacter = Character.toString(replace).toUpperCase();
		String removeCracter = cpaitalPhrase.replaceAll(capitalCharacter, "");
		return removeCracter;
	}

	/**
	 * Metodo el cual muestra los caracteres que se repiten entre las dos cadenas
	 * 
	 * @param sentenc cadena de caracteres
	 * @return retorna cadena de caracteres iguales sin repetir del parametro
	 *         ingresado
	 */

	public String intersection(String sentenc) {

		String duplicate = "";

		for (int i = 0; i < sentenc.length(); i++) {

			String si = Character.toString(sentenc.charAt(i));

			if (SENTENCE.contains(si)) {
				if (!duplicate.contains(si)) {
					duplicate += si;
				}
			}
		}
		return duplicate;
	}

	/**
	 * Metodo el cual muestra la diferencia de caracteres de la cadena original con
	 * la entrada o parametro
	 * 
	 * @param sentenc cadena de caracteres
	 * @return cadena original con caracteres de diferencia.
	 */
	public String difference(String sentenc) {

		String duplicate = "";

		for (int i = 0; i < SENTENCE.length(); i++) {

			String si = Character.toString(SENTENCE.charAt(i));

			if (!sentenc.contains(si)) {

				duplicate += si;

			}
		}

		return duplicate;
	}

	/**
	 * @param text: hace referencia a el texto ingreasado por el usuario
	 * @param rightOrLeft: si desea borrar por derecha o izquierda
	 * @return Borra a la izquierda o a la derecha de la cadena los caracteres que
	 *         existen en la cadena de entrada, hasta que encyentre un caracter que
	 *         no exista
	 */
	public String deleteCharacters(String text, String rightOrLeft) {

		if (rightOrLeft.equals("Izquierda")) {
			String finalText = SENTENCE;
			for (int i = 0; i < SENTENCE.length(); i++) {
				if (frequency(SENTENCE.substring(i, i + 1), text)) {
					finalText = SENTENCE.substring(i + 1, SENTENCE.length());
				} else {
					return finalText;
				}

			}
			return finalText;
		} else {
			String finalText = SENTENCE;
			for (int i = SENTENCE.length(); i >= 0; i--) {
				if (frequency(SENTENCE.substring(i - 1, i), text)) {
					finalText = SENTENCE.substring(0, i - 1);
				} else {
					return finalText;
				}

			}
			return finalText;
		}
	}

	/**
	 * @param character
	 * @param string
	 * @return
	 * Este método observa si la palabra se encuentra o no
	 */
	public static boolean frequency(String character, String string) {
		int counter = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.substring(i, i + 1).equalsIgnoreCase(character)) {
				counter++;
			}
		}
		if (counter == 0)
			return false;
		else
			return true;
	}

	/**
	 * Metodo convertir cadena de String en fecha segun el formato de LocalDate
	 * 
	 * @param dateString
	 * @return date
	 */

	public LocalDate fecha(String dateString) {

		LocalDate date = LocalDate.parse(dateString);
		return date;

	}
}
