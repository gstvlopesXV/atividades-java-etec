package Controle_Bancario;

import javax.swing.JOptionPane;

public class MenuConta extends Menu {

	private ContaCorrente contaCC;
	private ContaPoupanca contaCP;
	ContaCorrente cc = new ContaCorrente();
	ContaPoupanca cp = new ContaPoupanca();

//  <----    Construtor  ---->
	public MenuConta() {
		cc.setSaldo(500);
		cc.setLimiteEspecial(1000);

		cp.setSaldo(5000);
		cp.setReajusteMensal(0.01);
	}

	protected void executarMenu() {
		String menuOpcoes[] = { "Conta Corrente", "Conta Poupança", "Sair" };
		setOpcao(JOptionPane.showOptionDialog(null, "Escolha o Tipo da Conta", " Java's Bank", 0,
				JOptionPane.QUESTION_MESSAGE, null, menuOpcoes, menuOpcoes[0]));

		if (getOpcao() == 1) {
			executarMenu();
		}
	}

	protected void avaliarOpcaoEscolhida() {
		if (getOpcao() == 1) {
			operarContaCC();

		} else if (getOpcao() == 2) {
			operarContaCP();

		} else if (getOpcao() == 3) {
			System.exit(0);

		} else {
			System.out.println("Opção inválida!");

		}
	}

	private void operarContaCC() {
		executarMenu();

		if (getOpcao() == 1) {
			cc.toString();

		} else if (getOpcao() == 2) { // FALTA AS EXCEÇOES
			cc.depositar(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do deposito: ",
					"Java's Bank", JOptionPane.QUESTION_MESSAGE)));

		} else if (getOpcao() == 3) {
			cc.sacar(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do saque: ", "Java's Bank",
					JOptionPane.QUESTION_MESSAGE)));

		} else if (getOpcao() == 4) {
			cc.atualizarSaldo();

		} else if (getOpcao() == 0) {
			setOpcao(-1);
		} else {
			System.out.println("Opção inválida!");
		}
	}

	private void operarContaCP() {
		executarMenu();

		if (getOpcao() == 1) {
			cp.toString();

		} else if (getOpcao() == 2) { // FALTA AS EXCEÇOES
			cp.depositar(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do deposito: ",
					"Java's Bank", JOptionPane.QUESTION_MESSAGE)));

		} else if (getOpcao() == 3) {
			cp.sacar(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do saque: ", "Java's Bank",
					JOptionPane.QUESTION_MESSAGE)));

		} else if (getOpcao() == 4) {
			cp.setReajusteMensal((Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do saque: ",
					"Java's Bank", JOptionPane.QUESTION_MESSAGE))));

			cp.atualizarSaldo();
		} else if (getOpcao() == 0) {
			setOpcao(-1);

		}
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
