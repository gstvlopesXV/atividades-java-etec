package pkg_Menus;

import javax.swing.JOptionPane;

public class Menu {

	private int opcao;
	private String mensagemMenu;

	public void executar() {
		executarMenu();
	}

	protected void executarMenu() {
		if (getOpcao() == 1) {
			String menuOpcoes[] = { "Voltar", "Consultar Saldo", "Depositar", "Sacar", "Atualizar Saldo" };
			this.opcao = JOptionPane.showOptionDialog(null, "Escolha uma ação:", " Java's Bank - Conta Corrente", 0,
					JOptionPane.QUESTION_MESSAGE, null, menuOpcoes, menuOpcoes[0]);

		} else if (getOpcao() == 2) {
			String menuOpcoes[] = { "Voltar", "Consultar Saldo", "Depositar", "Sacar", "Atualizar Saldo" };
			this.opcao = JOptionPane.showOptionDialog(null, "Escolha uma ação:", " Java's Bank - Conta Poupança", 0,
					JOptionPane.QUESTION_MESSAGE, null, menuOpcoes, menuOpcoes[0]);

		} else {
			System.exit(0);
		}
	}

	protected void avaliarOpcaoEscolhida() {

	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;

	}

	public String getMensagemMenu() {
		return mensagemMenu;
	}

	public void setMensagemMenu(String mensagemMenu) {
		this.mensagemMenu = mensagemMenu;
	}

}
