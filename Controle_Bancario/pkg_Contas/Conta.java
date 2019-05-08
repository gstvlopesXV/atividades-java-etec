package pkg_Contas;

public class Conta {

	private double saldo;

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;

		if (valor <= 0) {
			throw new NullPointerException();
		}
	}

	public void sacar(double valor) {
		this.saldo = this.saldo - valor;

		if (this.saldo <= 0) {
			throw new NullPointerException();

		}
		if(valor > this.saldo) {
			throw new NullPointerException();
		}
		

	}

	public void atualizarSaldo() {
		if (this.saldo < 0) {
			this.saldo = this.saldo - (this.saldo * 0.08);

		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
