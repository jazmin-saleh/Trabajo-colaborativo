package Logic;

import java.time.LocalDate;

import javax.swing.JOptionPane;

/**
 * @author jasmin saleh Clase de la logica donde se realiza la funcionaliodad de
 *         cada uno de los métdos
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
	 * Metodo el cual la oracion final cambia a tener todas las primeras letras
	 *en mayuscula (nombre propio)
	 * @param sentence
	 * @return characteres
	 */
	
	public String nombrePropio() {
		char[] characteres= sentence.toCharArray();
		characteres[0]= Character.toUpperCase(characteres[0]);
		 for (int i = 0; i < characteres.length-2; i++) {
			if (characteres[i]== ' ' || characteres[i]== '.' || characteres[i]== ',' || characteres[i]== 'y') {
				characteres[i+1]= Character.toUpperCase(characteres[i+1]);
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
	 * Metodo en cual recibe una cadena y este encripta o cifra dicha cadena.
	 * @param cadena 
	 * @return retorna un resultado de tipo string.
	 */
	 public static String Encrypt(String sentenc) {
			
			char array[]=sentenc.toCharArray();
			
			for (int i = 0; i < array.length; i++) {
			     
				array[i]=(char)(array[i]+(char)8);
				
			  }
			
			String encrypted=String.valueOf(array);
			
			
			return encrypted;
			
		}
	 
	 /**
		 * Metodo llenar caracteres de un frase
		 * @param wordString, letters, cant,side
		 * @return finalSentence
		 */
		 
	 public String llenarCaracteres(String wordString, String letters,int cant, int side) {
		 String z= "", b= "";
		 String finalSentence = "";		 
		 for (int i = 0; i < cant; i++) {
			 b= letters;
			 z+=b;		
		}
		 if (side==1) {
			finalSentence= z+wordString;
		} else if (side==2) {
			finalSentence= wordString+z;
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
	 * Metodo el cual elimina caracteres repetidos
	 * @param sentenc
	 * @return
	 */
	 public  String intersection(String sentenc) {
		 
		 StringBuilder noDupes = new StringBuilder();
		    for (int i = 0; i < sentenc.length(); i++) {
		    	for (int j = 0; j < sentence.length(); j++) {
		    		String si = sentenc.substring(i, i + 1);
		    		if (noDupes.indexOf(si) == -1) {
		                noDupes.append(si); } 
		             } 
						
				} 	
	    	return noDupes.toString();	
				
		}
	 /**
		 * Metodo convertir cadena de String en fecha segun el formato de LocalDate
		 * @param dateString
		 * @return date
		 */
	
	 
	public LocalDate fecha(String dateString) {
		
	 	LocalDate date= LocalDate.parse(dateString);
		return date;
			
	}
}
