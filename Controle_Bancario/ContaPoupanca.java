package Controle_Bancario;

public class ContaPoupanca extends Conta {

	private double reajusteMensal;

	public void atualizarSaldo(double reajuste) {
		if (reajuste <= 0) {
			throw new NullPointerException();
		}

		if (getSaldo() >= 0) {
			this.reajusteMensal = getSaldo() * reajuste; // PORCENTAGEM REAJUSTE (0.01 = 1%)
			setSaldo(getSaldo() + this.reajusteMensal); // RENDIMENTO DA POUPANÇA
		}
	}

	public String toString() {
		return "*Conta -> ContaPoupanca*\n atualizarSaldo(reajuste) \n";

	}

	public double getReajusteMensal() {
		return reajusteMensal;
	}

	public void setReajusteMensal(double reajusteMensal) {
		this.reajusteMensal = reajusteMensal;
	}

}
