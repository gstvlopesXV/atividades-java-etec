package Controle_Bancario;

import javax.swing.JOptionPane;

public class ContaCorrente extends Conta {

	private double limiteEspecial;

	public void depositar(double valor) {

	}

	public void sacar(double valor) throws NullPointerException {

		if (valor < limiteEspecial) {
			throw new NullPointerException("Erro ContaCorrente.sacar , valor ultrapassou limiteEspecial(-800)");

		} else if (valor <= 0) {
			throw new NullPointerException("Erro ContaCorrente.sacar , valor recebido menor ou igual a zero");
		}
	}

	public void atualizarSaldo() {

	}

	public String toString() {
		return "toString ContaCorrente";
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public void executarMenu() {
		String menuOpcoes[] = { "Consultar Saldo", "Depositar", "Sacar", "Atualizar Saldo", "Voltar" };
		setOpcao(JOptionPane.showOptionDialog(null, "Escolha uma ação:", " Java's Bank - Conta Corrente", 0,
				JOptionPane.QUESTION_MESSAGE, null, menuOpcoes, menuOpcoes[0]));
	}

	private void setOpcao(int showOptionDialog) {

	}

}
