package Runner;

import javax.swing.JOptionPane;

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
		
		try {
			menu = Integer.parseInt(JOptionPane.showInputDialog("1.Convertir en nombre propio el contenido de la cadena\n"
							+ "2.Buscar palabra\n3.Encriptar(método estático)\n4.Desencriptar (método estático)\n5.Llenar cacarter\n6.Borrar cracteres\n"
							+ "7.Intersección\n8.Diferencia\n9.Borrar caracteres iziquierda o derecha\n10.Convertir a fecha\n11.Salir"));
		}catch(Exception r) {
			JOptionPane.showMessageDialog(null, "Error");
		}

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
				break;
			case 2:
				JOptionPane.showMessageDialog(null, lo.BuscarPalabra());
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:

				break;
			case 6:
				JOptionPane.showMessageDialog(null, lo.CaracterBorrado());
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
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