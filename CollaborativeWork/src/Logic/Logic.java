package Logic;

import java.time.LocalDate;

import javax.swing.JOptionPane;

/**
 * @author jasmin saleh Clase de la logica donde se realiza la funcionaliodad de
 *         cada uno de los métdos
 *
 */
public class Logic {
	
	final String sentence="sogamoso ciudad del sol Sy del acero";


	/**
	 * Constructor de la clase
	 */
	public Logic() {
		
	}
	
	public String nombrePropio() {
		char[] characteres= sentence.toCharArray();
		characteres[0]= Character.toUpperCase(characteres[0]);
		 for (int i = 0; i < characteres.length-2; i++) {
			if (characteres[i]== ' ' || characteres[i]== '.' || characteres[i]== ',') {
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
		int cont = 0;
		if (sentence.length() == word.length()) {
			if (sentence.equalsIgnoreCase(word)) {
				cont++;
			}
		} else if (sentence.length() < word.length()) {
			cont = 0;
		} else {
			for (int i = 0; i <= sentence.length() - word.length(); i++) {

				if (i == 0) {
					if (sentence.substring(i + word.length(), (i + word.length() + 1)).equalsIgnoreCase(" ")) {
						if (sentence.substring(i, i + word.length()).equalsIgnoreCase(word)) {
							cont++;
						}
					}
				} else if (i < sentence.length() - word.length()) {
					if (sentence.substring(i - 1, i).equalsIgnoreCase(" ") && sentence
							.substring(i + word.length(), (i + word.length() + 1)).equalsIgnoreCase(" ")) {
						if (sentence.substring(i, i + word.length()).equalsIgnoreCase(word)) {
							cont++;
						}
					}
				} else {
					if (sentence.substring(i - 1, i).equalsIgnoreCase(" ")) {
						if (sentence.substring(i, i + word.length()).equalsIgnoreCase(word)) {
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
	 * @param sentenc cadena de caracteres
	 * @return retorna cadena de caracteres iguales sin repetir del parametro ingresado
	 */
	
	 public  String intersection(String sentenc) {
		 
		  String duplicate="";
	   	    
	   		for (int i = 0; i < sentenc.length(); i++) {
	   			
	   	    		String si = Character.toString(sentenc.charAt(i));
		
	   	    		if (sentence.contains(si)) {
	   	               if(!duplicate.contains(si)) {
	   	            	   duplicate+=si;  
	   	               }
	   	    		} 			
	   		} 	    	 		
	    	return duplicate;			
		}
	 
	 
	 /**
	  * Metodo el cual muestra la diferencia de caracteres de la cadena original con la entrada o parametro
	  * @param sentenc cadena de caracteres
	  * @return cadena original con caracteres de diferencia.
	  */
	    public  String difference(String sentenc) {
	        
	   	    String duplicate="";
	   	    
	   		for (int i = 0; i < sentence.length(); i++) {
	   			
	   	    		String si = Character.toString(sentence.charAt(i));
		
	   	    		if (!sentenc.contains(si)) {
	   	  
	   	            	   duplicate+=si;
	   	   
	   	    		} 			
	   			} 	
	       	 		
	    	return duplicate;			
		 }
	 
	
	public LocalDate fecha() {
	 	String dateString= JOptionPane.showInputDialog("Ingresa la cadena en formato AAAA-MM-DD");
	 	LocalDate date= LocalDate.parse(dateString);
		return date;
	 	
	}
}
