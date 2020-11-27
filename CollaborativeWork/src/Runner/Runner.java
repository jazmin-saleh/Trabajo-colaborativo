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
	 * los m�todos
	 */
	public static void menu() {
		
		Logic lo = new Logic();
		int menu=0;
		do {
			try {
			menu = Integer
					.parseInt(JOptionPane.showInputDialog("1.Convertir en nombre propio el contenido de la cadena\n"
							+ "2.Buscar palabra\n3.Encriptar(m�todo est�tico)\n4.Desencriptar (m�todo est�tico)\n5.Llenar cacarter\n6.Borrar cracteres\n"
							+ "7.Intersecci�n\n8.Diferencia\n9.Borrar caracteres iziquierda o derecha\n10.Convertir a fecha\n11.Salir"));
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Error");
			}
			switch (menu) {
			case 1:
				JOptionPane.showMessageDialog(null, lo.nombrePropio());
				break;
			case 2:
					String word=JOptionPane.showInputDialog("Digite palabra");
					JOptionPane.showMessageDialog(null, "Error");
					JOptionPane.showMessageDialog(null, lo.BuscarPalabra(word));
				break;
			case 3:
				String sentence;
				sentence=JOptionPane.showInputDialog("escriba palabra u oracion a encriptar");
				JOptionPane.showMessageDialog(null, Logic.Encrypt(sentence));
				menu();
				break;
			case 4:
				break;
			case 5:
				String wordString= JOptionPane.showInputDialog("Escriba una frase");
				String letters= JOptionPane.showInputDialog("Digite la letra a a�adir");
				int cant= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de letras a a�adir"));
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
				break;
			case 9:
				break;
			case 10:
				String dateString= JOptionPane.showInputDialog("Ingresa la cadena en formato AAAA-MM-DD");
				JOptionPane.showMessageDialog(null, "La fecha es:" + lo.fecha(dateString));
				break;
			case 11:
				JOptionPane.showInputDialog("Ha salido del programa");
				break;
			}
		}while(menu!=11);
	}

	public static void main(String[] args) {
		menu();
	}
}