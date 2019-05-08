package pkg_Menus;

import javax.swing.JOptionPane;

import pkg_Contas.ContaCorrente;
import pkg_Contas.ContaPoupanca;

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
		String menuOpcoes[] = { "Sair", "Conta Corrente", "Conta Poupança" };
		setOpcao(JOptionPane.showOptionDialog(null, "Escolha o tipo da conta:", " Java's Bank", 0,
				JOptionPane.QUESTION_MESSAGE, null, menuOpcoes, menuOpcoes[0]));

	}

	protected void avaliarOpcaoEscolhida() {
		if (getOpcao() == 0) {
			System.exit(0);

		} else if (getOpcao() == 1) {
			operarContaCC();

		} else if (getOpcao() == 2) {
			operarContaCP();

		} else if (getOpcao() == JOptionPane.CLOSED_OPTION) {
			System.exit(0);

		} else {
			JOptionPane.showMessageDialog(null, "Error: Opção inválida", "Java's Bank - Error",
					JOptionPane.WARNING_MESSAGE);

		}
	}

	private void operarContaCC() {
		super.executarMenu();

		if (getOpcao() == 1) {
			cc.toString();

		} else if (getOpcao() == 2) { // FALTA AS EXCEÇOES
			cc.depositar(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do depósito: ",
					"Java's Bank - Conta Corrente", JOptionPane.QUESTION_MESSAGE)));

		} else if (getOpcao() == 3) {
			cc.sacar(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do saque: ",
					"Java's Bank - Conta Corrente", JOptionPane.QUESTION_MESSAGE)));

		} else if (getOpcao() == 4) {
			cc.setLimiteEspecial(
					(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do Limite Especial: ",
							"Java's Bank - Conta Corrente", JOptionPane.QUESTION_MESSAGE))));
			cc.atualizarSaldo();

		} else if (getOpcao() == 0) {
			setOpcao(-1);

		} else {
			JOptionPane.showMessageDialog(null, "Error: Opção inválida", "Java's Bank - Error",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	private void operarContaCP() {
		super.executarMenu();

		if (getOpcao() == 1) {
			cp.toString();

		} else if (getOpcao() == 2) {
			cp.depositar(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do depósito: ",
					"Java's Bank - Conta Poupança", JOptionPane.QUESTION_MESSAGE)));

		} else if (getOpcao() == 3) {
			cp.sacar(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do saque: ",
					"Java's Bank - Conta Poupança", JOptionPane.QUESTION_MESSAGE)));

		} else if (getOpcao() == 4) {
			cp.setReajusteMensal(
					(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do Reajuste Mensal: ",
							"Java's Bank - Conta Poupança", JOptionPane.QUESTION_MESSAGE))));
			cp.atualizarSaldo();

		} else if (getOpcao() == 0) {
			setOpcao(-1);

		} else {
			JOptionPane.showMessageDialog(null, "Error: Opção inválida", "Java's Bank - Error",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	public void executar() {
		executarMenu();

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
