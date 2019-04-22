package Controle_Bancario;

import javax.swing.JOptionPane;

public class Menu {

	private int opcao;
	private String mensagemMenu;

//  <----    Metodos  ---->
	public void executar() {

	}

	protected void executarMenu() {
		String menuOpcoes[] = { "Consultar Saldo", "Depositar", "Sacar", "Atualizar Saldo", "Voltar" };
		this.opcao = JOptionPane.showOptionDialog(null, "Escolha uma ação:", " Java's Bank - Default", 0,
				JOptionPane.QUESTION_MESSAGE, null, menuOpcoes, menuOpcoes[0]);
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
