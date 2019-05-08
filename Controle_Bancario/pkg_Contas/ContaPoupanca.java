package pkg_Contas;

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
		return "ContaPoupanca toString()";

	}

	public double getReajusteMensal() {
		return reajusteMensal;

	}

	public void setReajusteMensal(double reajusteMensal) {
		this.reajusteMensal = reajusteMensal;
	}

}
