package Controle_Bancario;

import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta {

	private double reajusteMensal;

	public void atualizarSaldo(double reajuste) {
		if (reajuste <= 0) {
			throw new NullPointerException();
		}

		if (getSaldo() >= 0) {
			this.reajusteMensal = getSaldo() * reajuste;
			setSaldo(getSaldo() + this.reajusteMensal);
		}
	}

	public String toString() {
		return "toString ContaPoupanca";

	}

	public double getReajusteMensal() {
		return reajusteMensal;
	}

	public void setReajusteMensal(double reajusteMensal) {
		this.reajusteMensal = reajusteMensal;
	}

	public void executarMenu() {
		String menuOpcoes[] = { "Consultar Saldo", "Depositar", "Sacar", "Atualizar Saldo", "Voltar" };
		setOpcao(JOptionPane.showOptionDialog(null, "Escolha uma ação:", " Java's Bank - Conta Poupança", 0,
				JOptionPane.QUESTION_MESSAGE, null, menuOpcoes, menuOpcoes[0]));
	}

	private void setOpcao(int showOptionDialog) {

	}

}
