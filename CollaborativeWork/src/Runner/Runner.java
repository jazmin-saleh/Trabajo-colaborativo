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

		Logic lo = new Logic();
		int menu=0;
		do {
			try {
			menu = Integer
					.parseInt(JOptionPane.showInputDialog("1.Convertir en nombre propio el contenido de la cadena\n"
							+ "2.Buscar palabra\n3.Encriptar(método estático)\n4.Desencriptar (método estático)\n5.Llenar cacarter\n6.Borrar cracteres\n"
							+ "7.Intersección\n8.Diferencia\n9.Borrar caracteres iziquierda o derecha\n10.Convertir a fecha\n11.Salir"));
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Error");
			}
			switch (menu) {
			case 1:
				JOptionPane.showMessageDialog(null, lo.nombrePropio());
				break;
			case 2:
					String word=JOptionPane.showInputDialog("Digite palabra: ");
					JOptionPane.showMessageDialog(null, lo.BuscarPalabra(word));
					
				break;
			case 3:
				String sentence=JOptionPane.showInputDialog("escriba palabra u oracion a encriptar");
				JOptionPane.showMessageDialog(null, lo.Encrypt(sentence));
				menu();
				break;
			case 4:
				break;
			case 5:

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
				break;
			case 10:
				JOptionPane.showMessageDialog(null, "La fecha es:" + lo.fecha());
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