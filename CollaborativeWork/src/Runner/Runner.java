package Runner;

import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet.CharacterAttribute;

import Logic.Logic;

/**
 * @author jasmin saleh Para mostrerle al usuario nuetros menu y metodos
 *         realizados en la clase Logic
 */
public class Runner {

	/**
	 * En este metodo se hace el menu de opciones La funcionalidad de cada uno de
	 * los métodos
	 */
	public static void menu() {
		String sentence="";

		Logic lo = new Logic();
		int menu=0;
		do {
			try {
			menu = Integer
					.parseInt(JOptionPane.showInputDialog("1. Convertir en nombre propio el contenido de la cadena\n"
							+ "2.Buscar palabra\n3.Encriptar(método estático)\n4.Desencriptar (método estático)\n5.Llenar cacarter\n6.Borrar cracteres\n"
							+ "7.Intersección\n8.Diferencia\n9.Borrar caracteres iziquierda o derecha\n10.Convertir a fecha\n11.Salir"));
			switch (menu) {
			case 1:
				JOptionPane.showMessageDialog(null, lo.nombrePropio());
				break;
			case 2:
					String word=JOptionPane.showInputDialog("Digite palabra: ");
					JOptionPane.showMessageDialog(null, lo.BuscarPalabra(word));	
				break;
			case 3:
				sentence=JOptionPane.showInputDialog("escriba palabra u oracion a encriptar");
				sentence=lo.Encrypt(sentence);
				JOptionPane.showMessageDialog(null, sentence);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, lo.Desencriptar(sentence));
				break;
			case 5:
				String wordString= JOptionPane.showInputDialog("Escriba una frase");
				String letters= JOptionPane.showInputDialog("Digite la letra a añadir");
				int cant= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de letras a añadir"));
				int side= Integer.parseInt(JOptionPane.showInputDialog("1. Izquierda  2. Derecha"));
				JOptionPane.showMessageDialog(null, "Frase final: " + lo.llenarCaracteres(wordString, letters, cant, side));
				break;
			case 6:
				String sentencee=JOptionPane.showInputDialog("Digite la farse que desea");
				JOptionPane.showMessageDialog(null, lo.CaracterBorrado(sentencee));
				break;
			case 7:
				sentence=JOptionPane.showInputDialog("escriba palabra a intersectar");
				JOptionPane.showMessageDialog(null, lo.intersection(sentence));
				break;
			case 8:
				sentence=JOptionPane.showInputDialog("escriba palabra a diferenciar");
				JOptionPane.showMessageDialog(null, lo.difference(sentence));
				break;
			case 9:
				String Sentencee=JOptionPane.showInputDialog("Digite texto: ");
				int left=Integer.parseInt(JOptionPane.showInputDialog("Digite\n1.A la izquierda\n2.A la derecha"));
				JOptionPane.showMessageDialog(null, lo.deleteCharacters(Sentencee, left));
				break;
			case 10:
				String dateString= JOptionPane.showInputDialog("Ingresa la cadena en formato AAAA-MM-DD");
				JOptionPane.showMessageDialog(null, "La fecha es:" + lo.fecha(dateString));
				break;
			case 11:
				JOptionPane.showMessageDialog(null, "Ha salido del programa");
				break;
				default: JOptionPane.showMessageDialog(null, "Opcion invalida","ERROR",JOptionPane.ERROR_MESSAGE);
			}
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Error");
			}
		}while(menu!=11);
	}

	/**
	 * @param args
	 * Para mostrarle a el usuraio el menu 
	 */
	public static void main(String[] args) {
		menu();
	}
}