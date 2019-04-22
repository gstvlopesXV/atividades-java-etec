package Controle_Bancario;

public class Principal {

	public static void main(String[] args) {

		MenuConta menu = new MenuConta();

		menu.executarMenu();
		System.out.println(menu.getOpcao());// LOG

		menu.setOpcao(menu.getOpcao() + 1);
		System.out.println(menu.getOpcao());// LOG

		menu.avaliarOpcaoEscolhida();
		System.out.println(menu.getOpcao());// LOG
	}

}
