package co.edu.uptc.Runner;

import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet.CharacterAttribute;

import co.edu.uptc.Logic.Logic;

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
		String text=JOptionPane.showInputDialog("Digite cadena principal: ");
		Logic lo = new Logic(text);
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
					JOptionPane.showMessageDialog(null, lo.buscarPalabra(word));	
				break;
			case 3:
				sentence=JOptionPane.showInputDialog("escriba palabra u oracion a encriptar");
				sentence=lo.encriptar(sentence);
				JOptionPane.showMessageDialog(null, sentence);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, lo.desencriptar(sentence));
				break;
			case 5:
				String letters= JOptionPane.showInputDialog("Digite la letra a añadir");
				int cant= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de letras a añadir"));
				String[] leftOrRigt = { "Izquierda", "Derecha"};
				String side = (String) JOptionPane.showInputDialog(null, "Por donde desea borrar: ", "BORRAR",
						JOptionPane.DEFAULT_OPTION, null, leftOrRigt, leftOrRigt[0]);
				JOptionPane.showMessageDialog(null, "Frase final: " + lo.llenarCaracteres(sentence, letters, cant, side));
				break;
			case 6:
				String sentencee="";
				int counter=0;
				do {
					if(counter!=0) {
						JOptionPane.showMessageDialog(null, "Solo puede ingresar un caracter","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
					}
					sentencee=JOptionPane.showInputDialog("Digite el caracter que desea borrar");
					counter++;
				}while(sentencee.length()>1);
				JOptionPane.showMessageDialog(null, lo.caracterBorrado(sentencee));
				break;
			case 7:
				sentence=JOptionPane.showInputDialog("escriba palabra a intersectar");
				JOptionPane.showMessageDialog(null, lo.intersection(sentence));
				break;
			case 8:
				sentence=JOptionPane.showInputDialog("escriba palabra a diferenciar");
				JOptionPane.showMessageDialog(null, lo.diferencia(sentence));
				break;
			case 9:
				String Sentencee=JOptionPane.showInputDialog("Digite texto: ");
				String[] leftOrRigth = { "Derecha", "Izquierda"};
				String orientation = (String) JOptionPane.showInputDialog(null, "Por donde desea borrar: ", "BORRAR",
						JOptionPane.DEFAULT_OPTION, null, leftOrRigth, leftOrRigth[0]);
				JOptionPane.showMessageDialog(null, lo.borrarCaracteres(Sentencee, orientation));
				break;
			case 10:
				String dateString= JOptionPane.showInputDialog("Ingresa la cadena en formato AAAA-MM-DD");
				JOptionPane.showMessageDialog(null, "La fecha es:" + lo.fecha(dateString));
				break;
			case 11:
				JOptionPane.showMessageDialog(null, "Ha salido del programa","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
				
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