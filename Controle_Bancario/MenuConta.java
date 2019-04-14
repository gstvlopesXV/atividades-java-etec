package Controle_Bancario;

import javax.swing.JOptionPane;

public class MenuConta extends Menu {

	private ContaCorrente contaCC;
	private ContaPoupanca contaCP;

//  <----    Construtor  ---->
	public MenuConta() {
		ContaCorrente cc = new ContaCorrente();
		cc.setSaldo(500);
		cc.setLimiteEspecial(1000);
		ContaPoupanca cp = new ContaPoupanca();
		cp.setSaldo(5000);
		cp.setReajusteMensal(0.01);
	}

	protected void executarMenu() {
		String menuOpcoes[] = { "Conta Corrente", "Conta Poupança", "Sair" };
		setOpcao(JOptionPane.showOptionDialog(null, "Escolha o Tipo da Conta", " Java's Bank", 0,
				JOptionPane.QUESTION_MESSAGE, null, menuOpcoes, menuOpcoes[0]));

		if (getOpcao() == 1) {
			String menuCC[] = { "Consultar Saldo", " Depositar", "Sacar", "Atualizar Saldo", "Sair" };
			setOpcao(JOptionPane.showOptionDialog(null, "Escolha o Tipo da Conta", " Java's Bank", 0,
					JOptionPane.QUESTION_MESSAGE, null, menuCC, menuCC[0]));
		}
	}

	protected void avaliarOpcaoEscolhida() {
		switch (getOpcao()) {
		case 1:
			operarContaCC();
			break;
		case 2:
			operarContaCP();
			break;
		case 0:
			System.exit(0);
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
	}

	private void operarContaCC() {
		String menuOpcoesCC[] = { "Consultar Saldo", "Depositar", "Sacar", "Atualizar Saldo", "Voltar" };

		int menuSelecionadoCC = JOptionPane.showOptionDialog(null, "Escolha uma ação:", " Java's Bar", 0,
				JOptionPane.QUESTION_MESSAGE, null, menuOpcoesCC, menuOpcoesCC[0]);

		switch (getOpcao()) {
		case 1:
			toString();

			break;

		case 2:
			Double.parseDouble(((JOptionPane.showInputDialog(null, "Digite o valor do deposito: ", "Java's Bank",
					JOptionPane.QUESTION_MESSAGE))));

			break;
		}
	}

	private void operarContaCP() {
		String menuOpcoesCP[] = { "Consultar Saldo", "Depositar", "Sacar", "Atualizar Saldo", "Voltar" };

		int menuSelecionadoCP = JOptionPane.showOptionDialog(null, "Escolha uma ação:", " Java's Bank", 0,
				JOptionPane.QUESTION_MESSAGE, null, menuOpcoesCP, menuOpcoesCP[0]);
	}

	public ContaCorrente getContaCC() {
		return contaCC;
	}

	public void setContaCC(ContaCorrente contaCC) {
		this.contaCC = contaCC;
	}

	public ContaPoupanca getContaCP() {
		return contaCP;
	}

	public void setContaCP(ContaPoupanca contaCP) {
		this.contaCP = contaCP;
	}
}
