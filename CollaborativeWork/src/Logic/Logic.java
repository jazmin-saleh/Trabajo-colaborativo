package Logic;

/**
 * @author jasmin saleh Clase de la logica donde se realiza la funcionaliodad de
 *         cada uno de los m�tdos
 *
 */
public class Logic {
	
	final String sentence="sogamoso ciudad del sol y del acero";


	/**
	 * Constructor de la clase
	 */
	public Logic() {
		
	}

	/**
	 * @return En este m�todo se busca una plabra en este caso es (del) Se pone un
	 *         espacio antes y depues de la plabra a buscar Ignorando las
	 *         mayuscuylas y minusculas retorna un entero con el numero de veces que
	 *         existe la cadena
	 * 
	 */
	public int BuscarPalabra(String word) {
		 String wordSpace = " "+word + " ";
		int counter = 0;
		for (int i = 0; i < (sentence.length() - wordSpace.length()); i++) {
			if (sentence.substring(i, i + wordSpace.length()).equalsIgnoreCase(wordSpace)) {
				counter++;
			}
		}
		return counter;
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
}
