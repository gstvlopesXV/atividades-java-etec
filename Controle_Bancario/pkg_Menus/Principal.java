package pkg_Menus;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		MenuConta mc = new MenuConta();

		while (true) {
			try {
				mc.executar();
				mc.avaliarOpcaoEscolhida();

			} catch (Exception Error) {
				JOptionPane.showMessageDialog(null, "Error: " + Error, "Java's Bank - Error",
						JOptionPane.WARNING_MESSAGE);

			}
		}
	}
}
